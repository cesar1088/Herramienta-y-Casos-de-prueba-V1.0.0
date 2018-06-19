package Bernoulli_A3;

import java.math.BigInteger;

public class Fraccion
{
    BigInteger NUM;
    BigInteger DEN;

    Fraccion(BigInteger a, BigInteger b)
    {
        NUM = a;
        DEN = b;
    }

    Fraccion suma(Fraccion a, Fraccion b)
    {
        BigInteger num = a.NUM.multiply(b.DEN).add(b.NUM.multiply(a.DEN));
        BigInteger den = a.DEN.multiply(b.DEN);

        return new Fraccion(num, den);
    }

    Fraccion resta(Fraccion a, Fraccion b)
    {
        BigInteger num = a.NUM.multiply(b.DEN).subtract(b.NUM.multiply(a.DEN));
        BigInteger den = a.DEN.multiply(b.DEN);

        return new Fraccion(num, den);
    }

    Fraccion multiplicacion(Fraccion a, Fraccion b)
    {
        BigInteger factor1 = a.NUM.multiply(b.NUM);
        BigInteger factor2 = a.DEN.multiply(b.DEN);

        return new Fraccion(factor1, factor2);
    }

    Fraccion division(Fraccion a, Fraccion b)
    {
        return multiplicacion(a, inversa(b));
    }

    private Fraccion inversa(Fraccion a)
    {
        return new Fraccion(a.DEN, a.NUM);
    }

    private BigInteger mcd()
    {
        BigInteger u = NUM.abs();
        BigInteger v = DEN.abs();

        if (v.signum() == 0)
        {
            return u;
        }

        BigInteger r;

        while (v.signum() != 0)
        {
            r = u.mod(v);
            u = v;
            v = r;
        }

        return u;
    }

    Fraccion simplificacion()
    {
        BigInteger dividir = mcd();
        NUM = NUM.divide(dividir);
        DEN = DEN.divide(dividir);

        return this;
    }
}