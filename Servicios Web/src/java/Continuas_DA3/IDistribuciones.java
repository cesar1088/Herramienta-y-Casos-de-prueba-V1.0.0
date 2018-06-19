package Continuas_DA3;

public interface IDistribuciones
{
    double u = 0; //Distribución Gauss
    double varianza = 1; //Distribución Gauss
    double alphaGamma = 2; //Distribución Gamma
    double betaGamma = 0.333; //Distribución Gamma
    double alphaBeta = 0.5; //Distribución Beta
    double betaBeta = 0.2; //Distribución Beta
    double X0 = 0015; //Semilla X0
    double X1 = 0734; //Semilla X1
    double[] valoresX = new double[]{11, 3, 81, 25, 53}; //Conjunto de semillas
}