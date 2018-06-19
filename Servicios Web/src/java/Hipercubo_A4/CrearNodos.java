package Hipercubo_A4;

import java.util.ArrayList;

public class CrearNodos
{
    ArrayList<Nodo> crear(int totalProcesadores)
    {
        ArrayList<Nodo> salida = new ArrayList<Nodo>();
        Nodo nodo;

        for (int i = 0; i < totalProcesadores; i++)
        {
            nodo = new Nodo();
            salida.add(nodo);
        }

        return salida;
    }
}