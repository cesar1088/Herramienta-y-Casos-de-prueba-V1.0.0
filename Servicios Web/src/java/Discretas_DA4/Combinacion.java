package Discretas_DA4;

public class Combinacion extends Estadisticos
{
    double calcular(double[] valores)
    {
        Factorial f = new Factorial();

        double numerador = f.calcular(new double[]{valores[0]});
        double denominador = f.calcular(new double[]{valores[1]}) * f.calcular(new double[]{valores[0] - valores[1]});
        double resultado = numerador / denominador;

        return resultado;
    }
}