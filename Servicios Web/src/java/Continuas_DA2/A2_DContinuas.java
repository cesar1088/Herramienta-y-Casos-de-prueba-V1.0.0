/*-----------------------------------------------------------------------------
| Caso de Prueba #4: "Generación de Variables Aleatorias Continuas"(A2)(DOUBLE)|
| Version: 1.0    Fecha: Enero del 2013                                        |
| Autor: ISC. Luis César Guadarrama Rogel email: cesarguadarrama@cenidet.edu.mx|
-------------------------------------------------------------------------------
| La generación de las V.A se realiza mediante las distribuciones (A)Gauss,    |
| (B)Gamma y (C)Beta, las cuales utilizan un conjunto de valores 'k' obtenidos |
| mediante los Métodos Congruenciales: (1)Lineal, (2)No Lineal, (3)Aditivo y   |
| (4)Multiplicativo y los Métodos No Congruenciales: (5)Cuadrados Medios,      |
| (6)Productos Medios y (7)Multiplicador Constante)                            |
------------------------------------------------------------------------------*/
package Continuas_DA2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService()
public class A2_DContinuas
{
    private int repeticiones;
    private int tipoAleatorios;
    private int a = 1;
    private int b = 2;
    private int c = 10;
    private int m = 10000;

    @WebMethod(operationName = "peticionContinuasDA2")
    public double peticionContinuasDA2(
    @WebParam(name = "totalContinuas") int totalContinuas,
    @WebParam(name = "metodos") int metodos)
    {
        repeticiones = totalContinuas;
        tipoAleatorios = metodos;
        
        long tiempoInicio = System.currentTimeMillis();

        try
        {
            switch (tipoAleatorios)
            {
                case 0:
                {
                    for (int i = 0; i <= 3; i++) //Métodos Congruenciales
                    {
                        System.out.println("------ Distribución Gauss ------");
                        imprimir(gauss(i));
                        System.out.println("------ Distribución Gamma ------");
                        imprimir(gamma(i));
                        System.out.println("------ Distribución Beta ------");
                        imprimir(beta(i));
                    }
                }
                break;

                case 1:
                {
                    for (int i = 4; i <= 6; i++) //Métodos No Congruenciales
                    {
                        System.out.println("------ Distribución Gauss ------");
                        imprimir(gauss(i));
                        System.out.println("------ Distribución Gamma ------");
                        imprimir(gamma(i));
                        System.out.println("------ Distribución Beta ------");
                        imprimir(beta(i));
                    }
                }
                break;
            }

        }
        catch (Exception ex)
        {
            System.out.println("Error en el Caso de Prueba: Continuas\n" + ex);
        }

        long tiempoFinal = System.currentTimeMillis();
        return (tiempoFinal - tiempoInicio) / 1000.00; //Tiempo de respuesta
    }

    private void imprimir(double[] valores)
    {
        for (int i = 0; i < valores.length; i++)
        {
            System.out.println(valores[i]);
        }
    }

    private double[] gauss(int index)
    {
        double u = 0;
        double varianza = 1;
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

    private double[] gamma(int index)
    {
        double alpha = 2;
        double beta = 0.333;
        double x, num, den, rn;
        double[] generadosX = obtenerK(index);
        double[] valores_rn = new double[repeticiones];

        for (int i = 0; i < repeticiones; i++)
        {
            x = generadosX[i];
            num = Math.pow(x, alpha - 1);
            den = funcionGamma(alpha) * Math.pow(beta, alpha);
            rn = (num / den) * Math.pow(Math.E, -x / beta);
            valores_rn[i] = rn;
        }

        return valores_rn;
    }

    private double[] beta(int index)
    {
        double alpha = 0.5;
        double beta = 0.2;
        double x, num, den, rn;
        double[] generadosX = obtenerK(index);
        double[] valores_rn = new double[repeticiones];

        for (int i = 0; i < repeticiones; i++)
        {
            x = generadosX[i];
            num = 1;
            den = funcionBeta(alpha, beta);
            rn = (num / den) * Math.pow(x, alpha - 1) * (1 - x);
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
        double X0 = 0015;
        double X1 = 0734;
        double[] valoresX = new double[]{11, 3, 81, 25, 53};
        double[] salida = null;

        switch (index)
        {
            case 0: //Método Congruencial Lineal
            {
                System.out.println("Congruencial: Lineal");
                salida = lineal(repeticiones, X0);
            }
            break;

            case 1: //Método Congruencial No Lineal
            {
                System.out.println("Congruencial: No Lineal");
                salida = noLineal(repeticiones, X0);
            }
            break;

            case 2: //Método Congruencial Multiplicativo
            {
                System.out.println("Congruencial: Multiplicativo");
                salida = multiplicativo(repeticiones, X0);
            }
            break;

            case 3: //Método Congruencial Aditivo
            {
                System.out.println("Congruencial: Aditivo");
                salida = aditivo(repeticiones, valoresX);
            }
            break;

            case 4: //Método de los Cuadrados Medios
            {
                System.out.println("No Congruencial: Cuadrados Medios");
                salida = cuadradosMedios(repeticiones, X0);
            }
            break;

            case 5: //Método de los Productos Medios
            {
                System.out.println("No Congruencial: Productos Medios");
                salida = productosMedios(repeticiones, X0, X1);
            }
            break;

            case 6: //Método del Multiplicador Constante
            {
                System.out.println("No Congruencial: Multiplicador Constante");
                salida = multiplicaConstante(repeticiones, X1);
            }
            break;
        }

        return salida;
    }

    private double[] lineal(int repeticiones, double X0)
    {
        double rn;
        double[] valores_rn = new double[repeticiones];

        for (int i = 0; i < repeticiones; i++)
        {
            rn = (a * X0 + b) % m;
            X0 = (int) rn;
            rn = (rn / m) * 10;
            valores_rn[i] = rn;
        }

        return valores_rn;
    }

    private double[] noLineal(int repeticiones, double X0)
    {
        double rn;
        double[] valores_rn = new double[repeticiones];

        for (int i = 0; i < repeticiones; i++)
        {
            rn = ((a * Math.pow(X0, 2)) + (b * X0) + c) % m;
            X0 = (int) rn;
            rn = (rn / m) * 10;
            valores_rn[i] = rn;
        }

        return valores_rn;
    }

    private double[] aditivo(int repeticiones, double[] valoresX)
    {
        int posicion = 0;
        double rn;
        double xi = valoresX[valoresX.length - 1];
        double[] valores_rn = new double[repeticiones];

        for (int i = 0; i < repeticiones; i++)
        {
            if (i < valoresX.length)
            {
                rn = (xi + valoresX[i]) % m;
                xi = (int) rn;
                rn = (rn / m) * 10;
                valores_rn[i] = rn;
            }
            else
            {
                rn = (xi + valores_rn[posicion] * (m - 1)) % m;
                xi = (int) rn;
                rn = (rn / m) * 10;
                valores_rn[i] = rn;
                posicion++;
            }
        }

        return valores_rn;
    }

    private double[] multiplicativo(int repeticiones, double X0)
    {
        double rn;
        double[] valores_rn = new double[repeticiones];

        for (int i = 0; i < repeticiones; i++)
        {
            rn = (a * X0 + c) % m;
            X0 = rn;
            rn = (rn / m) * 10;
            valores_rn[i] = rn;
        }

        return valores_rn;
    }

    private double[] cuadradosMedios(int repeticiones, double X0)
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

    private double[] productosMedios(int repeticiones, double X0, double X1)
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

    private double[] multiplicaConstante(int repeticiones, double X0)
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

    private double valoresMedios(double Y0, double D)
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