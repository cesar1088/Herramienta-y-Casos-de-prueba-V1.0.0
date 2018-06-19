package Discretas_FA4;

public class UDiscreta extends PFija
{
    float[] calcular(int repeticiones)
    {
        a = 5;
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