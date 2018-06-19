package Continuas_DA4;

public class NoLineal extends Congruenciales
{
    double[] calcular(int repeticiones)
    {
        double rn;
        double[] valores_rn = new double[repeticiones];

        for (int i = 0; i < repeticiones; i++)
        {
            rn = ((a * Math.pow(X0, 2)) + (b * X0) + c) % m;
            X0 = (int) rn;
            rn = (rn / m) * 10;
            valores_rn[i] = rn;
        }

        return valores_rn;
    }
}