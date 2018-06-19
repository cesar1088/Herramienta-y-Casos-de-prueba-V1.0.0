package Continuas_DA3;

public class NoCongruenciales
{
    double[] cuadradosMedios(int repeticiones, double X0)
    {
        double D, Y0, alObtenido;
        double[] rn = new double[repeticiones];

        for (int i = 0; i < repeticiones; i++)
        {
            D = 4;
            Y0 = (int) Math.pow(X0, 2);
            alObtenido = valoresMedios(Y0, D);
            X0 = (int) alObtenido;
            alObtenido = alObtenido / Math.pow(10, D);
            rn[i] = alObtenido * 10;
        }

        return rn;
    }

    double[] productosMedios(int repeticiones, double X0, double X1)
    {
        double D, Y0, alObtenido;
        double[] rn = new double[repeticiones];

        for (int i = 0; i < repeticiones; i++)
        {
            D = 4;
            Y0 = (int) X0 * (int) X1;
            alObtenido = valoresMedios(Y0, D);
            X1 = (int) alObtenido;
            X0 = X1;
            alObtenido = alObtenido / Math.pow(10, D);
            rn[i] = alObtenido * 10;
        }

        return rn;
    }

    double[] multiplicaConstante(int repeticiones, double X0)
    {
        int temp = 3;
        double D, Y0, alObtenido;
        double[] rn = new double[repeticiones];
        
        for (int i = 0; i < repeticiones; i++)
        {
            D = 2;
            Y0 = temp * (int) X0;
            alObtenido = valoresMedios(Y0, D);
            X0 = (int) alObtenido;
            alObtenido = alObtenido / Math.pow(10, D);
            rn[i] = alObtenido * 10;
        }

        return rn;
    }

    double valoresMedios(double Y0, double D)
    {
        String cadena = String.valueOf(Y0);

        if (cadena.length() % 2 != 0)
        {
            cadena = 0 + cadena;
        }

        double posDer = cadena.length() / 2;
        double posIzq = (cadena.length() - D) / 2;
        double tamañoLateral = D / 2;

        String valorIzq = "";
        String valorDer = "";

        for (int j = 0; j < tamañoLateral; j++)
        {
            valorIzq += cadena.charAt((int) posIzq);
            valorDer += cadena.charAt((int) posDer);
            posIzq++;
            posDer++;
        }

        double salida = Double.parseDouble(valorIzq + valorDer);

        return salida;
    }
}