package Discretas_FA4;

public class Binomial extends PVariable
{
    float[] calcular(int repeticiones)
    {  
        p = (float) 0.5;
        q = 1 - p;
        float valorBinomial;
        float[] valores_rn = new float[repeticiones];
        Combinacion c = new Combinacion();

        for (int i = 0; i < repeticiones; i++, k++)
        {
            valorBinomial = (float) (c.calcular(n, k) * Math.pow(p, k) * Math.pow(q, n - k));
            valores_rn[i] = valorBinomial;
        }

        return valores_rn;
    }
}