/*-----------------------------------------------------------------------------
| Caso de Prueba #5: "Generación de Variables Aleatorias Discretas"(A1)(DOUBLE)|
| Version: 1.0    Fecha: Enero del 2013                                        |
| Autor: ISC. Luis César Guadarrama Rogel email: cesarguadarrama@cenidet.edu.mx|
-------------------------------------------------------------------------------
| La generación de las variables aleatorias utilizando diversas distribuciones |
| de probabilidad: (1)Binomial. (2)Binomial Negativo. (3)Poisson. (4)Geométrica|
| (5)Hipergeométrica. (6)Bernoulli. (7)Multinomial. (8)Uniforme discreta       |
------------------------------------------------------------------------------*/
package Discretas_DA1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService()
public class A1_DDiscretas
{
    @WebMethod(operationName = "peticionDiscretasDA1")
    public double peticionDiscretasDA1(@WebParam(name = "repeticiones")int repeticiones)
    {
        long tiempoInicio = System.currentTimeMillis();

        try
        {
            //Datos generales
            double[] valores_rn = new double[repeticiones];
            double k = 0;
            double p = 0.5;
            double n = 9;
            double q = 1 - p;
            double a, b;
            double d1, d2, numerador, denominador, combinacion;

            double valorBinomial; //Binomial
            double r, binomialNeg; //Binomial Negativo
            double e, landa, valorPoisson; //Poisson
            double valorGeometrica; //Geometrica
            double N, COMB1, COMB2, COMB3, hiperGeom; //HiperGeometrica
            double bernoulli; //Bernoulli
            double fn, multinomial; //Multinomial
            double[] X, P;  //Multinomial
            double x, uniforme; //Uniforme discreta

            //-----------------------(1)Inicia Binomial------------------------

            for (int i = 0; i < repeticiones; i++, k++)
            {
                //Inicia la función "combinacion" (n,r)

                numerador = 1; //Numerador: Se obtiene el factorial de 'n'
                for (int j = 1; j <= n; j++)
                {
                    numerador = numerador * j;
                }

                d1 = 1; //Denominador 1: Se obtiene el factorial de 'r'
                for (int j = 1; j <= k; j++)
                {
                    d1 = d1 * j;
                }

                d2 = 1; //Denominador 2: Se obtiene el factorial de '(n-r)'
                for (int j = 1; j <= n - k; j++)
                {
                    d2 = d2 * j;
                }

                denominador = d1 * d2;
                combinacion = numerador / denominador;

                //Termina la función "combinacion" (n,r)

                valorBinomial = combinacion * Math.pow(p, k) * Math.pow(q, n - k);
                valores_rn[i] = valorBinomial;
            }

            System.out.println("Binomial");

            for (int i = 0; i < valores_rn.length; i++) //Imprime binomial
            {
                System.out.println("x" + i + ": " + valores_rn[i]);
            }

            //---------------------(2)Inicia Binomial Negativo------------------

            r = 3;
            k = 0;
            p = 0.7;
            q = 0.3;

            for (int i = 0; i < repeticiones; i++)
            {
                double temp = i;
                double contador = r;

                while (temp > 1)
                {
                    contador += r;
                    temp--;
                }

                k = contador + i; //Termina el cálculo de x

                //Inicia la función "combinacion" de (k-1, r-1)

                numerador = 1; //Numerador: Se obtiene el factorial de '(k-1)'
                for (int j = 1; j <= (k - 1); j++)
                {
                    numerador = numerador * j;
                }

                d1 = 1; //Denominador 1: Se obtiene el factorial de '(r-1)'
                for (int j = 1; j <= (r - 1); j++)
                {
                    d1 = d1 * j;
                }

                d2 = 1; //Denominador 2: Se obtiene el factorial de '(k-1)-(r-1)'
                for (int j = 1; j <= ((k - 1) - (r - 1)); j++)
                {
                    d2 = d2 * j;
                }

                denominador = d1 * d2;
                combinacion = numerador / denominador;

                //Termina la función "combinacion" de (k-1, r-1)

                binomialNeg = combinacion * Math.pow(p, r) * Math.pow(q, k - r);
                valores_rn[i] = binomialNeg;
            }

            System.out.println("Binomial Negativo");

            for (int i = 0; i < valores_rn.length; i++) //Imprime Binomial Negativo
            {
                System.out.println("x" + i + ": " + valores_rn[i]);
            }

            //------------------------(3)Inicia Poisson-------------------------

            e = Math.E;
            landa = 3;
            k = 0;

            for (int i = 0; i < repeticiones; i++, k++)
            {
                double factorial = 1; //Inicia factorial(k)

                for (int j = 1; j <= k; j++)
                {
                    factorial = factorial * j;
                }

                valorPoisson = Math.pow(e, landa * -1) * (Math.pow(landa, k) / factorial);
                valores_rn[i] = valorPoisson;
            }

            System.out.println("Poisson");

            for (int i = 0; i < valores_rn.length; i++) //Imprime Poisson
            {
                System.out.println("x" + i + ": " + valores_rn[i]);
            }

            //-----------------------(4)Inicia Geometrica-----------------------

            p = 0.166666;
            q = 1 - p;
            k = 1;

            for (int i = 0; i < repeticiones; i++, k++)
            {
                valorGeometrica = p * Math.pow(q, k - 1);
                valores_rn[i] = valorGeometrica;
            }

            System.out.println("Geometrica");

            for (int i = 0; i < valores_rn.length; i++) //Imprime Geometrica
            {
                System.out.println("x" + i + ": " + valores_rn[i]);
            }

            //----------------------(5)Inicia HiperGeometrica-------------------

            N = 50;
            n = 3;
            a = 6;
            k = 0;

            for (int i = 0; i < repeticiones; i++, k++)
            {
                //Se calculará: (combinacion(a,k) * combinacion(N-a,n-k)) / combinacion(N,n)
                //(A) Inicia la función "combinacion" (a,k)

                numerador = 1; //Numerador: Se obtiene el factorial de 'a'
                for (int j = 1; j <= a; j++)
                {
                    numerador = numerador * j;
                }

                d1 = 1; //Denominador 1: Se obtiene el factorial de 'k'
                for (int j = 1; j <= k; j++)
                {
                    d1 = d1 * j;
                }

                d2 = 1; //Denominador 2: Se obtiene el factorial de '(a-k)'
                for (int j = 1; j <= (a - k); j++)
                {
                    d2 = d2 * j;
                }

                denominador = d1 * d2;
                COMB1 = numerador / denominador;

                //(B) Inicia la función "combinacion" (N-a, n-k)

                numerador = 1; //Numerador: Se obtiene el factorial de '(N-a)'
                for (int j = 1; j <= (N - a); j++)
                {
                    numerador = numerador * j;
                }

                d1 = 1; //Denominador 1: Se obtiene el factorial de '(n-k)'
                for (int j = 1; j <= (n - k); j++)
                {
                    d1 = d1 * j;
                }

                d2 = 1; //Denominador 2: Se obtiene el factorial de '(N-a)-(n-k)'
                for (int j = 1; j <= ((N - a) - (n - k)); j++)
                {
                    d2 = d2 * j;
                }

                denominador = d1 * d2;
                COMB2 = numerador / denominador;

                //(C) Inicia la función "combinacion" (N,n)

                numerador = 1; //Numerador: Se obtiene el factorial de 'N'
                for (int j = 1; j <= N; j++)
                {
                    numerador = numerador * j;
                }

                d1 = 1; //Denominador 1: Se obtiene el factorial de 'n'
                for (int j = 1; j <= n; j++)
                {
                    d1 = d1 * j;
                }

                d2 = 1; //Denominador 2: Se obtiene el factorial de '(N-n)'
                for (int j = 1; j <= (N - n); j++)
                {
                    d2 = d2 * j;
                }

                denominador = d1 * d2;
                COMB3 = numerador / denominador;
                hiperGeom = (COMB1 * COMB2) / COMB3;
                valores_rn[i] = hiperGeom;
            }

            System.out.println("HiperGeometrica");

            for (int i = 0; i < valores_rn.length; i++) //Imprime HiperGeometrica
            {
                System.out.println("x" + i + ": " + valores_rn[i]);
            }

            //------------------------(6)Inicia Bernoulli-----------------------
            p = 0.1666;

            for (int i = 0; i < repeticiones; i++, p -= 0.05)
            {
                bernoulli = 1 - p;
                valores_rn[i] = bernoulli;
            }

            System.out.println("Bernoulli");

            for (int i = 0; i < valores_rn.length; i++) //Imprime Bernoulli
            {
                System.out.println("x" + i + ": " + valores_rn[i]);
            }

            //-----------------------(7)Inicia Multinomial----------------------

            n = 4;
            X = new double[] {3, 0, 1};
            P = new double[] {0.5, 0.3, 0.2};

            for (int i = 0; i < repeticiones; i++, n += 0.5)
            {
                fn = 1;
                for (int j = 1; j <= n; j++) //Se obtiene: factorial(n)
                {
                    fn = fn * j;
                }

                double fX0 = 1;
                for (int j = 1; j <= X[0]; j++) //Se obtiene: factorial(X[0])
                {
                    fX0 = fX0 * j;
                }

                double fX1 = 1;
                for (int j = 1; j <= X[1]; j++) //Se obtiene: factorial(X[1])
                {
                    fX1 = fX1 * j;
                }

                double fX2 = 1;
                for (int j = 1; j <= X[2]; j++) //Se obtiene: factorial(X[2])
                {
                    fX2 = fX2 * j;
                }

                a = (fn / (fX0 * fX1 * fX2));
                b = Math.pow(P[0], X[0]) * Math.pow(P[1], X[1]) * Math.pow(P[2], X[2]);
                multinomial = a * b;
                valores_rn[i] = multinomial;
            }

            System.out.println("Multinomial");

            for (int i = 0; i < valores_rn.length; i++) //Imprime Multinomial
            {
                System.out.println("x" + i + ": " + valores_rn[i]);
            }

            //----------------------(8)Inicia Uniforme Discreta-----------------

            a = 5;
            b = 10;
            x = 5;

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

            System.out.println("Uniforme discreta");

            for (int i = 0; i < valores_rn.length; i++) //Imprime Uniforme Discreta
            {
                System.out.println("x" + i + ": " + valores_rn[i]);
            }
        }
        catch (Exception ex)
        {
            System.out.println("Error en el Caso de Prueba: Discretas\n" + ex);
        }

        long tiempoFinal = System.currentTimeMillis();
        return (tiempoFinal - tiempoInicio) / 1000.00; //Tiempo de respuesta
    }
}