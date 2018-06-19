package TaylorBucket_A4;

import java.math.BigDecimal;

public class Factorial
{
    BigDecimal calcular(int valor)
    {
        BigDecimal n = BigDecimal.ONE;

        for (int i = 1; i <= valor; i++)
        {
            n = n.multiply(BigDecimal.valueOf(i));
        }

        return n;
    }
}