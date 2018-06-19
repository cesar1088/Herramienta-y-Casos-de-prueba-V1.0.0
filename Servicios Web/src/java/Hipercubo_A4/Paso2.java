package Hipercubo_A4;

import java.util.ArrayList;

public class Paso2 extends Algoritmo
{
    ArrayList invocar(ArrayList<Nodo> listaActual)
    {
        for (int m = 0; m < totalProcesadores; m++)
        {
            listaActual.get(m).VALOR_C = listaActual.get(m).VALOR_A * listaActual.get(m).VALOR_B;
        }

        return listaActual;
    }
}