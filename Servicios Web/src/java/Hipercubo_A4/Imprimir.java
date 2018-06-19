package Hipercubo_A4;

import java.util.Iterator;
import java.util.ArrayList;

public class Imprimir
{
    void imprimir(ArrayList<Nodo> listaEntrada)
    {
        int contador = 0;
        int saltoLinea = 0;
        int n = (int) Math.round(Math.pow(listaEntrada.size(), 1.00/3.00));
        Iterator<Nodo> it = listaEntrada.listIterator();
        Nodo nodo;

        while(it.hasNext())
        {
            nodo = it.next();

            if (contador >= listaEntrada.size() - (n * n))
            {
                System.out.print(nodo.VALOR_C + " ");
                saltoLinea++;

                if(saltoLinea == n)
                {
                    System.out.print("\n");
                    saltoLinea = 0;
                }
            }
            else
            {
                contador++;
            }
        }
    }
}