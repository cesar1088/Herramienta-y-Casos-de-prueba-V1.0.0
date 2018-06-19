package Hipercubo_A4;

public class Bit extends OperacionesBITS
{
    int devuelveBIT(int[] binario, int posicion)
    {
        if (binario[posicion] == 0)
        {
            return 0;
        } 
        else
        {
            return 1;
        }
    }
}