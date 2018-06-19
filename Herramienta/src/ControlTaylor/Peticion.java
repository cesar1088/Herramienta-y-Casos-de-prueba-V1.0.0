package ControlTaylor;

import java.util.concurrent.Callable;

public class Peticion implements Callable<String[]>
{
    private final int[] entradas;

    public Peticion(int[] valores)
    {
        entradas = valores;
    }

    @Override
    public String[] call() throws Exception
    {
        int ID = entradas[0];
        int total = entradas[1];
        int casilleros = entradas[2];
        int subAlgoritmo = entradas[3];
        int arquitectura = entradas[4];
        double tiempoRespuesta = 0;

        switch (arquitectura)
        {
            case 0: //Se invoca 'Taylor-Bucket' con la arquitectura #1
            {
                tiempoRespuesta = peticionTaylorBucketA1(total, casilleros, subAlgoritmo);
            }
            break;

            case 1: //Se invoca 'Taylor-Bucket' con la arquitectura #2
            {
                tiempoRespuesta = peticionTaylorBucketA2(total, casilleros, subAlgoritmo);
            }
            break;

            case 2: //Se invoca 'Taylor-Bucket' con la arquitectura #3
            {
                tiempoRespuesta = peticionTaylorBucketA3(total, casilleros, subAlgoritmo);
            }
            break;

            case 3: //Se invoca 'Taylor-Bucket' con la arquitectura #4
            {
                tiempoRespuesta = peticionTaylorBucketA4(total, casilleros, subAlgoritmo);
            }
            break;
        }

        tiempoRespuesta = Math.round((tiempoRespuesta) * 100000.00) / 100000.00;
        String[] resultados = {String.valueOf(ID), String.valueOf(tiempoRespuesta)};
        
        return resultados;
    }

    private static double peticionTaylorBucketA1(int total, int totalCasilleros, int subAlgoritmo) {
        taylorbucket_a1.A1TaylorBucketService service = new taylorbucket_a1.A1TaylorBucketService();
        taylorbucket_a1.A1TaylorBucket port = service.getA1TaylorBucketPort();
        return port.peticionTaylorBucketA1(total, totalCasilleros, subAlgoritmo);
    }

    private static double peticionTaylorBucketA2(int total, int totalCasilleros, int subAlgoritmo) {
        taylorbucket_a2.A2TaylorBucketService service = new taylorbucket_a2.A2TaylorBucketService();
        taylorbucket_a2.A2TaylorBucket port = service.getA2TaylorBucketPort();
        return port.peticionTaylorBucketA2(total, totalCasilleros, subAlgoritmo);
    }

    private static double peticionTaylorBucketA3(int total, int totalCasilleros, int subAlgoritmo) {
        taylorbucket_a3.A3TaylorBucketService service = new taylorbucket_a3.A3TaylorBucketService();
        taylorbucket_a3.A3TaylorBucket port = service.getA3TaylorBucketPort();
        return port.peticionTaylorBucketA3(total, totalCasilleros, subAlgoritmo);
    }

    private static double peticionTaylorBucketA4(int total, int totalCasilleros, int subAlgoritmo) {
        taylorbucket_a4.A4TaylorBucketService service = new taylorbucket_a4.A4TaylorBucketService();
        taylorbucket_a4.A4TaylorBucket port = service.getA4TaylorBucketPort();
        return port.peticionTaylorBucketA4(total, totalCasilleros, subAlgoritmo);
    }
}