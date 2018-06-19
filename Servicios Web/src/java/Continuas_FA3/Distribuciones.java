package Continuas_FA3;

public class Distribuciones implements IDistribuciones
{
    private final int repeticiones;

    public Distribuciones(int total)
    {
        repeticiones = total;
    }

    float[] gauss(int index)
    {
        float x, num, den, p1, p2, rn;
        float[] generadosX = obtenerK(index);
        float[] valores_rn = new float[repeticiones];

        for (int i = 0; i < repeticiones; i++)
        {
            x = generadosX[i];
            num = 1;
            den = (float) Math.sqrt(2 * Math.PI) * varianza;
            p1 = (float) Math.pow(x - u, 2) * -1;
            p2 = (float) (2 * Math.pow(varianza, 2));
            rn = (float) ((num / den) * Math.pow(Math.E, (p1 / p2)));
            valores_rn[i] = rn;
        }

        return valores_rn;
    }

    float[] gamma(int index)
    {
        float x, num, den, rn;
        float[] generadosX = obtenerK(index);
        float[] valores_rn = new float[repeticiones];

        for (int i = 0; i < repeticiones; i++)
        {
            x = generadosX[i];
            num = (float) Math.pow(x, alphaGamma - 1);
            den = (float) (funcionGamma(alphaGamma) * Math.pow(betaGamma, alphaGamma));
            rn = (float) ((num / den) * Math.pow(Math.E, -x / betaGamma));
            valores_rn[i] = rn;
        }

        return valores_rn;
    }

    float[] beta(int index)
    {
        float x, num, den, rn;
        float[] generadosX = obtenerK(index);
        float[] valores_rn = new float[repeticiones];

        for (int i = 0; i < repeticiones; i++)
        {
            x = generadosX[i];
            num = 1;
            den = funcionBeta(alphaBeta, betaBeta);
            rn = (float) ((num / den) * Math.pow(x, alphaBeta - 1) * (1 - x));
            valores_rn[i] = rn;
        }

        return valores_rn;
    }

    private float funcionGamma(float alpha)
    {
        return factorial(alpha - 1);
    }

    private float funcionBeta(float alpha, float beta)
    {
        float num = funcionGamma(alpha) * funcionGamma(beta);
        float den = funcionGamma(alpha + beta);

        return num / den;
    }

    private float factorial(float valor)
    {
        float n = 1;

        for (int i = 1; i <= valor; i++)
        {
            n = n * i;
        }

        return n;
    }

    private float[] obtenerK(int index)
    {
        float[] salida = null;
        Congruenciales c = new Congruenciales();
        NoCongruenciales nc = new NoCongruenciales();

        switch (index) 
        {
            case 0: //Método Congruencial Lineal
            {
                System.out.println("Congruencial: Lineal");
                salida = c.lineal(repeticiones, X0);
            }
            break;

            case 1: //Método Congruencial No Lineal
            {
                System.out.println("Congruencial: No Lineal");
                salida = c.noLineal(repeticiones, X0);
            }
            break;

            case 2: //Método Congruencial Multiplicativo
            {
                System.out.println("Congruencial: Multiplicativo");
                salida = c.multiplicativo(repeticiones, X0);
            }
            break;

            case 3: //Método Congruencial Aditivo
            {
                System.out.println("Congruencial: Aditivo");
                salida = c.aditivo(repeticiones, valoresX);
            }
            break;

            case 4: //Método de los Cuadrados Medios
            {
                System.out.println("No Congruencial: Cuadrados Medios");
                salida = nc.cuadradosMedios(repeticiones, X0);
            }
            break;

            case 5: //Método de los Productos Medios
            {
                System.out.println("No Congruencial: Productos Medios");
                salida = nc.productosMedios(repeticiones, X0, X1);
            }
            break;

            case 6: //Método del Multiplicador Constante
            {
                System.out.println("No Congruencial: Multiplicador Constante");
                salida = nc.multiplicaConstante(repeticiones, X1);
            }
            break;
        }

        return salida;
    }
}