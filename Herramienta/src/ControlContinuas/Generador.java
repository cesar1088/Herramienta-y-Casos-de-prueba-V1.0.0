/*-----------------------------------------------------------------------------
| Generador de Peticiones para el Caso de Prueba #4                            |
| Version: 1.0    Fecha: Enero del 2013                                        |
| Autor: ISC. Luis César Guadarrama Rogel email: cesarguadarrama@cenidet.edu.mx|
-------------------------------------------------------------------------------
| Esta clase se encarga de generar peticiones en forma de hilos para enviarlos |
| al servidor de forma asíncrona. El generador tiene 3 pasos:                  |
| (1) Se genera un contenedor de peticiones                                    |
| (2) Se envian las peticiones de forma asíncrona                              |
| (3) Se almacena el tiempo de respuesta del servidor en una tabla             |
------------------------------------------------------------------------------*/
package ControlContinuas;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import javax.swing.JOptionPane;

public class Generador
{
    public String[][] crearPeticiones(int n, int[] args)
    {
        int total = args[0];
        int metodo = args[1];
        int datos = args[2];
        int throughput = args[3];
        int arquitectura = args[4];
        String[][] salida = new String[throughput + 1][3];

        try
        {
            ExecutorService ex = Executors.newFixedThreadPool(throughput); //(1)
            List<Future<String[]>> contenedor = new ArrayList<Future<String[]>>();

            for (int i = 1; i <= throughput; i++)
            {
               int[] entradas = {i, total, metodo, datos, arquitectura};
                Callable<String[]> m = new Peticion(entradas);
                Future<String[]> proximoHilo = ex.submit(m);
                contenedor.add(proximoHilo);
            }

            int contador = 0;

            for (Future<String[]> future : contenedor) //(2)
            {
                String[] peticion = future.get();
                salida[contador][0] = String.valueOf(n); //(3)
                salida[contador][1] = peticion[0]; //(3)
                salida[contador][2] = peticion[1]; //(3)
                contador++;
            }
            ex.shutdown();
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Error en el generador: Bernoulli\n" + ex);
        }

        return salida;
    }
}