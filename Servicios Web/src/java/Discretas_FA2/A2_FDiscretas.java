/*-----------------------------------------------------------------------------
| Caso de Prueba #5: "Generación de Variables Aleatorias Discretas" (A2)(FLOAT)|
| Version: 1.0    Fecha: Enero del 2013                                        |
| Autor: ISC. Luis César Guadarrama Rogel email: cesarguadarrama@cenidet.edu.mx|
-------------------------------------------------------------------------------
| La generación de las variables aleatorias utilizando diversas distribuciones |
| de probabilidad: (1)Binomial. (2)Binomial Negativo. (3)Poisson. (4)Geométrica|
| (5)Hipergeométrica. (6)Bernoulli. (7)Multinomial. (8)Uniforme Discreta       |
------------------------------------------------------------------------------*/
package Discretas_FA2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService()
public class A2_FDiscretas
{
    private int repeticiones;

    @WebMethod(operationName = "peticionDiscretasFA2")
    public double peticionDiscretasFA2(@WebParam(name = "totalDiscretas") int totalDiscretas)
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

    private void imprimir(float[] valores)
    {
        for (int i = 0; i < valores.length; i++)
        {
            System.out.println("x" + i + ": " + valores[i]);
        }
    }

    private float[] binomial()
    {
        float k = 0;
        float p = (float) 0.5;
        float n = 9;
        float q = 1 - p;
        float valorBinomial;
        float[] valores_rn = new float[repeticiones];

        for (int i = 0; i < repeticiones; i++, k++)
        {
            valorBinomial = (float) (combinacion(n, k) * Math.pow(p, k) * Math.pow(q, n - k));
            valores_rn[i] = valorBinomial;
        }

        return valores_rn;
    }

    private float[] binomialNegativo()
    {
        float r = 3;
        float k = 0;
        float p = (float) 0.7;
        float q = (float) 0.3;
        float temp, contador, binomialNeg;
        float[] valores_rn = new float[repeticiones];

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

            binomialNeg = (float) (combinacion(k - 1, r - 1) * Math.pow(p, r) * Math.pow(q, k - r));
            valores_rn[i] = binomialNeg;
        }

        return valores_rn;
    }

    private float[] poisson()
    {
        float e = (float) Math.E;
        float landa = 3;
        float k = 0;
        float valorPoisson;
        float[] valores_rn = new float[repeticiones];

        for (int i = 0; i < repeticiones; i++, k++)
        {
            valorPoisson = (float) (Math.pow(e, landa * -1) * (Math.pow(landa, k) / factorial(k)));
            valores_rn[i] = valorPoisson;
        }

        return valores_rn;
    }

    private float[] geometrica()
    {
        float p = (float) 0.166666;
        float q = 1 - p;
        float k = 1;
        float valorGeometrica;
        float[] valores_rn = new float[repeticiones];

        for (int i = 0; i < repeticiones; i++, k++)
        {
            valorGeometrica = (float) (p * Math.pow(q, k - 1));
            valores_rn[i] = valorGeometrica;
        }

        return valores_rn;
    }

    private float[] hipergeometrica()
    {
        float N = 50;
        float n = 3;
        float a = 6;
        float k = 0;
        float hiperGeom;
        float[] valores_rn = new float[repeticiones];

        for (int i = 0; i < repeticiones; i++, k++)
        {
            hiperGeom = (combinacion(a, k) * combinacion(N - a, n - k)) / combinacion(N, n);
            valores_rn[i] = (float) hiperGeom;
        }

        return valores_rn;
    }

    private float[] bernoulli()
    {
        float p = (float) 0.1666;
        float bernoulli;
        float[] valores_rn = new float[repeticiones];

        for (int i = 0; i < repeticiones; i++, p -= 0.05)
        {
            bernoulli = 1 - p;
            valores_rn[i] = bernoulli;
        }

        return valores_rn;
    }

    private float[] multinomial()
    {
        float n = 4;
        float x1 = 3;
        float x2 = 0;
        float x3 = 1;
        float p1 = (float) 0.5;
        float p2 = (float) 0.3;
        float p3 = (float) 0.2;
        float a, b, multinomial;
        float[] valores_rn = new float[repeticiones];

        for (int i = 0; i < repeticiones; i++, n += 0.5)
        {
            a = factorial(n) / (factorial(x1) * factorial(x2) * factorial(x3));
            b = (float)(Math.pow(p1, x1) * Math.pow(p2, x2) * Math.pow(p3, x3));
            multinomial = a * b;
            valores_rn[i] = multinomial;
        }

        return valores_rn;
    }

    private float[] uniformeDiscreta()
    {
        float a = 5;
        float b = 10;
        float x = 5;
        float uniforme;
        float[] valores_rn = new float[repeticiones];

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

    private float combinacion(float n, float r)
    {
        float numerador = factorial(n);
        float denominador = factorial(r) * factorial(n - r);
        float resultado = numerador / denominador;

        return resultado;
    }

    private float factorial(float valor)
    {
        float n = 1;

        for (int i = 1; i <= valor; i++) {
            n = n * i;
        }

        return n;
    }
}