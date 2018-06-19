package TaylorBucket_A4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class SerieTaylor
{
    private final int total;

    public SerieTaylor(int totalTaylor)
    {
        total = totalTaylor;
    }

    ArrayList<BigDecimal> seno()
    {
        ArrayList<BigDecimal> lista = new ArrayList<BigDecimal>();
        BigDecimal valor, numerador, denominador, resultado, multiplicador;

        for (int i = 0; i <= total; i++)
        {
            valor = BigDecimal.ZERO;

            numerador = new BigDecimal("90");
            numerador = numerador.pow(2 * i + 1);
            denominador = new Factorial().calcular(2 * i + 1);
            resultado = numerador.divide(denominador, 100, RoundingMode.HALF_UP);

            multiplicador = BigDecimal.ONE.negate();
            multiplicador = multiplicador.pow(i);
            resultado = resultado.multiply(multiplicador);
            valor = valor.add(resultado);

            lista.add(valor);
        }

        return lista;
    }
}