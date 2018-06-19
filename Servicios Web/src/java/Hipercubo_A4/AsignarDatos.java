package Hipercubo_A4;

import java.util.ArrayList;

public class AsignarDatos extends Algoritmo
{
    ArrayList<Nodo> invocar(int proc_actual, ArrayList<Nodo> lista)
    {
        double num_procesador;

        for (int k = 0; k <= n - 1; k++)
        {
            for (int i = 0; i <= n - 1; i++)
            {
                for (int j = 0; j <= n - 1; j++)
                {
                    num_procesador = (Math.pow(2, 2 * q) * k) + (Math.pow(2, q) * i) + j;

                    if (num_procesador == proc_actual)
                    {
                        lista.get(proc_actual).VALOR_A = matriz_A[i][j];
                        lista.get(proc_actual).VALOR_B = matriz_B[i][j];
                    }
                }
            }
        }

        return lista;
    }
}