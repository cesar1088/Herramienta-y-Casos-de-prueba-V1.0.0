package Discretas_FA4;

public class Geometrica extends PVariable
{
    float[] calcular(int repeticiones)
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
}