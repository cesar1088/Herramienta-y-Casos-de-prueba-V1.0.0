package Hipercubo_A4;

import java.util.ArrayList;

public class Paso1 extends Algoritmo
{
    ArrayList invocar(ArrayList<Nodo> listaActual)
    {
        int t;
        int[] binario;
        DecimalBinario db = new DecimalBinario();
        BitComplement bc = new BitComplement();
        Bit bit = new Bit();
        
        for (int l = (3 * q - 1); l >= 2 * q; l--)
        {
            for (int m = 0; m < totalProcesadores; m++)
            {
                binario = db.convertir(m);
                t = bc.devuelveBIT(binario, l);

                if (bit.devuelveBIT(binario, l) == 1)
                {
                    listaActual = new AsignarDatos().invocar(m, listaActual);
                    listaActual.get(t).VALOR_A = listaActual.get(m).VALOR_A;
                    listaActual.get(t).VALOR_B = listaActual.get(m).VALOR_B;
                }
            }
        }

        for (int l = (q - 1); l >= 0; l--) //Se envian los valores de la matriz 'A'
        {
            for (int m = 0; m < totalProcesadores; m++)
            {
                binario = db.convertir(m);
                t = bc.devuelveBIT(binario, l);

                if (bit.devuelveBIT(binario, l) != bit.devuelveBIT(binario, 2 * q + l))
                {
                    listaActual.get(t).VALOR_A = listaActual.get(m).VALOR_A;
                }
            }
        }

        for (int l = (2 * q - 1); l >= q; l--) //Se envian los valores de la matriz 'B'
        {
            for (int m = 0; m < totalProcesadores; m++)
            {
                binario = db.convertir(m);
                t = bc.devuelveBIT(binario, l);

                if (bit.devuelveBIT(binario, l) != bit.devuelveBIT(binario, q + l))
                {
                    listaActual.get(t).VALOR_B = listaActual.get(m).VALOR_B;
                }
            }
        }

        return listaActual;
    }
}