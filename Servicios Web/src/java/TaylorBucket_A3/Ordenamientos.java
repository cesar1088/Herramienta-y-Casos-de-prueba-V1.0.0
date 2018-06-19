package TaylorBucket_A3;

import java.util.ArrayList;
import java.math.BigDecimal;

public class Ordenamientos
{
    ArrayList burbuja(ArrayList<ArrayList> listaGeneral)
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

    ArrayList burbujaDireccional(ArrayList<ArrayList> listaGeneral)
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

    ArrayList insercion(ArrayList<ArrayList> listaGeneral)
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

    ArrayList seleccion(ArrayList<ArrayList> listaGeneral)
    {
        BigDecimal aux;
        ArrayList<BigDecimal> casActual;
        
        for (int cont = 0; cont < listaGeneral.size(); cont++)
        {
            casActual = listaGeneral.get(cont);

            for (int i = 0; i < casActual.size() - 1; i++)
            {
                int min = i;

                for (int j = i + 1; j < casActual.size(); j++)
                {
                    if (casActual.get(j).compareTo(casActual.get(min)) == -1) 
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
}