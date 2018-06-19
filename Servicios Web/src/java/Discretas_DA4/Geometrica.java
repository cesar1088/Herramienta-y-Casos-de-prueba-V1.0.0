package Discretas_DA4;

public class Geometrica extends PVariable
{
    public double[] calcular(int repeticiones)
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
}