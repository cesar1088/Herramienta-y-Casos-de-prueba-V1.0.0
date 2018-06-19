package Discretas_DA4;

public class Factorial extends Estadisticos
{
    double calcular(double[] valores)
    {
        double valor = valores[0];
        double n = 1;

        for (int i = 1; i <= valor; i++)
        {
            n = n * i;
        }

        return n;
    }
}