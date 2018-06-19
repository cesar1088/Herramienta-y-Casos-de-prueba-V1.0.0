package Hipercubo_A4;

public class BitComplement extends OperacionesBITS
{
    int devuelveBIT(int[] binario, int posicion)
    {
        if (binario[posicion] == 0)
        {
            binario[posicion] = 1;
        } 
        else
        {
            binario[posicion] = 0;
        }

        return new BinarioDecimal().convertir(binario);
    }
}