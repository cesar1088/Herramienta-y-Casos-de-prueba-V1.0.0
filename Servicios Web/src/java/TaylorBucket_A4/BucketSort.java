package TaylorBucket_A4;

import java.util.ArrayList;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class BucketSort
{
    private final int numCasilleros;
    private final int subAlgoritmo;

    public BucketSort(int casilleros, int algorirmo)
    {
        numCasilleros = casilleros;
        subAlgoritmo = algorirmo;
    }

    void generar(ArrayList<BigDecimal> entrada)
    {
        BigDecimal min = new Limites().obtenerRangoLimites(entrada).get(0);
        BigDecimal rango = new Limites().obtenerRangoLimites(entrada).get(2);
        BigInteger tamCasilleros = rango.divide(new BigDecimal(numCasilleros), 1, RoundingMode.DOWN).toBigInteger();
        ArrayList<ArrayList> listas = new ArrayList<ArrayList>();

        for (int i = 0; i <= numCasilleros; i++) // Se crean los casilleros
        {
            listas.add(new ArrayList<BigDecimal>());
        }

        for (int i = 0; i < entrada.size(); i++) //Se agrega el valor al casillero correspondiente
        {
            BigInteger casillero = entrada.get(i).toBigInteger().subtract(min.toBigInteger()).divide(tamCasilleros);
            ArrayList<BigDecimal> vCasilla = listas.get(casillero.intValue());
            vCasilla.add(entrada.get(i));
        }

        switch (subAlgoritmo)
        {
            case 0: //Metodo Burbuja
            {
                ArrayList listaOrdenada = new Burbuja().ordenar(listas);
                new Imprimir().imprimir(listaOrdenada);
            }
            break;

            case 1: //Metodo Burbuja Direccional
            {
                ArrayList listaOrdenada = new BurbujaDireccional().ordenar(listas);
                new Imprimir().imprimir(listaOrdenada);
            }
            break;

            case 2: //Metodo de Inserción
            {
                ArrayList listaOrdenada = new Insercion().ordenar(listas);
                new Imprimir().imprimir(listaOrdenada);
            }
            break;

            case 3: //Metodo de Selección
            {
                ArrayList listaOrdenada = new Seleccion().ordenar(listas);
                new Imprimir().imprimir(listaOrdenada);
            }
            break;
        }
    }
}