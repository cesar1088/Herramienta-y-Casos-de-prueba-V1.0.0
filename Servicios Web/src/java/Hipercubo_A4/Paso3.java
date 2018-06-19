package Hipercubo_A4;

import java.util.ArrayList;

public class Paso3 extends Algoritmo
{
    ArrayList invocar(ArrayList<Nodo> listaActual)
    {
        int t;
        int[] binario;
        DecimalBinario db = new DecimalBinario();
        Bit bit = new Bit();
        BitComplement bc = new BitComplement();

        for (int l = 2 * q; l <= 3 * q - 1; l++)
        {
            for (int m = 0; m < totalProcesadores; m++)
            {
                binario = db.convertir(m);
                t = bc.devuelveBIT(binario, l);

                if (bit.devuelveBIT(binario, l) == 1)
                {
                    listaActual.get(t).VALOR_C = listaActual.get(t).VALOR_C + listaActual.get(m).VALOR_C;
                }
            }
        }
        new Imprimir().imprimir(listaActual);

        return listaActual;
    }
}