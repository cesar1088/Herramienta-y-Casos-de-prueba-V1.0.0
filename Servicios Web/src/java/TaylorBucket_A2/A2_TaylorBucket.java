/*-----------------------------------------------------------------------------
| Caso de Prueba #3: Ordenamiento de Series de Taylor mediante BucketSort (A2) |
| Version: 1.0    Fecha: Enero del 2013                                        |
| Autor: ISC. Luis César Guadarrama Rogel email: cesarguadarrama@cenidet.edu.mx|
-------------------------------------------------------------------------------
| El ordenamiento de las series de Taylor tiene 3 pasos:                       |
| 1: Se genera la serie de Taylor a ordenar                                    |
| 2: Se invoca al algoritmo BucketSort el cual cada uno de los casilleros      |
| 3: Se invoca al subalgoritmo para ordenar cada uno de los datos almacenados  |
------------------------------------------------------------------------------*/
package TaylorBucket_A2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService()
public class A2_TaylorBucket
{
    private int total;
    private int numCasilleros;
    private int subAlgoritmo;

    @WebMethod(operationName = "peticionTaylorBucketA2")
    public double peticionTaylorBucketA2(
    @WebParam(name = "total") int totalTaylor,
    @WebParam(name = "totalCasilleros") int totalCasilleros,
    @WebParam(name = "subAlgoritmo") int algoritmoInterno)
    {
        total = totalTaylor;
        numCasilleros = totalCasilleros;
        subAlgoritmo = algoritmoInterno;

        long tiempoInicio = System.currentTimeMillis();

        try
        {
            bucketSort(taylorSeno());
        }

        catch(Exception ex)
        {
            System.out.println("Error en el Caso de Prueba: Taylor\n" + ex);
        }

        long tiempoFinal = System.currentTimeMillis();
        return (tiempoFinal - tiempoInicio) / 1000.00; //Tiempo de respuesta
    }

    private BigInteger factorial(int valor)
    {
        BigInteger n = BigInteger.ONE;

        for(int i = 1; i <= valor; i++)
        {
            n = n.multiply(BigInteger.valueOf(i));
        }

        return n;
    }

    private ArrayList taylorSeno()
    {
        BigDecimal valor, numerador, denominador, resultado, multiplicador;
        ArrayList<BigDecimal> lista = new ArrayList<BigDecimal>();

        for(int i = 0; i <= total; i++)
        {
            valor = BigDecimal.ZERO;

            numerador = new BigDecimal("90");
            numerador = numerador.pow(2 * i + 1);
            denominador = new BigDecimal(factorial(2 * i + 1));
            resultado = numerador.divide(denominador, 100, RoundingMode.HALF_UP);

            multiplicador = BigDecimal.ONE.negate();
            multiplicador = multiplicador.pow(i);
            resultado = resultado.multiply(multiplicador);
            valor = valor.add(resultado);

            lista.add(valor);
        }

        return lista;
    }

    private ArrayList<BigDecimal> limites(ArrayList<BigDecimal> lista)
    {
        BigDecimal min = BigDecimal.ZERO;
        BigDecimal max = BigDecimal.ZERO;

        for(int i = 0; i < lista.size(); i++) //menor
        {
            if(lista.get(i).compareTo(min)== -1)
            {
                min = lista.get(i);
            }

            if(lista.get(i).compareTo(max) == 1) //mayor
            {
                max = lista.get(i);
            }
        }

        ArrayList valores = new ArrayList();
        valores.add(min); //[0] minimo
        valores.add(max); //[1] maximo
        valores.add(max.subtract(min).abs()); //Calcula el rango de valores

        return valores;
    }

    private void bucketSort(ArrayList<BigDecimal> entrada)
    {
        BigDecimal min = limites(entrada).get(0);
        BigDecimal rango = limites(entrada).get(2);
        BigInteger tamCasillero = rango.divide(new BigDecimal(numCasilleros), 1, RoundingMode.DOWN).toBigInteger();
        ArrayList<ArrayList> listas = new ArrayList<ArrayList>();

        for(int i = 0; i <= numCasilleros; i++) //Se crean los casilleros
        {
            listas.add(new ArrayList<BigDecimal>());
        }

        for(int i = 0; i < entrada.size(); i++) //Se agrega el valor al casillero correspondiente
        {
            BigInteger casillero = entrada.get(i).toBigInteger().subtract(min.toBigInteger()).divide(tamCasillero);
            ArrayList<BigDecimal> vCasilla = listas.get(casillero.intValue());
            vCasilla.add(entrada.get(i));
        }

        switch(subAlgoritmo)
        {
            case 0: //Método Burbuja
            {
                ArrayList listaOrdenada = burbuja(listas);
                imprimir(listaOrdenada);
            }
            break;

            case 1: //Método Burbuja Direccional
            {
                ArrayList listaOrdenada = burbujaDireccional(listas);
                imprimir(listaOrdenada);
            }
            break;

            case 2: //Método de Inserción
            {
                ArrayList listaOrdenada = insercion(listas);
                imprimir(listaOrdenada);
            }
            break;

            case 3: //Método de Selección
            {
                ArrayList listaOrdenada = seleccion(listas);
                imprimir(listaOrdenada);
            }
            break;
        }
    }

