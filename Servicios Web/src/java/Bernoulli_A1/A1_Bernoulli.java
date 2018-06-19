/*-----------------------------------------------------------------------------
| Caso de Prueba #2: Generación de Números de Bernoulli (A1)                   |
| Version: 1.0    Fecha: Enero del 2013                                        |
| Autor: ISC. Luis César Guadarrama Rogel email: cesarguadarrama@cenidet.edu.mx|
-------------------------------------------------------------------------------
| La generación de los números de Bernoulli tiene 3 pasos:                     |
| 1: Se obtiene la combinación(A)                                              |
| 2: Se calcula el multiplicador(B)que equivale a numerador/denominador (B1/B2)|
| 3: Se realiza el producto(C) que equivale a (A x B)                          |
------------------------------------------------------------------------------*/
package Bernoulli_A1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService()
public class A1_Bernoulli
{
    @WebMethod(operationName = "peticionBernoulliA1")
    public double peticionBernoulliA1(@WebParam(name = "n") int n)
    {
        long tiempoInicio = System.currentTimeMillis();

        try
        {
            ArrayList Fraccion = new ArrayList();
            Fraccion.add(BigInteger.ONE);
            Fraccion.add(BigInteger.ONE);
            ArrayList<ArrayList<BigInteger>> Bernoulli = new ArrayList();
            Bernoulli.add(Fraccion);
            ArrayList<BigInteger> A, B, C, dividendo, divisor, inversa, resultado;
            BigInteger Aa, Ab, temp, u, v, r, num, den, factor1, factor2;
            BigInteger c1, c2, resA, resB;
            int posicion = 1;

            while(posicion < n)
            {
                resultado = new ArrayList();
                resultado.add(BigInteger.ZERO);
                resultado.add(BigInteger.ONE);

                for (int i = 0; i < posicion; i++)
                {
                    //Inicia el Paso 1(Combinación). Se necesitan 3 factoriales:

                    Aa = BigInteger.ONE;
                    for (int b = 1; b <= posicion; b++) //Factorial 1
                    {
                        Aa = Aa.multiply(BigInteger.valueOf(b));
                    }

                    Ab = BigInteger.ONE;
                    for(int c = 1; c <= i; c++) //Factorial 2
                    {
                        Ab = Ab.multiply(BigInteger.valueOf(c));
                    }

                    temp = BigInteger.ONE; //Factorial 3
                    for(int d = 1; d <= (posicion - i); d++)
                    {
                        temp = temp.multiply(BigInteger.valueOf(d));
                    }

                    Ab = Ab.multiply(temp);

                    A = new ArrayList();
                    A.add(Aa);
                    A.add(Ab);

                    u = A.get(0).abs(); //Se obtiene el M.D.C de 'A'
                    v = A.get(1).abs();

                    if(v.signum() == 0)
                    {
                        break;
                    }

                    while(v.signum() != 0)
                    {
                        r = u.mod(v);
                        u = v;
                        v = r;
                    }

                    num = A.get(0); //Se procede a simplificar a 'A'
                    den = A.get(1);

                    num = num.divide(u);
                    den = den.divide(u); //Se termina de simplificar a 'A'
                    A.set(0, num);
                    A.set(1, den);

                    //Inicia el Paso 2 (Dividendo y divisor)

                    dividendo = Bernoulli.get(i);
                    divisor = new ArrayList();
                    divisor.add(new BigInteger(String.valueOf(posicion + 1 - i)));
                    divisor.add(BigInteger.ONE);

                    inversa = new ArrayList();
                    inversa.add(divisor.get(1)); //Para dividir se aplica inversa
                    inversa.add(divisor.get(0)); //Para dividir se aplica inversa

                    //A continuación se multiplica para obtener la función divisor
                    factor1 = dividendo.get(0).multiply(inversa.get(0));
                    factor2 = dividendo.get(1).multiply(inversa.get(1));

                    B = new ArrayList();
                    B.add(factor1);
                    B.add(factor2);

                    u = B.get(0).abs(); //Se obtiene el M.D.C de 'B'
                    v = B.get(1).abs();

                    if(v.signum() == 0)
                    {
                        break;
                    }

                    while(v.signum() != 0)
                    {
                        r = u.mod(v);
                        u = v;
                        v = r;
                    }

                    num = B.get(0); //Se procede a simplificar a 'B'
                    den = B.get(1);

                    num = num.divide(u);
                    den = den.divide(u); //Se termina de simplificar a 'B'
                    B.set(0, num);
                    B.set(1, den);

                    //Inicia el Paso 3 (Producto de AxB = C)

                    c1 = A.get(0).multiply(B.get(0));
                    c2 = A.get(1).multiply(B.get(1));

                    C = new ArrayList();
                    C.add(c1);
                    C.add(c2);

                    u = C.get(0).abs(); //Se obtiene el M.D.C de 'C'
                    v = C.get(1).abs();

                    if(v.signum() == 0)
                    {
                        break;
                    }

                    while(v.signum() != 0)
                    {
                        r = u.mod(v);
                        u = v;
                        v = r;
                    }

                    num = C.get(0); //Se procede a simplificar a 'C'
                    den = C.get(1);

                    num = num.divide(u);
                    den = den.divide(u); //Se termina de simplificar a 'C'
                    C.set(0, num);
                    C.set(1, den);
                    C.set(0, C.get(0).negate());

                    //Se realiza la sumatoria

                    resA = resultado.get(0).multiply(C.get(1)).add(C.get(0).multiply(resultado.get(1)));
                    resB = resultado.get(1).multiply(C.get(1));

                    resultado.set(0, resA);
                    resultado.set(1, resB);

                } // Termina el ciclo for

                u = resultado.get(0).abs(); //Se obtiene el M.D.C de 'resultado'
                v = resultado.get(1).abs();

                if(v.signum() == 0)
                {
                    break;
                }

                while(v.signum() != 0)
                {
                    r = u.mod(v);
                    u = v;
                    v = r;
                }

                num = resultado.get(0); //Se procede a simplificar a 'C'
                den = resultado.get(1);

                num = num.divide(u);
                den = den.divide(u); //Se termina de simplificar a 'resultado'
                resultado.set(0, num);
                resultado.set(1, den);

                Bernoulli.add(resultado);
                posicion++;
            }

            Iterator<ArrayList<BigInteger>> iterador = Bernoulli.listIterator();
            ArrayList actual;
            int i = 0;

            while(iterador.hasNext()) // Se imprimen los resultados
            {
                actual = iterador.next();
                System.out.println("B" + i + ": " + actual.get(0) + "/" + actual.get(1));
                i++;
            }
        }

        catch(Exception ex)
        {
            System.out.println("Error en el Caso de Prueba: Bernoulli\n" + ex);
        }

        long tiempoFinal = System.currentTimeMillis();
        return (tiempoFinal - tiempoInicio) / 1000.00; //Tiempo de respuesta
    }
}
