package Discretas_DA3;

public class Operaciones
{
    double combinacion(double n, double r)
    {
        double numerador = factorial(n);
        double denominador = factorial(r) * factorial(n - r);
        double resultado = numerador / denominador;

        return resultado;
    }

    double factorial(double valor)
    {
        double n = 1;

        for (int i = 1; i <= valor; i++)
        {
            n = n * i;
        }

        return n;
    }
}