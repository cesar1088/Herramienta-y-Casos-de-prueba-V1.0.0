package Continuas_DA4;

public class Gamma implements Distribuciones
{
    public double[] calcular(int index, int repeticiones)
    {
        double x, num, den, rn;
        ObtenerK gx = new ObtenerK();
        GammaFuncion gf = new GammaFuncion();
        double[] generadosX = gx.generar(index, repeticiones);
        double[] valores_rn = new double[repeticiones];

        for (int i = 0; i < repeticiones; i++)
        {
            x = generadosX[i];
            num = Math.pow(x, alphaGamma - 1);
            den = gf.calcular(alphaGamma) * Math.pow(betaGamma, alphaGamma);
            rn = (num / den) * Math.pow(Math.E, -x / betaGamma);
            valores_rn[i] = rn;
        }

        return valores_rn;
    }
}