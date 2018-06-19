package Discretas_DA3;

public class DPVariable extends IVariable
{
    private final int repeticiones;

    public DPVariable(int total)
    {
        repeticiones = total;
    }

    double[] binomial()
    {
        p = 0.5;
        q = 1 - p;
        double valorBinomial;
        double[] valores_rn = new double[repeticiones];
        Operaciones op = new Operaciones();

        for (int i = 0; i < repeticiones; i++, k++)
        {
            valorBinomial = op.combinacion(n, k) * Math.pow(p, k) * Math.pow(q, n - k);
            valores_rn[i] = valorBinomial;
        }

        return valores_rn;
    }

    double[] binomialNegativo()
    {
        r = 3;
        k = 0;
        p = 0.7;
        q = 1 - p;
        double temp, contador, binomialNeg;
        double[] valores_rn = new double[repeticiones];
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

            binomialNeg = (op.combinacion(k - 1, r - 1) * Math.pow(p, r) * Math.pow(q, k - r));
            valores_rn[i] = binomialNeg;
        }

        return valores_rn;
    }

    double[] geometrica()
    {
        p = 0.166666;
        q = 1 - p;
        k = 1;
        double valorGeometrica;
        double[] valores_rn = new double[repeticiones];

        for (int i = 0; i < repeticiones; i++, k++)
        {
            valorGeometrica = p * Math.pow(q, k - 1);
            valores_rn[i] = valorGeometrica;
        }

        return valores_rn;
    }

    double[] bernoulli()
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