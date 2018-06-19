package Continuas_FA3;

public class NoCongruenciales
{
    float[] cuadradosMedios(int repeticiones, float X0)
    {
        float D, Y0, alObtenido;
        float[] rn = new float[repeticiones];
        
        for (int i = 0; i < repeticiones; i++)
        {
            D = 4;
            Y0 = (int) Math.pow(X0, 2);
            alObtenido = valoresMedios(Y0, D);
            X0 = (int) alObtenido;
            alObtenido = (float) (alObtenido / Math.pow(10, D));
            rn[i] = alObtenido * 10;
        }

        return rn;
    }

    float[] productosMedios(int repeticiones, float X0, float X1)
    {
        float D, Y0, alObtenido;
        float[] rn = new float[repeticiones];
        
        for (int i = 0; i < repeticiones; i++)
        {
            D = 4;
            Y0 = (int) X0 * (int) X1;
            alObtenido = valoresMedios(Y0, D);
            X1 = (int) alObtenido;
            X0 = X1;
            alObtenido = (float) (alObtenido / Math.pow(10, D));
            rn[i] = alObtenido * 10;
        }

        return rn;
    }

    float[] multiplicaConstante(int repeticiones, float X0)
    {
        int temp = 3;
        float D, Y0, alObtenido;
        float[] rn = new float[repeticiones];
        
        for (int i = 0; i < repeticiones; i++)
        {
            D = 2;
            Y0 = temp * (int) X0;
            alObtenido = valoresMedios(Y0, D);
            X0 = (int) alObtenido;
            alObtenido = (float) (alObtenido / Math.pow(10, D));
            rn[i] = alObtenido * 10;
        }

        return rn;
    }

    private float valoresMedios(float Y0, float D)
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