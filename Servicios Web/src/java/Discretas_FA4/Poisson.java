package Discretas_FA4;

public class Poisson extends PFija
{
    float[] calcular(int repeticiones)
    {
        float valorPoisson;
        float[] valores_rn = new float[repeticiones];
        Factorial f = new Factorial();

        for (int i = 0; i < repeticiones; i++, k++)
        {
            valorPoisson = (float) (Math.pow(e, landa * -1) * (Math.pow(landa, k) / f.calcular(k, 0)));
            valores_rn[i] = valorPoisson;
        }

        return valores_rn;
    }
}