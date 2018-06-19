package Continuas_DA4;

public abstract class Congruenciales 
{
    double a = 1;
    double b = 2;
    double c = 10;
    double m = 10000;
    double X0 = 0015; //Semilla X0
    double X1 = 0734; //Semilla X1
    double[] valoresX = new double[]{11, 3, 81, 25, 53}; //Conjunto de semillas

    abstract double[] calcular(int repeticiones);
}