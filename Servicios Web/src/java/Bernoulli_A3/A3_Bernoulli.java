/*-----------------------------------------------------------------------------
| Caso de Prueba #2: Generación de Números de Bernoulli (A3)                   |
| Version: 1.0    Fecha: Enero del 2013                                        |
| Autor: ISC. Luis César Guadarrama Rogel email: cesarguadarrama@cenidet.edu.mx|
-------------------------------------------------------------------------------
| La generación de los números de Bernoulli tiene 3 pasos:                     |
| 1: Se obtiene la combinación(A)                                              |
| 2: Se calcula el multiplicador(B)que equivale a numerador/denominador (B1/B2)|
| 3: Se realiza el producto(C) que equivale a (A x B)                          |
------------------------------------------------------------------------------*/
package Bernoulli_A3;

import java.math.BigInteger;
import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService()
public class A3_Bernoulli
{
    @WebMethod(operationName = "peticionBernoulliA3")
    public double peticionBernoulliA3(@WebParam(name = "n") int n)
    {
        long tiempoInicio = System.currentTimeMillis();

        try
        {
            Fraccion A, B, C;
            Fraccion dividendo, divisor, resultado;
            Operaciones op = new Operaciones();
            ArrayList<Fraccion> Bernoulli = new ArrayList();
            Bernoulli.add(new Fraccion(BigInteger.ONE, BigInteger.ONE));
            int posicion = 1;

            while (posicion < n)
            {
                resultado = new Fraccion(BigInteger.ZERO, BigInteger.ONE);

                for (int i = 0; i < posicion; i++)
                {
                    A = op.combinacion(posicion, i); //Inicia el paso 1
                    A.simplificacion();

                    dividendo = Bernoulli.get(i);
                    divisor = new Fraccion(new BigInteger(String.valueOf(posicion + 1 - i)), BigInteger.ONE);
                    B = new Fraccion(null, null).division(dividendo, divisor); //Inicia el paso 2
                    B.simplificacion();

                    C = new Fraccion(null, null).multiplicacion(A, B); //Inicia el paso 3
                    C.simplificacion();
                    C.NUM = C.NUM.negate();

                    resultado = new Fraccion(null, null).suma(resultado, C);
                }

                resultado.simplificacion();
                Bernoulli.add(resultado);
                posicion++;
            }

            op.imprimir(Bernoulli);
        }

        catch (Exception ex)
        {
            System.out.println("Error en el Caso de Prueba: Bernoulli\n" + ex);
        }

        long tiempoFinal = System.currentTimeMillis();
        return (tiempoFinal - tiempoInicio) / 1000.00; //Tiempo de Respuesta
    }
}
