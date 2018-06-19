package Discretas_FA3;

public class DPFija extends IFija
{
    private final int repeticiones;

    public DPFija(int total)
    {
        repeticiones = total;
    }

    float[] poisson()
    {
        float valorPoisson;
        float[] valores_rn = new float[repeticiones];
        Operaciones op = new Operaciones();

        for (int i = 0; i < repeticiones; i++, k++)
        {
            valorPoisson = (float) (Math.pow(e, landa * -1) * (Math.pow(landa, k) / op.factorial(k)));
            valores_rn[i] = valorPoisson;
        }

        return valores_rn;
    }

    float[] hipergeometrica()
    {
        k = 0;
        float hiperGeom;
        float[] valores_rn = new float[repeticiones];
        Operaciones op = new Operaciones();

        for (int i = 0; i < repeticiones; i++, k++)
        {
            hiperGeom = ((op.combinacion(a, k)) * (op.combinacion(N - a, n - k))) / op.combinacion(N, n);
            valores_rn[i] = (float) hiperGeom;
        }

        return valores_rn;
    }

    float[] multinomial()
    {
        n = 4;
        float multinomial;
        float[] valores_rn = new float[repeticiones];
        Operaciones op = new Operaciones();

        for (int i = 0; i < repeticiones; i++, n += 0.5)
        {
            a = (op.factorial(n) / (op.factorial(X1) * op.factorial(X2) * op.factorial(X3)));
            b = (float) (Math.pow(P1, X1) * Math.pow(P2, X2) * Math.pow(P3, X3));
            multinomial = a * b;
            valores_rn[i] = multinomial;
        }

        return valores_rn;
    }

    float[] uniformeDiscreta()
    {
        a = 5;
        b = 10;
        x = 5;
        float uniforme;
        float[] valores_rn = new float[repeticiones];

        for (int i = 0; i < repeticiones; i++, x += 0.5)
        {
            if (x > a && x < b)
            {
                uniforme = 1 / (b - a);
                valores_rn[i] = uniforme;
            }
            else
            {
                valores_rn[i] = 0;
            }
        }

        return valores_rn;
    }
}