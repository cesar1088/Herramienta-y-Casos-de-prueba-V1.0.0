package Continuas_DA3;

public class Distribuciones implements IDistribuciones
{
    private final int repeticiones;

    public Distribuciones(int total)
    {
        repeticiones = total;
    }

    double[] gauss(int index)
    {
        double x, num, den, p1, p2, rn;
        double[] generadosX = obtenerK(index);
        double[] valores_rn = new double[repeticiones];

        for (int i = 0; i < repeticiones; i++)
        {
            x = generadosX[i];
            num = 1;
            den = Math.sqrt(2 * Math.PI) * varianza;
            p1 = Math.pow(x - u, 2) * -1;
            p2 = (2 * Math.pow(varianza, 2));
            rn = (num / den) * Math.pow(Math.E, (p1 / p2));
            valores_rn[i] = rn;
        }

        return valores_rn;
    }

    double[] gamma(int index)
    {
        double x, num, den, rn;
        double[] generadosX = obtenerK(index);
        double[] valores_rn = new double[repeticiones];

        for (int i = 0; i < repeticiones; i++)
        {
            x = generadosX[i];
            num = Math.pow(x, alphaGamma - 1);
            den = funcionGamma(alphaGamma) * Math.pow(betaGamma, alphaGamma);
            rn = (num / den) * Math.pow(Math.E, -x / betaGamma);
            valores_rn[i] = rn;
        }

        return valores_rn;
    }

    double[] beta(int index)
    {
        double x, num, den, rn;
        double[] generadosX = obtenerK(index);
        double[] valores_rn = new double[repeticiones];

        for (int i = 0; i < repeticiones; i++)
        {
            x = generadosX[i];
            num = 1;
            den = funcionBeta(alphaBeta, betaBeta);
            rn = (num / den) * Math.pow(x, alphaBeta - 1) * (1 - x);
            valores_rn[i] = rn;
        }

        return valores_rn;
    }

    private double funcionGamma(double alpha)
    {
        return factorial(alpha - 1);
    }

    private double funcionBeta(double alpha, double beta)
    {
        double num = funcionGamma(alpha) * funcionGamma(beta);
        double den = funcionGamma(alpha + beta);

        return num / den;
    }

    private double factorial(double valor)
    {
        double n = 1;

        for (int i = 1; i <= valor; i++)
        {
            n = n * i;
        }

        return n;
    }

    private double[] obtenerK(int index)
    {
        double[] salida = null;
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