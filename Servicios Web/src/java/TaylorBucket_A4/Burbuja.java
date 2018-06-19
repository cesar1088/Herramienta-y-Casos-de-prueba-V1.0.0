package TaylorBucket_A4;

import java.util.ArrayList;
import java.math.BigDecimal;

public class Burbuja extends SubAlgoritmos
{
    ArrayList ordenar(ArrayList<ArrayList> listaGeneral)
    {
        BigDecimal aux;
        ArrayList<BigDecimal> casActual;
        
        for (int cont = 0; cont < listaGeneral.size(); cont++)
        {
            casActual = listaGeneral.get(cont);
           
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

        return listaGeneral;
    }
}