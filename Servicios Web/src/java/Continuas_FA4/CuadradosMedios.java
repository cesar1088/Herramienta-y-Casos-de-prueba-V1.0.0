package Continuas_FA4;

public class CuadradosMedios extends NoCongruenciales
{
    float[] calcular(int repeticiones)
    {
        float D, Y0, alObtenido;
        float[] rn = new float[repeticiones];
        ValoresMedios vm = new ValoresMedios();

        for (int i = 0; i < repeticiones; i++)
        {
            D = 4;
            Y0 = (int) Math.pow(X0, 2);
            alObtenido = vm.calcular(Y0, D);
            X0 = (int) alObtenido;
            alObtenido = (float) (alObtenido / Math.pow(10, D));
            rn[i] = alObtenido * 10;
        }

        return rn;
    }
}