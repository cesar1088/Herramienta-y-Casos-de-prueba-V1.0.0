package Continuas_DA4;

public class ProductosMedios extends NoCongruenciales
{
    double[] calcular(int repeticiones)
    {
        double D, Y0, alObtenido;
        double[] rn = new double[repeticiones];
        ValoresMedios vm = new ValoresMedios();

        for (int i = 0; i < repeticiones; i++)
        {
            D = 4;
            Y0 = (int) X0 * (int) X1;
            alObtenido = vm.calcular(Y0, D);
            X1 = (int) alObtenido;
            X0 = X1;
            alObtenido = alObtenido / Math.pow(10, D);
            rn[i] = alObtenido * 10;
        }

        return rn;
    }
}