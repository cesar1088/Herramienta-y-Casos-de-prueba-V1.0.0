package Discretas_FA3;

public class Operaciones
{
    float combinacion(float n, float r)
    {
        float numerador = factorial(n);
        float denominador = factorial(r) * factorial(n - r);
        float resultado = numerador / denominador;

        return resultado;
    }

    float factorial(float valor)
    {
        float n = 1;

        for (int i = 1; i <= valor; i++)
        {
            n = n * i;
        }

        return n;
    }
}