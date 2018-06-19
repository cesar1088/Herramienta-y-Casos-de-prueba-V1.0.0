package Continuas_DA4;

public class GammaFuncion
{
    double calcular(double alpha)
    {
        return new Factorial().calcular(alpha - 1);
    }
}