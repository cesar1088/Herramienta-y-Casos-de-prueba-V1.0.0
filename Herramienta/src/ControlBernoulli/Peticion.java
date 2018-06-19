package ControlBernoulli;

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
        int arquitectura = entradas[2];
        double tiempoRespuesta = 0;

        switch (arquitectura)
        {
            case 0: //Se invoca 'Bernoulli' con la arquitectura #1
            {
                tiempoRespuesta = peticionBernoulliA1(total);
            }
            break;

            case 1: //Se invoca 'Bernoulli' con la arquitectura #2
            {
                tiempoRespuesta = peticionBernoulliA2(total);
            }
            break;

            case 2: //Se invoca 'Bernoulli' con la arquitectura #3
            {
                tiempoRespuesta = peticionBernoulliA3(total);
            }
            break;

            case 3: //Se invoca 'Bernoulli' con la arquitectura #4
            {
                tiempoRespuesta = peticionBernoulliA4(total);
            }
            break;
        }
        tiempoRespuesta = Math.round((tiempoRespuesta) * 100000.00) / 100000.00;
        String[] resultados = {String.valueOf(ID), String.valueOf(tiempoRespuesta)};
        
        return resultados;
    }

    private static double peticionBernoulliA1(int n) {
        bernoulli_a1.A1BernoulliService service = new bernoulli_a1.A1BernoulliService();
        bernoulli_a1.A1Bernoulli port = service.getA1BernoulliPort();
        return port.peticionBernoulliA1(n);
    }

    private static double peticionBernoulliA2(int n) {
        bernoulli_a2.A2Bernoulli1Service service = new bernoulli_a2.A2Bernoulli1Service();
        bernoulli_a2.A2Bernoulli1 port = service.getA2Bernoulli1Port();
        return port.peticionBernoulliA2(n);
    }

    private static double peticionBernoulliA3(int n) {
        bernoulli_a3.A3BernoulliService service = new bernoulli_a3.A3BernoulliService();
        bernoulli_a3.A3Bernoulli port = service.getA3BernoulliPort();
        return port.peticionBernoulliA3(n);
    }

    private static double peticionBernoulliA4(int n) {
        bernoulli_a4.A4BernoulliService service = new bernoulli_a4.A4BernoulliService();
        bernoulli_a4.A4Bernoulli port = service.getA4BernoulliPort();
        return port.peticionBernoulliA1(n);
    }
}