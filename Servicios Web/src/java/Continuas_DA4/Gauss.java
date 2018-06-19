package Continuas_DA4;

public class Gauss implements Distribuciones
{
    public double[] calcular(int index, int repeticiones)
    {
        double x, num, den, p1, p2, rn;
        double[] generadosX = new ObtenerK().generar(index, repeticiones);
        double[] valores_rn = new double[repeticiones];

        for (int i = 0; i < repeticiones; i++)
        {
            x = generadosX[i];
            num = 1;
            den = Math.sqrt(2 * Math.PI) * varianza;
            p1 = Math.pow(x - u, 2) * -1;
            p2 = (2 * Math.pow(varianza, 2));
            rn = (num / den) * Math.pow(Math.E, (p1 / p2));
            valores_rn[i] = rn;
        }

        return valores_rn;
    }
}