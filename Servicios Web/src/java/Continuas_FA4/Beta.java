package Continuas_FA4;

public class Beta implements Distribuciones
{
    public float[] calcular(int index, int repeticiones)
    {
        float x, num, den, rn;
        float[] generadosX = new ObtenerK().generar(index, repeticiones);
        BetaFuncion bf = new BetaFuncion();
        float[] valores_rn = new float[repeticiones];

        for (int i = 0; i < repeticiones; i++)
        {
            x = generadosX[i];
            num = 1;
            den = bf.calcular(alphaBeta, betaBeta);
            rn = (float) ((num / den) * Math.pow(x, alphaBeta - 1) * (1 - x));
            valores_rn[i] = rn;
        }

        return valores_rn;
    }
}