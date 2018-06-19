package Continuas_FA4;

public class ValoresMedios
{
    float calcular(float Y0, float D)
    {
        String cadena = String.valueOf(Y0);

        if (cadena.length() % 2 != 0)
        {
            cadena = 0 + cadena;
        }

        float posDer = cadena.length() / 2;
        float posIzq = (cadena.length() - D) / 2;
        float tamañoLateral = D / 2;

        String valorIzq = "";
        String valorDer = "";

        for (int j = 0; j < tamañoLateral; j++)
        {
            valorIzq += cadena.charAt((int) posIzq);
            valorDer += cadena.charAt((int) posDer);
            posIzq++;
            posDer++;
        }

        float salida = Float.parseFloat(valorIzq + valorDer);

        return salida;
    }
}