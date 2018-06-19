/*-----------------------------------------------------------------------------
| Caso de Prueba #5: "Generación de Variables Aleatorias Discretas"(A2)(DOUBLE)|
| Version: 1.0    Fecha: Enero del 2013                                        |
| Autor: ISC. Luis César Guadarrama Rogel email: cesarguadarrama@cenidet.edu.mx|
-------------------------------------------------------------------------------
| La generación de las variables aleatorias utilizando diversas distribuciones |
| de probabilidad: (1)Binomial. (2)Binomial Negativo. (3)Poisson. (4)Geométrica|
| (5)Hipergeométrica. (6)Bernoulli. (7)Multinomial. (8)Uniforme discreta       |
------------------------------------------------------------------------------*/
package Discretas_DA2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService()
public class A2_DDiscretas
{
    private int repeticiones;

    @WebMethod(operationName = "peticionDiscretasDA2")
    public double peticionDiscretasDA2(@WebParam(name = "totalDiscretas")
    int totalDiscretas)
    {
        repeticiones = totalDiscretas;

        long tiempoInicio = System.currentTimeMillis();

        try
        {
            System.out.println("Binomial");
            imprimir(binomial());
            System.out.println("Binomial Negativo");
            imprimir(binomialNegativo());
            System.out.println("Poisson");
            imprimir(poisson());
            System.out.println("Geometrica");
            imprimir(geometrica());
            System.out.println("HiperGeometrica");
            imprimir(hipergeometrica());
            System.out.println("Bernoulli");
            imprimir(bernoulli());
            System.out.println("Multinomial");
            imprimir(multinomial());
            System.out.println("Uniforme Discreta");
            imprimir(uniformeDiscreta());
        }
        catch (Exception ex)
        {
            System.out.println("Error en el Caso de Prueba: Discretas\n" + ex);
        }

        long tiempoFinal = System.currentTimeMillis();
        return (tiempoFinal - tiempoInicio) / 1000.00; //Tiempo de respuesta
    }

    private void imprimir(double[] valores)
    {
        for (int i = 0; i < valores.length; i++)
        {
            System.out.println("x" + i + ": " + valores[i]);
        }
    }

    private double[] binomial()
    {
        double k = 0;
        double p = 0.5;
        double n = 9;
        double q = 1 - p;
        double valorBinomial;
        double[] valores_rn = new double[repeticiones];

        for (int i = 0; i < repeticiones; i++, k++)
        {
            valorBinomial = combinacion(n, k) * Math.pow(p, k) * Math.pow(q, n - k);
            valores_rn[i] = valorBinomial;
        }

        return valores_rn;
    }

    private double[] binomialNegativo()
    {
        double r = 3;
        double k = 0;
        double p = 0.7;
        double q = 0.3;
        double temp, contador, binomialNeg;
        double[] valores_rn = new double[repeticiones];

        for (int i = 0; i < repeticiones; i++)
        {
            temp = i;
            contador = r;

            while (temp > 1)
            {
                contador += r;
                temp--;
            }

            k = contador + i;

            binomialNeg = combinacion(k - 1, r - 1) * Math.pow(p, r) * Math.pow(q, k - r);
            valores_rn[i] = binomialNeg;
        }

        return valores_rn;
    }

    private double[] poisson()
    {
        double e = Math.E;
        double landa = 3;
        double k = 0;
        double valorPoisson;
        double[] valores_rn = new double[repeticiones];

        for (int i = 0; i < repeticiones; i++, k++)
        {
            valorPoisson = Math.pow(e, landa * -1) * (Math.pow(landa, k) / factorial(k));
            valores_rn[i] = valorPoisson;
        }

        return valores_rn;
    }

    private double[] geometrica()
    {
        double p = 0.166666;
        double q = 1 - p;
        double k = 1;
        double valorGeometrica;
        double[] valores_rn = new double[repeticiones];

        for (int i = 0; i < repeticiones; i++, k++)
        {
            valorGeometrica = p * Math.pow(q, k - 1);
            valores_rn[i] = valorGeometrica;
        }

        return valores_rn;
    }

    private double[] hipergeometrica()
    {
        double N = 50;
        double n = 3;
        double a = 6;
        double k = 0;
        double hiperGeom;
        double[] valores_rn = new double[repeticiones];

        for (int i = 0; i < repeticiones; i++, k++)
        {
            hiperGeom = (combinacion(a, k) * combinacion(N - a, n - k)) / combinacion(N, n);
            valores_rn[i] = hiperGeom;
        }

        return valores_rn;

    }

    private double[] bernoulli()
    {
        double p = 0.1666;
        double bernoulli;
        double[] valores_rn = new double[repeticiones];

        for (int i = 0; i < repeticiones; i++, p -= 0.05)
        {
            bernoulli = 1 - p;
            valores_rn[i] = bernoulli;
        }

        return valores_rn;
    }

    private double[] multinomial()
    {
        double n = 4;
        double x1 = 3;
        double x2 = 0;
        double x3 = 1;
        double p1 = 0.5;
        double p2 = 0.3;
        double p3 = 0.2;
        double a, b, multinomial;
        double[] valores_rn = new double[repeticiones];

        for (int i = 0; i < repeticiones; i++, n += 0.5)
        {
            a = (factorial(n) / (factorial(x1) * factorial(x2) * factorial(x3)));
            b = Math.pow(p1, x1) * Math.pow(p2, x2) * Math.pow(p3, x3);
            multinomial = a * b;
            valores_rn[i] = multinomial;
        }

        return valores_rn;
    }

    private double[] uniformeDiscreta()
    {
        double a = 5;
        double b = 10;
        double x = 5;
        double uniforme;
        double[] valores_rn = new double[repeticiones];

        for (int i = 0; i < repeticiones; i++, x += 0.5)
        {
            if (x > a && x < b)
            {
                uniforme = 1 / (b - a);
                valores_rn[i] = uniforme;
            }
            else
            {
                valores_rn[i] = 0;
            }
        }

        return valores_rn;
    }

    private double combinacion(double n, double r)
    {
        double numerador = factorial(n);
        double denominador = factorial(r) * factorial(n - r);
        double resultado = numerador / denominador;

        return resultado;
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
}
