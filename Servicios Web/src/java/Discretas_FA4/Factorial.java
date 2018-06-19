package Discretas_FA4;

public class Factorial extends Estadisticos
{
    float calcular(float valor, float nul)
    {
        float n = 1;

        for (int i = 1; i <= valor; i++)
        {
            n = n * i;
        }

        return n;
    }
}