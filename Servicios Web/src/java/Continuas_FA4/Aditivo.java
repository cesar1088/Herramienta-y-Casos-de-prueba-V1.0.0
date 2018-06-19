package Continuas_FA4;

public class Aditivo extends Congruenciales
{
    float[] calcular(int repeticiones)
    {
        int posicion = 0;
        float rn;
        float xi = valoresX[valoresX.length - 1];
        float[] valores_rn = new float[repeticiones];

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