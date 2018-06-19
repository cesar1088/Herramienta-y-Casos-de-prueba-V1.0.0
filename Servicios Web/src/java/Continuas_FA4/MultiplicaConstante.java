package Continuas_FA4;

public class MultiplicaConstante extends NoCongruenciales
{
    float[] calcular(int repeticiones)
    {
        int temp = 3;
        float D, Y0, alObtenido;
        float[] rn = new float[repeticiones];
        ValoresMedios vm = new ValoresMedios();
        
        for (int i = 0; i < repeticiones; i++)
        {
            D = 2;
            Y0 = temp * (int) X0;
            alObtenido = vm.calcular(Y0, D);
            X0 = (int) alObtenido;
            alObtenido = (float) (alObtenido / Math.pow(10, D));
            rn[i] = alObtenido * 10;
        }

        return rn;
    }
}