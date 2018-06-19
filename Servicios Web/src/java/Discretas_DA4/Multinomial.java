package Discretas_DA4;

public class Multinomial extends PFija
{
    double[] calcular(int repeticiones)
    {
        n = 4;
        double  multinomial;
        double[] valores_rn = new double[repeticiones];
        Factorial f = new Factorial();

        for (int i = 0; i < repeticiones; i++, n += 0.5)
        {
            a = f.calcular(new double[]{n}) / (f.calcular(new double[]{X1}) * f.calcular(new double[]{X2}) * f.calcular(new double[]{X3}));
            b = (Math.pow(P1, X1) * Math.pow(P2, X2) * Math.pow(P3, X3));
            multinomial = a * b;
            valores_rn[i] = multinomial;
        }

        return valores_rn;
    }
}