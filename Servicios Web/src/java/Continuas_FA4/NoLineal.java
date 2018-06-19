package Continuas_FA4;

public class NoLineal extends Congruenciales
{
    float[] calcular(int repeticiones)
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
}