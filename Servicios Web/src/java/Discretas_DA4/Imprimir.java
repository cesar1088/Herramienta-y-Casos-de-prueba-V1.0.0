package Discretas_DA4;

public class Imprimir
{
    void imprime(double[] valores)
    {
        for (int i = 0; i < valores.length; i++)
        {
            System.out.println("x" + i + ": " + valores[i]);
        }
    }
}