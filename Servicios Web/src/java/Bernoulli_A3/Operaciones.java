package Bernoulli_A3;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.ArrayList;

public class Operaciones
{
    void imprimir(ArrayList numeros)
    {
        Iterator<Fraccion> iterador = numeros.listIterator();
        Fraccion actual;
        int i = 0;

        while (iterador.hasNext())
        {
            actual = iterador.next();
            System.out.println("B" + i + ": " + actual.NUM + "/" + actual.DEN);
            i++;
        }
    }
    
    Fraccion combinacion(int n, int r)
    {
        BigInteger dividendo = factorial(n);
        BigInteger divisor = factorial(r).multiply(factorial(n - r));

        return new Fraccion(dividendo, divisor);
    }

    private BigInteger factorial(int valor)
    {
        BigInteger n = BigInteger.ONE;

        for (int i = 1; i <= valor; i++)
        {
            n = n.multiply(BigInteger.valueOf(i));
        }

        return n;
    }
}