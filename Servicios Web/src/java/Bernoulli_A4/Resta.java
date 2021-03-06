package Bernoulli_A4;

import java.math.BigInteger;

public class Resta extends Algebra
{
    Fraccion calcular(Fraccion a, Fraccion b)
    {
        BigInteger num = a.NUM.multiply(b.DEN).subtract(b.NUM.multiply(a.DEN));
        BigInteger den = a.DEN.multiply(b.DEN);

        return new Fraccion(num, den);
    }
}