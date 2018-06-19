package Bernoulli_A4;

import java.math.BigInteger;

public class Factorial
{
    BigInteger calcular(int valor)
    {
        BigInteger n = BigInteger.ONE;

        for (int i = 1; i <= valor; i++)
        {
            n = n.multiply(BigInteger.valueOf(i));
        }

        return n;
    }
}