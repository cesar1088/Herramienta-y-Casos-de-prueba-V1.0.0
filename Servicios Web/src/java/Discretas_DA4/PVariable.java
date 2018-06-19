package Discretas_DA4;

public abstract class PVariable
{
    double p;
    double q;
    double k = 0;
    double r = 3;
    double n = 9;

    abstract double[] calcular(int repeticiones);
}