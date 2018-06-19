package Continuas_FA4;

public class Gamma implements Distribuciones
{
    public float[] calcular(int index, int repeticiones)
    {
        float x, num, den, rn;
        float[] generadosX = new ObtenerK().generar(index, repeticiones);
        float[] valores_rn = new float[repeticiones];
        GammaFuncion gf = new GammaFuncion();

        for (int i = 0; i < repeticiones; i++)
        {
            x = generadosX[i];
            num = (float) Math.pow(x, alphaGamma - 1);
            den = (float) (gf.calcular(alphaGamma) * Math.pow(betaGamma, alphaGamma));
            rn = (float) ((num / den) * Math.pow(Math.E, -x / betaGamma));
            valores_rn[i] = rn;
        }

        return valores_rn;
    }
}