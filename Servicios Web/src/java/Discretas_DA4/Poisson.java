package Discretas_DA4;

public class Poisson extends PFija
{
    double[] calcular(int repeticiones)
    {
        double valorPoisson;
        double[] valores_rn = new double[repeticiones];
        Factorial f = new Factorial();

        for (int i = 0; i < repeticiones; i++, k++)
        {
            valorPoisson = (Math.pow(e, landa * -1) * (Math.pow(landa, k) / f.calcular(new double[]{k})));
            valores_rn[i] = valorPoisson;
        }

        return valores_rn;
    }
}