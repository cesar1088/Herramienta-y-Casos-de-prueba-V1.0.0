package Discretas_DA4;

public class BinomialNegativo extends PVariable
{
    double[] calcular(int repeticiones)
    {
        p = 0.7;
        q = 0.3;
        double temp, contador, binomialNeg;
        double[] valores_rn = new double[repeticiones];
        Combinacion c = new Combinacion();

        for (int i = 0; i < repeticiones; i++)
        {
            temp = i;
            contador = r;

            while (temp > 1) {
                contador += r;
                temp--;
            }

            k = contador + i;

            binomialNeg = c.calcular(new double[]{k - 1, r - 1}) * Math.pow(p, r) * Math.pow(q, k - r);
            valores_rn[i] = binomialNeg;
        }

        return valores_rn;
    }
}