package Continuas_FA4;

public class BetaFuncion
{
    float calcular(float alpha, float beta)
    {
        GammaFuncion gf = new GammaFuncion();
        float num = gf.calcular(alpha) * gf.calcular(beta);
        float den = gf.calcular(alpha + beta);

        return num / den;
    }
}