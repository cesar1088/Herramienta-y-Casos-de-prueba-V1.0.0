package ControlHipercubo;

import java.util.concurrent.Callable;

public class Peticion implements Callable<String[]>
{
    private int[] entradas;

    public Peticion(int[] valores)
    {
        entradas = valores;
    }

    @Override
    public String[] call() throws Exception
    {
        int ID = entradas[0];
        int dimension = entradas[1];
        int arquitectura = entradas[2];
        double tiempoRespuesta = 0;

        switch (arquitectura)
        {
            case 0: //Se invoca 'Hipercubo' con la arquitectura #1
            {
                tiempoRespuesta = peticionHipercuboA1(dimension);
            }
            break;

            case 1: //Se invoca 'Hipercubo' con la arquitectura #2
            {
                tiempoRespuesta = peticionHipercuboA2(dimension);
            }
            break;

            case 2: //Se invoca 'Hipercubo' con la arquitectura #3
            {
                tiempoRespuesta = peticionHipercuboA3(dimension);
            }
            break;

            case 3: //Se invoca 'Hipercubo' con la arquitectura #4
            {
                tiempoRespuesta = peticionHipercuboA4(dimension);
            }
            break;
        }

        tiempoRespuesta = Math.round((tiempoRespuesta) * 100000.00) / 100000.00;
        String[] resultados = {String.valueOf(ID), String.valueOf(tiempoRespuesta)};
        
        return resultados;
    }

    private static double peticionHipercuboA1(int dimension) {
        hipercubo_a1.A1HipercuboService service = new hipercubo_a1.A1HipercuboService();
        hipercubo_a1.A1Hipercubo port = service.getA1HipercuboPort();
        return port.peticionHipercuboA1(dimension);
    }



    private static double peticionHipercuboA3(int dimension) {
        hipercubo_a3.A3HipercuboService service = new hipercubo_a3.A3HipercuboService();
        hipercubo_a3.A3Hipercubo port = service.getA3HipercuboPort();
        return port.peticionHipercuboA3(dimension);
    }

    private static double peticionHipercuboA4(int dimension) {
        hipercubo_a4.A4HipercuboService service = new hipercubo_a4.A4HipercuboService();
        hipercubo_a4.A4Hipercubo port = service.getA4HipercuboPort();
        return port.peticionHipercuboA4(dimension);
    }

    private static double peticionHipercuboA2(int dim) {
        hipercubo_a2.A2HipercuboService service = new hipercubo_a2.A2HipercuboService();
        hipercubo_a2.A2Hipercubo port = service.getA2HipercuboPort();
        return port.peticionHipercuboA2(dim);
    }

}