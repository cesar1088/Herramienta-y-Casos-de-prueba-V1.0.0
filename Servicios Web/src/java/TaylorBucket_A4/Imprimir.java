package TaylorBucket_A4;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Imprimir
{
    void imprimir(ArrayList<ArrayList> listaGeneral)
    {
        ArrayList<BigDecimal> listaInterna;

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