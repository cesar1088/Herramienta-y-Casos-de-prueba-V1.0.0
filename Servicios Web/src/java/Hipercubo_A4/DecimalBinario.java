package Hipercubo_A4;

public class DecimalBinario extends ConversionBITS
{
    int[] convertir(int valor_decimal)
    {
        int i = 0;
        int[] binario = new int[20];

        while (valor_decimal != 0)
        {
            if (valor_decimal % 2 == 0)
            {
                binario[i] = 0;
                valor_decimal /= 2;
                i++;
            }
            else
            {
                binario[i] = 1;
                valor_decimal--;
                valor_decimal /= 2;
                i++;
            }
        }

        return binario;
    }

    int convertir(int[] valores)
    {
        return 0;
    }
}