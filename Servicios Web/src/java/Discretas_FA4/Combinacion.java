package Discretas_FA4;

public class Combinacion extends Estadisticos
{
    float calcular(float n, float r)
    {
        Factorial f = new Factorial();

        float numerador = f.calcular(n, 0);
        float denominador = f.calcular(r, 0) * f.calcular(n - r, 0);
        float resultado = numerador / denominador;

        return resultado;
    }
}