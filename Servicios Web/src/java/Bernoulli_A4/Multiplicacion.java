package Bernoulli_A4;

import java.math.BigInteger;

public class Multiplicacion
{
    Fraccion calcular(Fraccion a, Fraccion b)
    {
        BigInteger factor1 = a.NUM.multiply(b.NUM);
        BigInteger factor2 = a.DEN.multiply(b.DEN);

        return new Fraccion(factor1, factor2);
    }
}