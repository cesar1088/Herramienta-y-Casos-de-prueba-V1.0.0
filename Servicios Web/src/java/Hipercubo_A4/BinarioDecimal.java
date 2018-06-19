package Hipercubo_A4;

public class BinarioDecimal extends ConversionBITS
{
    int convertir(int[] binario)
    {
        int suma = 0;

        for (int i = 0; i < 20; i++)
        {
            suma += binario[i] * Math.pow(2, i);
        }

        return suma;
    }

    int[] convertir(int valor)
    {
        return null;
    }
}