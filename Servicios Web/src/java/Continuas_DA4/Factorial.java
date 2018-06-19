package Continuas_DA4;

public class Factorial
{
    double calcular(double valor)
    {
        double n = 1;

        for (int i = 1; i <= valor; i++)
        {
            n = n * i;
        }

        return n;
    }
}