package Continuas_FA3;

public interface IDistribuciones
{
    float u = 0; //Distribución Gauss
    float varianza = 1; //Distribución Gauss
    float alphaGamma = 2; //Distribución Gamma
    float betaGamma = (float)0.333; //Distribución Gamma
    float alphaBeta = (float)0.5; //Distribución Beta
    float betaBeta = (float)0.2; //Distribución Beta
    float X0 = 0015; //Semilla X0
    float X1 = 0734; //Semilla X1
    float[] valoresX = new float[]{11, 3, 81, 25, 53}; //Conjunto de semillas
}