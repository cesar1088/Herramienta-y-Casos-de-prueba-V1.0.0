package ControlContinuas;

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
        int metodo = entradas[2];
        int datos = entradas[3];
        int arquitectura = entradas[4];
        double tiempoRespuesta = 0;

        switch (arquitectura)
        {
            case 0: //Se invoca 'V.A Continuas' con la arquitectura #1
            {
                if (datos == 0) //'V.A Continuas' con datos flotantes
                {
                    tiempoRespuesta = peticionContinuasFA1(total, metodo);
                } 
                else //'V.A Continuas' con datos doubles
                {
                    tiempoRespuesta = peticionContinuasDA1(total, metodo);
                }
            }
            break;

            case 1: //Se invoca 'V.A Continuas' con la arquitectura #2
            {
                if (datos == 0) //'V.A Continuas' con datos flotantes
                {
                    tiempoRespuesta = peticionContinuasFA2(total, metodo);
                }
                else //'V.A Continuas' con datos doubles
                {
                    tiempoRespuesta = peticionContinuasDA2(total, metodo);
                }
            }
            break;

            case 2: //Se invoca 'V.A Continuas' con la arquitectura #3
            {
                if (datos == 0) //'V.A Continuas' con datos flotantes
                {
                    tiempoRespuesta = peticionContinuasFA3(total, metodo);
                } 
                else //'V.A Continuas' con datos doubles
                {
                    tiempoRespuesta = peticionContinuasDA3(total, metodo);
                }
            }
            break;

            case 3: //Se invoca 'V.A Continuas' con la arquitectura #4
            {
                if (datos == 0) //'V.A Continuas' con datos flotantes
                {
                    tiempoRespuesta = peticionContinuasFA4(total, metodo);
                } 
                else //'V.A Continuas' con datos doubles
                {
                    tiempoRespuesta = peticionContinuasDA4(total, metodo);
                }
            }
            break;
        }

        tiempoRespuesta = Math.round((tiempoRespuesta) * 100000.00) / 100000.00;
        String[] resultados = {String.valueOf(ID), String.valueOf(tiempoRespuesta)};
        
        return resultados;
    }

    private static double peticionContinuasDA1(int repeticiones, int tipoAleatorios) {
        continuas_da1.A1DContinuasService service = new continuas_da1.A1DContinuasService();
        continuas_da1.A1DContinuas port = service.getA1DContinuasPort();
        return port.peticionContinuasDA1(repeticiones, tipoAleatorios);
    }

    private static double peticionContinuasDA2(int totalContinuas, int metodos) {
        continuas_da2.A2DContinuasService service = new continuas_da2.A2DContinuasService();
        continuas_da2.A2DContinuas port = service.getA2DContinuasPort();
        return port.peticionContinuasDA2(totalContinuas, metodos);
    }

    private static double peticionContinuasDA3(int repeticiones, int tipoAleatorios) {
        continuas_da3.A3DContinuasService service = new continuas_da3.A3DContinuasService();
        continuas_da3.A3DContinuas port = service.getA3DContinuasPort();
        return port.peticionContinuasDA3(repeticiones, tipoAleatorios);
    }

    private static double peticionContinuasDA4(int repeticiones, int tipoAleatorios) {
        continuas_da4.A4DContinuasService service = new continuas_da4.A4DContinuasService();
        continuas_da4.A4DContinuas port = service.getA4DContinuasPort();
        return port.peticionContinuasDA4(repeticiones, tipoAleatorios);
    }

    private static double peticionContinuasFA1(int repeticiones, int tipoAleatorios) {
        continuas_fa1.A1FContinuasService service = new continuas_fa1.A1FContinuasService();
        continuas_fa1.A1FContinuas port = service.getA1FContinuasPort();
        return port.peticionContinuasFA1(repeticiones, tipoAleatorios);
    }

    private static double peticionContinuasFA2(int totalContinuas, int tipoMetodos) {
        continuas_fa2.A2FContinuasService service = new continuas_fa2.A2FContinuasService();
        continuas_fa2.A2FContinuas port = service.getA2FContinuasPort();
        return port.peticionContinuasFA2(totalContinuas, tipoMetodos);
    }

    private static double peticionContinuasFA3(int repeticiones, int tipoAleatorios) {
        continuas_fa3.A3FContinuasService service = new continuas_fa3.A3FContinuasService();
        continuas_fa3.A3FContinuas port = service.getA3FContinuasPort();
        return port.peticionContinuasFA3(repeticiones, tipoAleatorios);
    }

    private static double peticionContinuasFA4(int repeticiones, int tipoAleatorios) {
        continuas_fa4.A4FContinuasService service = new continuas_fa4.A4FContinuasService();
        continuas_fa4.A4FContinuas port = service.getA4FContinuasPort();
        return port.peticionContinuasFA4(repeticiones, tipoAleatorios);
    }
}