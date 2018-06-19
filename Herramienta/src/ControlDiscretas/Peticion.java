package ControlDiscretas;

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
        int datos = entradas[2];
        int arquitectura = entradas[3];
        double tiempoRespuesta = 0;

        switch (arquitectura)
        {
            case 0: //Se invoca 'V.A Discretas' con la arquitectura #1
            {
                if (datos == 0) //'V.A Discretas' con datos flotantes
                {
                    tiempoRespuesta = peticionDiscretasFA1(total);
                } 
                else //'V.A Discretas' con datos doubles
                {
                    tiempoRespuesta = peticionDiscretasDA1(total);
                }
            }
            break;

            case 1: //Se invoca 'V.A Discretas' con la arquitectura #2
            {
                if (datos == 0) //'V.A Discretas' con datos flotantes
                {
                    tiempoRespuesta = peticionDiscretasFA2(total);
                } 
                else //'V.A Discretas' con datos doubles
                {
                    tiempoRespuesta = peticionDiscretasDA2(total);
                }
            }
            break;

            case 2: //Se invoca 'V.A Discretas' con la arquitectura #3
            {
                if (datos == 0) //'V.A Discretas' con datos flotantes
                {
                    tiempoRespuesta = peticionDiscretasFA3(total);
                }
                else //'V.A Discretas' con datos doubles
                {
                    tiempoRespuesta = peticionDiscretasDA3(total);
                }
            }
            break;

            case 3: //Se invoca 'V.A Discretas' con la arquitectura #4
            {
                if (datos == 0) //'V.A Discretas' con datos flotantes
                {
                    tiempoRespuesta = peticionDiscretasFA4(total);
                } 
                else //'V.A Discretas' con datos doubles
                {
                    tiempoRespuesta = peticionDiscretasDA4(total);
                }
            }
            break;
        }

        tiempoRespuesta = Math.round((tiempoRespuesta) * 100000.00) / 100000.00;
        String[] resultados = {String.valueOf(ID), String.valueOf(tiempoRespuesta)};
        
        return resultados;
    }

    private static double peticionDiscretasDA1(int repeticiones) {
        discretas_da1.A1DDiscretasService service = new discretas_da1.A1DDiscretasService();
        discretas_da1.A1DDiscretas port = service.getA1DDiscretasPort();
        return port.peticionDiscretasDA1(repeticiones);
    }

    private static double peticionDiscretasDA2(int totalDiscretas) {
        discretas_da2.A2DDiscretasService service = new discretas_da2.A2DDiscretasService();
        discretas_da2.A2DDiscretas port = service.getA2DDiscretasPort();
        return port.peticionDiscretasDA2(totalDiscretas);
    }

    private static double peticionDiscretasDA3(int repeticiones) {
        discretas_da3.A3DDiscretasService service = new discretas_da3.A3DDiscretasService();
        discretas_da3.A3DDiscretas port = service.getA3DDiscretasPort();
        return port.peticionDiscretasDA3(repeticiones);
    }

    private static double peticionDiscretasDA4(int repeticiones) {
        discretas_da4.A4DDiscretasService service = new discretas_da4.A4DDiscretasService();
        discretas_da4.A4DDiscretas port = service.getA4DDiscretasPort();
        return port.peticionDiscretasDA4(repeticiones);
    }

    private static double peticionDiscretasFA1(int repeticiones) {
        discretas_fa1.A1FDiscretasService service = new discretas_fa1.A1FDiscretasService();
        discretas_fa1.A1FDiscretas port = service.getA1FDiscretasPort();
        return port.peticionDiscretasFA1(repeticiones);
    }

    private static double peticionDiscretasFA2(int totalDiscretas) {
        discretas_fa2.A2FDiscretasService service = new discretas_fa2.A2FDiscretasService();
        discretas_fa2.A2FDiscretas port = service.getA2FDiscretasPort();
        return port.peticionDiscretasFA2(totalDiscretas);
    }

    private static double peticionDiscretasFA3(int repeticiones) {
        discretas_fa3.A3FDiscretasService service = new discretas_fa3.A3FDiscretasService();
        discretas_fa3.A3FDiscretas port = service.getA3FDiscretasPort();
        return port.peticionDiscretasFA3(repeticiones);
    }

    private static double peticionDiscretasFA4(int repeticiones) {
        discretas_fa4.A4FDiscretasService service = new discretas_fa4.A4FDiscretasService();
        discretas_fa4.A4FDiscretas port = service.getA4FDiscretasPort();
        return port.peticionDiscretasFA4(repeticiones);
    }
}