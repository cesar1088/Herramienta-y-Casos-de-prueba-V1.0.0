package Continuas_DA4;

public class MultiplicaConstante extends NoCongruenciales
{
    double[] calcular(int repeticiones)
    {
        int temp = 3;
        double D, Y0, alObtenido;
        double[] rn = new double[repeticiones];
        ValoresMedios vm = new ValoresMedios();

        for (int i = 0; i < repeticiones; i++)
        {
            D = 2;
            Y0 = temp * (int) X0;
            alObtenido = vm.calcular(Y0, D);
            X0 = (int) alObtenido;
            alObtenido = alObtenido / Math.pow(10, D);
            rn[i] = alObtenido * 10;
        }

        return rn;
    }
}