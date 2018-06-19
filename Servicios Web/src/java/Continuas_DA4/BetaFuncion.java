package Continuas_DA4;

public class BetaFuncion
{
    double calcular(double alpha, double beta)
    {
        GammaFuncion gf = new GammaFuncion();
        double num = gf.calcular(alpha) * gf.calcular(beta);
        double den = gf.calcular(alpha + beta);

        return num / den;
    }
}