package Continuas_DA4;

public class CuadradosMedios extends NoCongruenciales
{
    double[] calcular(int repeticiones)
    {
        double D, Y0, alObtenido;
        double[] rn = new double[repeticiones];
        ValoresMedios vm = new ValoresMedios();

        for (int i = 0; i < repeticiones; i++)
        {
            D = 4;
            Y0 = (int) Math.pow(X0, 2);
            alObtenido = vm.calcular(Y0, D);
            X0 = (int) alObtenido;
            alObtenido = alObtenido / Math.pow(10, D);
            rn[i] = alObtenido * 10;
        }

        return rn;
    }
}