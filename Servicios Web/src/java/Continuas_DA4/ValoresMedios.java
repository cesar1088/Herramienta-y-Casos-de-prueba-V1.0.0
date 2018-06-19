package Continuas_DA4;

public class ValoresMedios
{
    double calcular(double Y0, double D)
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