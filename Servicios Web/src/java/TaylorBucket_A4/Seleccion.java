package TaylorBucket_A4;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Seleccion extends SubAlgoritmos
{
    ArrayList ordenar(ArrayList<ArrayList> listaGeneral)
    {
        int min;
        ArrayList<BigDecimal> casActual;
        
        for (int cont = 0; cont < listaGeneral.size(); cont++)
        {
            casActual = listaGeneral.get(cont);

            for (int i = 0; i < casActual.size() - 1; i++)
            {
                min = i;

                for (int j = i + 1; j < casActual.size(); j++)
                {
                    if (casActual.get(j).compareTo(casActual.get(min)) == -1)
                    {
                        min = j;
                    }
                }

                if (i != min)
                {
                    BigDecimal aux = casActual.get(i);
                    casActual.set(i, casActual.get(min));
                    casActual.set(min, aux);
                }
            }
        }

        return listaGeneral;
    }
}