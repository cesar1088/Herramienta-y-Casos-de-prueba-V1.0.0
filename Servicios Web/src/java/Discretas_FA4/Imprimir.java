package Discretas_FA4;

public class Imprimir
{
    void imprime(float[] valores)
    {
        for (int i = 0; i < valores.length; i++)
        {
            System.out.println("x" + i + ": " + valores[i]);
        }
    }
}