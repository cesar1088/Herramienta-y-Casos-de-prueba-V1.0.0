package TaylorBucket_A4;

import java.util.ArrayList;
import java.math.BigDecimal;

public class Limites
{
    ArrayList<BigDecimal> obtenerRangoLimites(ArrayList<BigDecimal> lista) 
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
        valores.add(min); //minimo
        valores.add(max); //maximo
        valores.add(max.subtract(min).abs()); //Calcula el rando de valores

        return valores;
    }
}