package Discretas_FA4;

public class Multinomial extends PFija
{
    float[] calcular(int repeticiones)
    {
        n = 4;
        float multinomial;
        float[] valores_rn = new float[repeticiones];
        Factorial f = new Factorial();

        for (int i = 0; i < repeticiones; i++, n += 0.5)
        {
            a = f.calcular(n, 0) / (f.calcular(X1, 0) * f.calcular(X2, 0) * f.calcular(X3, 0));
            b = (float) (Math.pow(P1, X1) * Math.pow(P2, X2) * Math.pow(P3, X3));
            multinomial = a * b;
            valores_rn[i] = multinomial;
        }

        return valores_rn;
    }
}