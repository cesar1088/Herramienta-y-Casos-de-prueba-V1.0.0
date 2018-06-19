package TaylorBucket_A3;

import java.math.BigInteger;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Operaciones
{
    private final int total;
    private final int numCasilleros;
    private final int subAlgoritmo;

    public Operaciones(int taylor, int casilleros, int algoritmo)
    {
        total = taylor;
        numCasilleros = casilleros;
        subAlgoritmo = algoritmo;
    }

    private BigInteger factorial(int valor)
    {
        BigInteger n = BigInteger.ONE;

        for (int i = 1; i <= valor; i++)
        {
            n = n.multiply(BigInteger.valueOf(i));
        }

        return n;
    }

    public ArrayList taylorSeno()
    {
        ArrayList<BigDecimal> lista = new ArrayList<BigDecimal>();
        BigDecimal valor, numerador, denominador, resultado, multiplicador;

        for (int i = 0; i <= total; i++)
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

        for (int i = 0; i < lista.size(); i++) //menor
        {
            if (lista.get(i).compareTo(min) == -1)
            {
                min = lista.get(i);
            }

            if (lista.get(i).compareTo(max) == 1) //mayor
            {
                max = lista.get(i);
            }
        }

        ArrayList valores = new ArrayList();
        valores.add(min); // minimo
        valores.add(max); // maximo
        valores.add(max.subtract(min).abs()); //Calcula el rango de valores

        return valores;
    }

    public void bucketSort(ArrayList<BigDecimal> entrada)
    {
        BigDecimal min = limites(entrada).get(0);
        BigDecimal rango = limites(entrada).get(2);
        BigInteger tamCasillero = rango.divide(new BigDecimal(numCasilleros), 1, RoundingMode.DOWN).toBigInteger();
        ArrayList<ArrayList> listas = new ArrayList<ArrayList>();

        for (int i = 0; i <= numCasilleros; i++) // Se crean los casilleros
        {
            listas.add(new ArrayList<BigDecimal>());
        }

        for (int i = 0; i < entrada.size(); i++) //se agrega cada valor al casillero correspondiente
        {
            BigInteger casillero = entrada.get(i).toBigInteger().subtract(min.toBigInteger()).divide(tamCasillero);
            ArrayList<BigDecimal> vCasilla = listas.get(casillero.intValue()); 
            vCasilla.add(entrada.get(i));
        }

        switch (subAlgoritmo)
        {
            case 0: //Metodo Burbuja
            {
                Ordenamientos ordena = new Ordenamientos();
                ArrayList listaOrdenada = ordena.burbuja(listas);
                imprimir(listaOrdenada);
            }
            break;

            case 1: //Metodo Burbuja Direccional
            {
                Ordenamientos ordena = new Ordenamientos();
                ArrayList listaOrdenada = ordena.burbujaDireccional(listas);
                imprimir(listaOrdenada);
            }
            break;

            case 2: //Metodo de Inserción
            {
                Ordenamientos ordena = new Ordenamientos();
                ArrayList listaOrdenada = ordena.insercion(listas);
                imprimir(listaOrdenada);
            }
            break;

            case 3: //Metodo de Selección
            {
                Ordenamientos ordena = new Ordenamientos();
                ArrayList listaOrdenada = ordena.seleccion(listas);
                imprimir(listaOrdenada);
            }
            break;
        }
    }

    private void imprimir(ArrayList<ArrayList> listaGeneral)
    {
        ArrayList listaInterna;

        for (int cont = 0; cont < listaGeneral.size(); cont++)
        {
            listaInterna = listaGeneral.get(cont);

            for (int i = 0; i < listaInterna.size(); i++)
            {
                System.out.println(listaInterna.get(i));
            }
        }
    }
}