package Continuas_DA4;

public abstract class NoCongruenciales
{
    double X0 = 0015; //Semilla X0
    double X1 = 0734; //Semilla X1
    double[] valoresX = new double[]{11, 3, 81, 25, 53}; //Conjunto de semillas

    abstract double[] calcular(int repeticiones);
}