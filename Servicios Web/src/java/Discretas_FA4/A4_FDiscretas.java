/*-----------------------------------------------------------------------------
| Caso de Prueba #5: "Generación de Variables Aleatorias Discretas" (A4)(FLOAT)|
| Version: 1.0    Fecha: Enero del 2013                                        |
| Autor: ISC. Luis César Guadarrama Rogel email: cesarguadarrama@cenidet.edu.mx|
-------------------------------------------------------------------------------
| La generación de las variables aleatorias utilizando diversas distribuciones |
| de probabilidad: (1)Binomial. (2)Binomial Negativo. (3)Poisson. (4)Geométrica|
| (5)Hipergeométrica. (6)Bernoulli. (7)Multinomial. (8)Uniforme Discreta       |
------------------------------------------------------------------------------*/
package Discretas_FA4;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService()
public class A4_FDiscretas
{
    @WebMethod(operationName = "peticionDiscretasFA4")
    public double peticionDiscretasFA4(@WebParam(name = "repeticiones") int repeticiones)
    {
        long tiempoInicio = System.currentTimeMillis();

        try
        {
            Imprimir im = new Imprimir();
            System.out.println("Binomial");
            im.imprime(new Binomial().calcular(repeticiones));
            System.out.println("Binomial Negativo");
            im.imprime(new BinomialNeg().calcular(repeticiones));
            System.out.println("Poisson");
            im.imprime(new Poisson().calcular(repeticiones));
            System.out.println("Geometrica");
            im.imprime(new Geometrica().calcular(repeticiones));
            System.out.println("HiperGeometrica");
            im.imprime(new HipGeometrica().calcular(repeticiones));
            System.out.println("Bernoulli");
            im.imprime(new Bernoulli().calcular(repeticiones));
            System.out.println("Multinomial");
            im.imprime(new Multinomial().calcular(repeticiones));
            System.out.println("Uniforme Discreta");
            im.imprime(new UDiscreta().calcular(repeticiones));
        }
        catch (Exception ex)
        {
            System.out.println("Error en el Caso de Prueba: Discretas\n" + ex);
        }

        long tiempoFinal = System.currentTimeMillis();
        return (tiempoFinal - tiempoInicio) / 1000.00; //Tiempo de respuesta
    }
}