package Discretas_DA4;

public class HiperGeometrica extends PFija
{
    double[] calcular(int repeticiones)
    {
        double hiperGeom;
        double[] valores_rn = new double[repeticiones];
        Combinacion c = new Combinacion();

        for (int i = 0; i < repeticiones; i++, k++)
        {
            hiperGeom = (c.calcular(new double[]{a, k}) * c.calcular(new double[]{N - a, n - k})) / c.calcular(new double[]{N, n});
            valores_rn[i] = hiperGeom;
        }

        return valores_rn;
    }
}