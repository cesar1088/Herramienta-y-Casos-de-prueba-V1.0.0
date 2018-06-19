package Bernoulli_A4;

import java.util.Iterator;
import java.util.ArrayList;

public class Imprimir
{
    void imprimir(ArrayList numeros)
    {
        Iterator<Fraccion> iterador = numeros.listIterator();
        int i = 0;

        while (iterador.hasNext())
        {
            Fraccion actual = iterador.next();
            System.out.println("B" + i + ": " + actual.NUM + "/" + actual.DEN);
            i++;
        }
    }
}