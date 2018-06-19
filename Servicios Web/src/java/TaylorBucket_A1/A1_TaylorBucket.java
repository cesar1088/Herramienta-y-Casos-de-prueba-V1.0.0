/*-----------------------------------------------------------------------------
| Caso de Prueba #3: Ordenamiento de Series de Taylor mediante BucketSort (A1) |
| Version: 1.0    Fecha: Enero del 2013                                        |
| Autor: ISC. Luis César Guadarrama Rogel email: cesarguadarrama@cenidet.edu.mx|
-------------------------------------------------------------------------------
| El ordenamiento de las series de Taylor tiene 3 pasos:                       |
| 1: Se genera la serie de Taylor a ordenar                                    |
| 2: Se invoca al algoritmo BucketSort el cual cada uno de los casilleros      |
| 3: Se invoca al subalgoritmo para ordenar cada uno de los datos almacenados  |
------------------------------------------------------------------------------*/
package TaylorBucket_A1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService()
public class A1_TaylorBucket
{
    @WebMethod(operationName = "peticionTaylorBucketA1")
    public double peticionTaylorBucketA1(
    @WebParam(name = "total") int total,
    @WebParam(name = "totalCasilleros") int totalCasilleros,
    @WebParam(name = "subAlgoritmo") int subAlgoritmo)
    {
        long tiempoInicio = System.currentTimeMillis();

        try
        {
            ArrayList<BigDecimal> serieTaylor = new ArrayList<BigDecimal>();

            //Paso 1: Se inicia generando la sucesión Taylor-Seno

            int numDecimales = 100;
            BigDecimal valor, numerador, denominador, resultado, multiplicador;

            for (int i = 0; i <= total; i++)
            {
                valor = BigDecimal.ZERO;
                numerador = new BigDecimal("90");
                numerador = numerador.pow(2 * i + 1);

                denominador = BigDecimal.ONE;

                for (int j = 1; j <= (2 * i + 1); j++)
                {
                    denominador = denominador.multiply(BigDecimal.valueOf(j));
                }

                resultado = numerador.divide(denominador, numDecimales, RoundingMode.HALF_UP);
                multiplicador = BigDecimal.ONE.negate();
                multiplicador = multiplicador.pow(i);
                resultado = resultado.multiply(multiplicador);
                valor = valor.add(resultado);

                serieTaylor.add(valor);
            }

            //Paso 2: Inicia el método de ordenamiento Bucket-Sort

            BigDecimal subcasilleros = new BigDecimal(totalCasilleros);
            BigDecimal min = BigDecimal.ZERO;
            BigDecimal max = BigDecimal.ZERO;

            for (int i = 0; i < serieTaylor.size(); i++) //menor
            {
                if (serieTaylor.get(i).compareTo(min) == -1)
                {
                    min = serieTaylor.get(i);
                }

                if (serieTaylor.get(i).compareTo(max) == 1) //mayor
                {
                    max = serieTaylor.get(i);
                }
            }

            ArrayList<BigDecimal> valores = new ArrayList<BigDecimal>();
            valores.add(min); //[0] minimo
            valores.add(max); //[1] maximo
            valores.add(max.subtract(min).abs()); //Calcula el rango de valores

            BigDecimal MIN = valores.get(0);
            BigDecimal RANGO = valores.get(2);
            BigInteger tamCASILLERO = RANGO.divide(subcasilleros, 1, RoundingMode.DOWN).toBigInteger();
            ArrayList<ArrayList> listas = new ArrayList<ArrayList>();

            for (int i = 0; i <= subcasilleros.intValue(); i++) //Se crean los casilleros
            {
                listas.add(new ArrayList<BigDecimal>());
            }

            for (int i = 0; i < serieTaylor.size(); i++) //Se agrega cada valor al casillero correspondiente
            {
                BigInteger casillero = serieTaylor.get(i).toBigInteger().subtract(MIN.toBigInteger()).divide(tamCASILLERO);
                ArrayList vCasilla = listas.get(casillero.intValue());
                vCasilla.add(serieTaylor.get(i));
            }

            //Paso 3: Inicia el método de ordenamiento interno

            switch (subAlgoritmo)
            {
                case 0: //Método Burbuja
                {
                    BigDecimal aux;
                    ArrayList<BigDecimal> casActual;

                    for (int c = 0; c < listas.size(); c++)
                    {
                        casActual = listas.get(c);

                        for (int i = 2; i < casActual.size(); i++)
                        {
                            for (int j = 0; j < casActual.size() - 1; j++)
                            {
                                if (casActual.get(j).compareTo(casActual.get(j + 1)) == 1)
                                {
                                    aux = casActual.get(j);
                                    casActual.set(j, casActual.get(j + 1));
                                    casActual.set(j + 1, aux);
                                }
                            }
                        }
                    }
                }
                break;

                case 1: //Método Burbuja Direccional
                {
                    int izquierda, derecha;
                    BigDecimal aux;
                    ArrayList<BigDecimal> casActual;

                    for (int c = 0; c < listas.size(); c++)
                    {
                        casActual = listas.get(c);
                        izquierda = 1;
                        derecha = casActual.size();

                        do
                        {
                            for (int i = casActual.size() - 1; i > 0; i--)
                            {
                                if (casActual.get(i - 1).compareTo(casActual.get(i)) == 1)
                                {
                                    aux = casActual.get(i);
                                    casActual.set(i, casActual.get(i - 1));
                                    casActual.set(i - 1, aux);
                                }
                            }

                            izquierda = izquierda + 1;

                            for (int j = 1; j < casActual.size(); j++)
                            {
                                if (casActual.get(j - 1).compareTo(casActual.get(j)) == 1)
                                {
                                    aux = casActual.get(j);
                                    casActual.set(j, casActual.get(j - 1));
                                    casActual.set(j - 1, aux);
                                }
                            }
                            derecha = derecha - 1;
                        }
                        while (derecha >= izquierda);
                    }
                }
                break;

                case 2: //Método de Inserción
                {
                    int i, j;
                    BigDecimal tmp;
                    ArrayList<BigDecimal> casActual;

                    for (int c = 0; c < listas.size(); c++)
                    {
                        casActual = listas.get(c);

                        for (i = 1; i < casActual.size(); i++)
                        {
                            j = i;

                            while (j > 0 && casActual.get(j - 1).compareTo(casActual.get(j)) == 1)
                            {
                                tmp = casActual.get(j);
                                casActual.set(j, casActual.get(j - 1));
                                casActual.set(j - 1, tmp);
                                j--;
                            }
                        }
                    }
                }
                break;

                case 3: //Método de Selección
                {
                    int vmin;
                    BigDecimal aux;
                    ArrayList<BigDecimal> casActual;

                    for (int c = 0; c < listas.size(); c++)
                    {
                        casActual = listas.get(c);

                        for (int i = 0; i < casActual.size() - 1; i++)
                        {
                            vmin = i;

                            for (int j = i + 1; j < casActual.size(); j++)
                            {
                                if (casActual.get(j).compareTo(casActual.get(vmin)) == -1)
                                {
                                    vmin = j;
                                }
                            }

                            if (i != vmin)
                            {
                                aux = casActual.get(i);
                                casActual.set(i, casActual.get(vmin));
                                casActual.set(vmin, aux);
                            }
                        }
                    }
                }
                break;
            }

            ArrayList listaInterna;

            for (int cont = 0; cont < listas.size(); cont++) //Imprime la serie de Taylor
            {
                listaInterna = listas.get(cont);

                for (int i = 0; i < listaInterna.size(); i++)
                {
                    System.out.println(listaInterna.get(i));
                }
            }

        }

        catch (Exception ex)
        {
            System.out.println("Error en el Caso de Prueba: Taylor\n" + ex);
        }

        long tiempoFinal = System.currentTimeMillis();
        return (tiempoFinal - tiempoInicio) / 1000.00; //Tiempo de respuesta
    }
}