package Continuas_FA4;

public interface Distribuciones
{
    float u = 0; //Distribución Gauss
    float varianza = 1; //Distribución Gauss
    float alphaGamma = 2; //Distribución Gamma
    float betaGamma = (float)0.333; //Distribución Gamma
    float alphaBeta = (float)0.5; //Distribución Beta
    float betaBeta = (float)0.2; //Distribución Beta
    
    abstract float[] calcular(int index, int repeticiones);
}