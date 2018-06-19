package Bernoulli_A4;

import java.math.BigInteger;

public class MCD
{
    BigInteger calcular(BigInteger num, BigInteger den)
    {
        BigInteger u = num.abs();
        BigInteger v = den.abs();

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
}