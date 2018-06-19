package Discretas_FA4;

public class HipGeometrica extends PFija
{
    float[] calcular(int repeticiones)
    {
        float hiperGeom;
        float[] valores_rn = new float[repeticiones];
        Combinacion c = new Combinacion();

        for (int i = 0; i < repeticiones; i++, k++)
        {
            hiperGeom = (c.calcular(a, k) * c.calcular(N - a, n - k)) / c.calcular(N, n);
            valores_rn[i] = hiperGeom;
        }

        return valores_rn;
    }
}