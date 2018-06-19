package Bernoulli_A4;

import java.math.BigInteger;

public class Simplificacion
{
    Fraccion simplificar(BigInteger num, BigInteger den)
    {
        BigInteger dividir = new MCD().calcular(num, den);
        num = num.divide(dividir);
        den = den.divide(dividir);

        return new Fraccion(num, den);
    }
}