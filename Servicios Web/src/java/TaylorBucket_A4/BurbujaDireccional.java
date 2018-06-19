package TaylorBucket_A4;

import java.math.BigDecimal;
import java.util.ArrayList;

public class BurbujaDireccional extends SubAlgoritmos
{
    ArrayList ordenar(ArrayList<ArrayList> listaGeneral)
    {
        int izquierda, derecha;
        BigDecimal aux;
        ArrayList<BigDecimal> casActual;

        for (int cont = 0; cont < listaGeneral.size(); cont++)
        {
            casActual = listaGeneral.get(cont);
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

        return listaGeneral;
    }
}