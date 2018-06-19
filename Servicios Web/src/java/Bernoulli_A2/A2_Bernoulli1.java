/*-----------------------------------------------------------------------------
| Caso de Prueba #2: Generación de Números de Bernoulli (A2)                   |
| Version: 1.0    Fecha: Enero del 2013                                        |
| Autor: ISC. Luis César Guadarrama Rogel email: cesarguadarrama@cenidet.edu.mx|
-------------------------------------------------------------------------------
| La generación de los números de Bernoulli tiene 3 pasos:                     |
| 1: Se obtiene la combinación(A)                                              |
| 2: Se calcula el multiplicador(B)que equivale a numerador/denominador (B1/B2)|
| 3: Se realiza el producto(C) que equivale a (A x B)                          |
------------------------------------------------------------------------------*/
package Bernoulli_A2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService()
public class A2_Bernoulli1
{
    @WebMethod(operationName = "peticionBernoulliA2")
    public double peticionBernoulliA2(@WebParam(name = "n") int n)
    {
        long tiempoInicio = System.currentTimeMillis();

        try
        {
            ArrayList Fraccion = new ArrayList();
            Fraccion.add(BigInteger.ONE);
            Fraccion.add(BigInteger.ONE);
            ArrayList<ArrayList<BigInteger>> Bernoulli = new ArrayList();
            Bernoulli.add(Fraccion);
            ArrayList A, B, dividendo, divisor, resultado;
            ArrayList<BigInteger> C;
            int posicion = 1;

            while (posicion < n)
            {
                resultado = new ArrayList();
                resultado.add(BigInteger.ZERO);
                resultado.add(BigInteger.ONE);

                for (int i = 0; i < posicion; i++)
                {
                    A = combinacion(posicion, i); //Inicia el paso 1
                    A = simplicacion(A);

                    dividendo = Bernoulli.get(i); //Inicia el paso 2
                    divisor = new ArrayList();
                    divisor.add(new BigInteger(String.valueOf(posicion + 1 - i)));
                    divisor.add(BigInteger.ONE);

                    B = division(dividendo, divisor);
                    B = simplicacion(B);

                    C = multiplicacion(A, B); //Inicia el paso 3
                    C = simplicacion(C);
                    C.set(0, C.get(0).negate());

                    resultado = suma(resultado, C);
                }

                resultado = simplicacion(resultado);
                Bernoulli.add(resultado);
                posicion++;
            }

            imprimir(Bernoulli);
        }

        catch (Exception ex)
        {
            System.out.println("Error en el Caso de Prueba: Bernoulli\n" + ex);
        }

        long tiempoFinal = System.currentTimeMillis();
        return (tiempoFinal - tiempoInicio) / 1000.00; //Tiempo de Respuesta
    }

    private void imprimir(ArrayList Bernoulli)
    {
        ArrayList<BigInteger> actual;
        Iterator<ArrayList<BigInteger>> iterador = Bernoulli.listIterator();
        int i = 0;

        while (iterador.hasNext())
        {
            actual = iterador.next();
            System.out.println("B" + i + ": " + actual.get(0) + "/" + actual.get(1));
            i++;
        }
    }

    private ArrayList suma(ArrayList<BigInteger> a, ArrayList<BigInteger> b)
    {
        BigInteger num = a.get(0).multiply(b.get(1)).add(b.get(0).multiply(a.get(1)));
        BigInteger den = a.get(1).multiply(b.get(1));

        ArrayList lista = new ArrayList();
        lista.add(num);
        lista.add(den);

        return lista;
    }

    private ArrayList resta(ArrayList<BigInteger> a, ArrayList<BigInteger> b)
    {
        BigInteger num = a.get(0).multiply(b.get(1)).subtract(b.get(0).multiply(a.get(1)));
        BigInteger den = a.get(1).multiply(b.get(1));

        ArrayList lista = new ArrayList();
        lista.add(num);
        lista.add(den);

        return lista;
    }

    private ArrayList multiplicacion(ArrayList<BigInteger> a, ArrayList<BigInteger> b)
    {
        BigInteger factor1 = a.get(0).multiply(b.get(0));
        BigInteger factor2 = a.get(1).multiply(b.get(1));

        ArrayList lista = new ArrayList();
        lista.add(factor1);
        lista.add(factor2);

        return lista;
    }

    private ArrayList division(ArrayList<BigInteger> a, ArrayList<BigInteger> b)
    {
        return multiplicacion(a, inversa(b));
    }

    private ArrayList inversa(ArrayList<BigInteger> a)
    {
        ArrayList lista = new ArrayList();
        lista.add(a.get(1));
        lista.add(a.get(0));

        return lista;
    }

    private BigInteger mcd(BigInteger num, BigInteger den)
    {
        BigInteger u = num.abs();
        BigInteger v = den.abs();

        if (v.signum() == 0)
        {
            return u;
        }

        BigInteger r;

        while (v.signum() != 0)
        {
            r = u.mod(v);
            u = v;
            v = r;
        }

        return u;
    }

    private ArrayList simplicacion(ArrayList<BigInteger> a)
    {
        BigInteger dividir = mcd(a.get(0), a.get(1));
        BigInteger num = a.get(0);
        BigInteger den = a.get(1);

        num = num.divide(dividir);
        den = den.divide(dividir);

        ArrayList salida = new ArrayList();
        salida.add(num);
        salida.add(den);

        return salida;
    }

    private ArrayList combinacion(int n, int r)
    {
        BigInteger dividendo = factorial(n);
        BigInteger divisor = factorial(r).multiply(factorial(n - r));

        ArrayList lista = new ArrayList();
        lista.add(dividendo);
        lista.add(divisor);

        return lista;
    }

    private BigInteger factorial(int valor)
    {
        BigInteger r = BigInteger.ONE;

        for (int i = 1; i <= valor; i++)
        {
            r = r.multiply(BigInteger.valueOf(i));
        }

        return r;
    }
}
