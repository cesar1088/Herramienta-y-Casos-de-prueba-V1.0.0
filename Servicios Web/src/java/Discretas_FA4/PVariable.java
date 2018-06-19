package Discretas_FA4;

public abstract class PVariable
{
    float p;
    float q;
    float k = 0;
    float r = 3;
    float n = 9;

    abstract float[] calcular(int repeticiones);
}