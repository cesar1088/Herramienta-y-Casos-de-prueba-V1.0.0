package Continuas_FA3;

public class Congruenciales implements ICongruenciales
{
    float[] lineal(int repeticiones, float X0)
    {
        float rn;
        float[] valores_rn = new float[repeticiones];
        
        for (int i = 0; i < repeticiones; i++)
        {
            rn = (a * X0 + b) % m;
            X0 = (int) rn;
            rn = (rn / m) * 10;
            valores_rn[i] = rn;
        }

        return valores_rn;
    }

    float[] noLineal(int repeticiones, float X0)
    {
        float rn;
        float[] valores_rn = new float[repeticiones];
        
        for (int i = 0; i < repeticiones; i++)
        {
            rn = (float) (((a * Math.pow(X0, 2)) + (b * X0) + c) % m);
            X0 = (int) rn;
            rn = (rn / m) * 10;
            valores_rn[i] = rn;
        }

        return valores_rn;
    }

    float[] aditivo(int repeticiones, float[] valoresX)
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

    float[] multiplicativo(int repeticiones, float X0)
    {
        float rn;
        float[] valores_rn = new float[repeticiones];
        
        for (int i = 0; i < repeticiones; i++)
        {
            rn = (a * X0 + c) % m;
            X0 = rn;
            rn = (rn / m) * 10;
            valores_rn[i] = rn;
        }

        return valores_rn;
    }
}