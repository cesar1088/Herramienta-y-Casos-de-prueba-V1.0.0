package Discretas_FA4;

public class BinomialNeg extends PVariable
{
    float[] calcular(int repeticiones)
    {
        p = (float) 0.7;
        q = (float) 0.3;
        float temp, contador, binomialNeg;
        float[] valores_rn = new float[repeticiones];
        Combinacion c = new Combinacion();

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

            binomialNeg = (float) (c.calcular(k - 1, r - 1) * Math.pow(p, r) * Math.pow(q, k - r));
            valores_rn[i] = binomialNeg;
        }

        return valores_rn;
    }
}