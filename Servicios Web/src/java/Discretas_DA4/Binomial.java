package Discretas_DA4;

public class Binomial extends PVariable
{
    double[] calcular(int repeticiones)
    {
        p = 0.5;
        q = 1 - p;
        double valorBinomial;
        double[] valores_rn = new double[repeticiones];
        Combinacion c = new Combinacion();

        for (int i = 0; i < repeticiones; i++, k++)
        {
            valorBinomial = c.calcular(new double[]{n, k}) * Math.pow(p, k) * Math.pow(q, n - k);
            valores_rn[i] = valorBinomial;
        }

        return valores_rn;
    }
}