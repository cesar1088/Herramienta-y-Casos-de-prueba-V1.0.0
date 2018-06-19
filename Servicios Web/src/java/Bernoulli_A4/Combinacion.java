package Bernoulli_A4;

import java.math.BigInteger;

public class Combinacion extends Estadistica
{
    Fraccion calcular(int n, int r)
    {
        BigInteger dividendo = new Factorial().calcular(n);
        BigInteger divisor = new Factorial().calcular(r);
        divisor = divisor.multiply(new Factorial().calcular(n - r));

        return new Fraccion(dividendo, divisor);
    }
}