package Discretas_DA4;

public abstract class PFija
{
    double e = Math.E;
    double landa = 3;
    double k = 0;
    double N = 50;
    double n = 3;
    double a = 6;
    double b = 10;
    double x = 5;
    double X1 = 3;
    double X2 = 0;
    double X3 = 1;
    double P1 = 0.5;
    double P2 = 0.3;
    double P3 = 0.2;

    abstract double[] calcular(int repeticiones);
}