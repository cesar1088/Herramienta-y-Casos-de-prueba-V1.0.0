package Continuas_FA4;

public class Gauss implements Distribuciones
{
    public float[] calcular(int index, int repeticiones)
    {
        float x, num, den, p1, p2;
        float[] generadosX = new ObtenerK().generar(index, repeticiones);
        float[] valores_rn = new float[repeticiones];

        for (int i = 0; i < repeticiones; i++)
        {
            x = generadosX[i];
            num = 1;
            den = (float) Math.sqrt(2 * Math.PI) * varianza;
            p1 = (float) Math.pow(x - u, 2) * -1;
            p2 = (float) (2 * Math.pow(varianza, 2));
            float rn = (float) ((num / den) * Math.pow(Math.E, (p1 / p2)));
            valores_rn[i] = rn;
        }

        return valores_rn;
    }
}