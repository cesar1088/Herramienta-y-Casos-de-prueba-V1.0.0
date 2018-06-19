package Continuas_FA4;

public class Lineal extends Congruenciales
{
    float[] calcular(int repeticiones)
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
}