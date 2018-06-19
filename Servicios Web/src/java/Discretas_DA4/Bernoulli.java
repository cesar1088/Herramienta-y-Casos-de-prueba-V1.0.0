package Discretas_DA4;

public class Bernoulli extends PVariable
{
    double[] calcular(int repeticiones)
    {
        p = 0.1666;
        double bernoulli;
        double[] valores_rn = new double[repeticiones];

        for (int i = 0; i < repeticiones; i++, p -= 0.05)
        {
            bernoulli = 1 - p;
            valores_rn[i] = bernoulli;
        }

        return valores_rn;
    }
}