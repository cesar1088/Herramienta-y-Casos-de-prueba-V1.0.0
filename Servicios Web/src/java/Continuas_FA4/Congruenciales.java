package Continuas_FA4;

public abstract class Congruenciales
{
    float a = 1;
    float b = 2;
    float c = 10;
    float m = 10000;
    float X0 = 0015; //Semilla X0
    float X1 = 0734; //Semilla X1
    float[] valoresX = new float[]{11, 3, 81, 25, 53}; //Conjunto de semillas

    abstract float[] calcular(int repeticiones);
}