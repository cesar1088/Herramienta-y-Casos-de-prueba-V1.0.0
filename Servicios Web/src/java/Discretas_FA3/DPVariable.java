package Discretas_FA3;

public class DPVariable extends IVariable
{
    private final int repeticiones;

    public DPVariable(int total)
    {
        repeticiones = total;
    }

    float[] binomial()
    {
        p = (float) 0.5;
        q = 1 - p;
        float valorBinomial;
        float[] valores_rn = new float[repeticiones];
        Operaciones op = new Operaciones();

        for (int i = 0; i < repeticiones; i++, k++)
        {
            valorBinomial = (float) (op.combinacion(n, k) * Math.pow(p, k) * Math.pow(q, n - k));
            valores_rn[i] = valorBinomial;
        }

        return valores_rn;
    }

    float[] binomialNegativo()
    {
        r = 3;
        k = 0;
        p = (float)0.7;
        q = 1 - p;
        float temp, contador, binomialNeg;
        float[] valores_rn = new float[repeticiones];
        Operaciones op = new Operaciones();

        for (int i = 0; i < repeticiones; i++)
        {
            temp = i;
            contador = r;

            while (temp > 1)
            {
                contador += r;
                temp--;
            }

            k = contador + i;

            binomialNeg = (float) (op.combinacion(k - 1, r - 1) * Math.pow(p, r) * Math.pow(q, k - r));
            valores_rn[i] = binomialNeg;
        }

        return valores_rn;
    }

    float[] geometrica()
    {
        p = (float) 0.166666;
        q = 1 - p;
        k = 1;
        float valorGeometrica;
        float[] valores_rn = new float[repeticiones];

        for (int i = 0; i < repeticiones; i++, k++)
        {
            valorGeometrica = (float) (p * Math.pow(q, k - 1));
            valores_rn[i] = valorGeometrica;
        }

        return valores_rn;
    }

    float[] bernoulli()
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