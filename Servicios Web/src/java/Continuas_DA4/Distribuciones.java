package Continuas_DA4;

public interface Distribuciones
{
    double u = 0; //Distribución Gauss
    double varianza = 1; //Distribución Gauss
    double alphaGamma = 2; //Distribución Gamma
    double betaGamma = 0.333; //Distribución Gamma
    double alphaBeta = 0.5; //Distribución Beta
    double betaBeta = 0.2; //Distribución Beta

    abstract double[] calcular(int index, int repeticiones);
}