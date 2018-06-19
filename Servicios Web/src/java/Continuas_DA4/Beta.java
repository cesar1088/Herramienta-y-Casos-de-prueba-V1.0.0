package Continuas_DA4;

public class Beta implements Distribuciones
{
    public double[] calcular(int index, int repeticiones)
    {
        double x, num, den, rn;
        double[] generadosX = new ObtenerK().generar(index, repeticiones);
        double[] valores_rn = new double[repeticiones];
        BetaFuncion bf = new BetaFuncion();

        for (int i = 0; i < repeticiones; i++)
        {
            x = generadosX[i];
            num = 1;
            den = bf.calcular(alphaBeta, betaBeta);
            rn = (num / den) * Math.pow(x, alphaBeta - 1) * (1 - x);
            valores_rn[i] = rn;
        }

        return valores_rn;
    }
}