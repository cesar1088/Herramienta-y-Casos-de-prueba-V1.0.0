package Continuas_FA4;

public class ProductosMedios extends NoCongruenciales
{
    float[] calcular(int repeticiones)
    {
        float D, Y0, alObtenido;
        float[] rn = new float[repeticiones];

        ValoresMedios vm = new ValoresMedios();

        for (int i = 0; i < repeticiones; i++)
        {
            D = 4;
            Y0 = (int) X0 * (int) X1;
            alObtenido = vm.calcular(Y0, D);
            X1 = (int) alObtenido;
            X0 = X1;
            alObtenido = (float) (alObtenido / Math.pow(10, D));
            rn[i] = alObtenido * 10;
        }

        return rn;
    }
}