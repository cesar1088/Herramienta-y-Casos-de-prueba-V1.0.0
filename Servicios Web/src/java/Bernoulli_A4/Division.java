package Bernoulli_A4;

public class Division extends Algebra
{
    Fraccion calcular(Fraccion a, Fraccion b)
    {
        Fraccion inversa = new Inversa().calcular(b);
        Fraccion salida = new Multiplicacion().calcular(a, inversa);

        return salida;
    }
}