package Discretas_FA4;

public class Bernoulli extends PVariable
{
    float[] calcular(int repeticiones)
    {
        p = (float) 0.1666;
        float bernoulli;
        float[] valores_rn = new float[repeticiones];

        for (int i = 0; i < repeticiones; i++, p -= 0.05)
        {
            bernoulli = 1 - p;
            valores_rn[i] = bernoulli;
        }

        return valores_rn;
    }
}