package Continuas_DA4;

public class Aditivo extends Congruenciales
{
    double[] calcular(int repeticiones)
    {
        double rn;
        double xi = valoresX[valoresX.length - 1];
        int posicion = 0;
        double[] valores_rn = new double[repeticiones];

        for (int i = 0; i < repeticiones; i++)
        {
            if (i < valoresX.length)
            {
                rn = (xi + valoresX[i]) % m;
                xi = (int) rn;
                rn = (rn / m) * 10;
                valores_rn[i] = rn;
            }
            else
            {
                rn = (xi + valores_rn[posicion] * (m - 1)) % m;
                xi = (int) rn;
                rn = (rn / m) * 10;
                valores_rn[i] = rn;
                posicion++;
            }
        }

        return valores_rn;
    }
}