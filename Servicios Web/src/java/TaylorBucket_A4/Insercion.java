package TaylorBucket_A4;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Insercion extends SubAlgoritmos
{
    ArrayList ordenar(ArrayList<ArrayList> listaGeneral)
    {
        int i, j;
        BigDecimal tmp;
        ArrayList<BigDecimal> casActual;

        for (int cont = 0; cont < listaGeneral.size(); cont++)
        {
            casActual = listaGeneral.get(cont);

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

        return listaGeneral;
    }
}