    private ArrayList burbuja(ArrayList<ArrayList> listaGeneral)
    {
        BigDecimal aux;
        ArrayList<BigDecimal> casActual;

        for(int cont = 0; cont < listaGeneral.size(); cont++)
        {
            casActual = listaGeneral.get(cont);

            for(int i = 2; i < casActual.size(); i++)
            {
                for(int j = 0; j < casActual.size() - 1; j++)
                {
                    if(casActual.get(j).compareTo(casActual.get(j + 1)) == 1)
                    {
                        aux = casActual.get(j);
                        casActual.set(j, casActual.get(j + 1));
                        casActual.set(j + 1, aux);
                    }
                }
            }
        }

        return listaGeneral;
    }

    private ArrayList burbujaDireccional(ArrayList<ArrayList> listaGeneral)
    {
        int izquierda, derecha;
        ArrayList<BigDecimal> casActual;

        for(int cont = 0; cont < listaGeneral.size(); cont++)
        {
            casActual = listaGeneral.get(cont);
            izquierda = 1;
            derecha = casActual.size();

            do
            {
                for(int i = casActual.size() - 1; i > 0; i--)
                {
                    if(casActual.get(i - 1).compareTo(casActual.get(i)) == 1)
                    {
                        BigDecimal aux = casActual.get(i);
                        casActual.set(i, casActual.get(i - 1));
                        casActual.set(i - 1, aux);
                    }
                }

                izquierda = izquierda + 1;

                for(int j = 1; j < casActual.size(); j++)
                {
                    if(casActual.get(j - 1).compareTo(casActual.get(j)) == 1)
                    {
                        BigDecimal aux = casActual.get(j);
                        casActual.set(j, casActual.get(j - 1));
                        casActual.set(j - 1, aux);
                    }
                }
                derecha = derecha - 1;
            }
            while(derecha >= izquierda);
        }

        return listaGeneral;
    }

    private ArrayList insercion(ArrayList<ArrayList> listaGeneral)
    {
        int i, j;
        BigDecimal tmp;
        ArrayList<BigDecimal> casActual;

        for(int cont = 0; cont < listaGeneral.size(); cont++)
        {
            casActual = listaGeneral.get(cont);

            for(i = 1; i < casActual.size(); i++)
            {
                j = i;

                while(j > 0 && casActual.get(j - 1).compareTo(casActual.get(j)) == 1)
                {
                    tmp = casActual.get(j);
                    casActual.set(j, casActual.get(j - 1));
                    casActual.set(j - 1, tmp);
                    j--;
                }
            }
        }

        return listaGeneral;
    }

    private ArrayList seleccion(ArrayList<ArrayList> listaGeneral)
    {
        int min;
        BigDecimal aux;
        ArrayList<BigDecimal> casActual;

        for(int cont = 0; cont < listaGeneral.size(); cont++)
        {
            casActual = listaGeneral.get(cont);

            for(int i = 0; i < casActual.size() - 1; i++)
            {
                min = i;

                for(int j = i + 1; j < casActual.size(); j++)
                {
                    if(casActual.get(j).compareTo(casActual.get(min)) == -1)
                    {
                        min = j;
                    }
                }

                if (i != min)
                {
                    aux = casActual.get(i);
                    casActual.set(i, casActual.get(min));
                    casActual.set(min, aux);
                }
            }
        }

        return listaGeneral;
    }

    private void imprimir(ArrayList<ArrayList> listaGeneral)
    {
        ArrayList listaInterna;

        for(int cont = 0; cont < listaGeneral.size(); cont++)
        {
            listaInterna = listaGeneral.get(cont);

            for(int i = 0; i < listaInterna.size(); i++)
            {
                System.out.println(listaInterna.get(i));
            }
        }
    }
}