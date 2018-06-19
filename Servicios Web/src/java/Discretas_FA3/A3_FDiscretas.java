/*-----------------------------------------------------------------------------
| Caso de Prueba #5: "Generación de Variables Aleatorias Discretas" (A3)(FLOAT)|
| Version: 1.0    Fecha: Enero del 2013                                        |
| Autor: ISC. Luis César Guadarrama Rogel email: cesarguadarrama@cenidet.edu.mx|
-------------------------------------------------------------------------------
| La generación de las variables aleatorias utilizando diversas distribuciones |
| de probabilidad: (1)Binomial. (2)Binomial Negativo. (3)Poisson. (4)Geométrica|
| (5)Hipergeométrica. (6)Bernoulli. (7)Multinomial. (8)Uniforme Discreta       |
------------------------------------------------------------------------------*/
package Discretas_FA3;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService()
public class A3_FDiscretas
{
    @WebMethod(operationName = "peticionDiscretasFA3")
    public double peticionDiscretasFA3(@WebParam(name = "repeticiones") int repeticiones)
    {
        long tiempoInicio = System.currentTimeMillis();

        try
        {
            DPFija fija = new DPFija(repeticiones);
            DPVariable variable = new DPVariable(repeticiones);

            System.out.println("Binomial");
            imprimir(variable.binomial());
            System.out.println("Binomial Negativo");
            imprimir(variable.binomialNegativo());
            System.out.println("Poisson");
            imprimir(fija.poisson());
            System.out.println("Geometrica");
            imprimir(variable.geometrica());
            System.out.println("HiperGeometrica");
            imprimir(fija.hipergeometrica());
            System.out.println("Bernoulli");
            imprimir(variable.bernoulli());
            System.out.println("Multinomial");
            imprimir(fija.multinomial());
            System.out.println("Uniforme Discreta");
            imprimir(fija.uniformeDiscreta());
        }

        catch(Exception ex)
        {
            System.out.println("Error en el Caso de Prueba: Discretas\n" + ex);
        }

        long tiempoFinal = System.currentTimeMillis();
        return (tiempoFinal - tiempoInicio) / 1000.00; //Tiempo de respuesta
    }

    private void imprimir(float [] valores)
    {
        for(int i = 0; i < valores.length; i++)
        {
            System.out.println("x" + i + ": " + valores[i]);
        }
    }
}