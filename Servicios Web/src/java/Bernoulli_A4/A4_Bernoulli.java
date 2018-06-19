/*-----------------------------------------------------------------------------
| Caso de Prueba #2: Generación de Números de Bernoulli (A4)                   |
| Version: 1.0    Fecha: Enero del 2013                                        |
| Autor: ISC. Luis César Guadarrama Rogel email: cesarguadarrama@cenidet.edu.mx|
-------------------------------------------------------------------------------
| La generación de los números de Bernoulli tiene 3 pasos:                     |
| 1: Se obtiene la combinación(A)                                              |
| 2: Se calcula el multiplicador(B)que equivale a numerador/denominador (B1/B2)|
| 3: Se realiza el producto(C) que equivale a (A x B)                          |
------------------------------------------------------------------------------*/
package Bernoulli_A4;

import java.math.BigInteger;
import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService()
public class A4_Bernoulli
{
    @WebMethod(operationName = "peticionBernoulliA1")
    public double peticionBernoulliA1(@WebParam(name = "n") int n)
    {
        long tiempoInicio = System.currentTimeMillis();

        try
        {
            Fraccion A, B, C;
            Fraccion dividendo, divisor, resultado;
            ArrayList<Fraccion> Bernoulli = new ArrayList();
            Bernoulli.add(new Fraccion(BigInteger.ONE, BigInteger.ONE));
            int posicion = 1;

            while (posicion < n)
            {
                resultado = new Fraccion(BigInteger.ZERO, BigInteger.ONE);

                for (int i = 0; i < posicion; i++)
                {
                    A = new Combinacion().calcular(posicion, i); //Inicia el paso 1
                    A = new Simplificacion().simplificar(A.NUM, A.DEN);

                    dividendo = Bernoulli.get(i);
                    divisor = new Fraccion(new BigInteger(String.valueOf(posicion + 1 - i)), BigInteger.ONE);
                    B = new Division().calcular(dividendo, divisor); //Inicia el paso 2
                    B = new Simplificacion().simplificar(B.NUM, B.DEN);

                    C = new Multiplicacion().calcular(A, B); //Inicia el paso 3
                    C = new Simplificacion().simplificar(C.NUM, C.DEN);
                    C.NUM = C.NUM.negate();

                    resultado = new Suma().calcular(resultado, C);
                }

                resultado = new Simplificacion().simplificar(resultado.NUM, resultado.DEN);
                Bernoulli.add(resultado);
                posicion++;
            }

            new Imprimir().imprimir(Bernoulli);
        }

        catch (Exception ex)
        {
            System.out.println("Error en el Caso de Prueba: Bernoulli\n" + ex);
        }

        long tiempoFinal = System.currentTimeMillis();
        return (tiempoFinal - tiempoInicio) / 1000.00; //Tiempo de Respuesta
    }
}
