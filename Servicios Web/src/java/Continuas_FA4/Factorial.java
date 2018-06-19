package Continuas_FA4;

public class Factorial
{
    float calcular(float valor)
    {
        float n = 1;

        for (int i = 1; i <= valor; i++)
        {
            n = n * i;
        }

        return n;
    }
}