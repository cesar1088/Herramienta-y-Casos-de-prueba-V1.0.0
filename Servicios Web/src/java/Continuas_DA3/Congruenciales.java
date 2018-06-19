package Continuas_DA3;

public class Congruenciales implements ICongruenciales
{
    double[] lineal(int repeticiones, double X0)
    {
        double rn;
        double[] valores_rn = new double[repeticiones];
        
        for (int i = 0; i < repeticiones; i++)
        {
            rn = (a * X0 + b) % m;
            X0 = (int) rn;
            rn = (rn / m) * 10;
            valores_rn[i] = rn;
        }

        return valores_rn;
    }

    double[] noLineal(int repeticiones, double X0)
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

    double[] aditivo(int repeticiones, double[] valoresX)
    {
        int posicion = 0;
        double rn;
        double xi = valoresX[valoresX.length - 1];
        double[] valores_rn = new double[repeticiones];

        for (int i = 0; i < repeticiones; i++)
        {
            if (i < valoresX.length)
            {
                rn = (xi + valoresX[i]) % m;
                xi = (int) rn;
                rn = (rn / m) * 10;
                valores_rn[i] = rn;
            } 
            else
            {
                rn = (xi + valores_rn[posicion] * (m - 1)) % m;
                xi = (int) rn;
                rn = (rn / m) * 10;
                valores_rn[i] = rn;
                posicion++;
            }
        }

        return valores_rn;
    }

    double[] multiplicativo(int repeticiones, double X0)
    {
        double rn;
        double[] valores_rn = new double[repeticiones];
        
        for (int i = 0; i < repeticiones; i++)
        {
            rn = (a * X0 + c) % m;
            X0 = rn;
            rn = (rn / m) * 10;
            valores_rn[i] = rn;
        }

        return valores_rn;
    }
}