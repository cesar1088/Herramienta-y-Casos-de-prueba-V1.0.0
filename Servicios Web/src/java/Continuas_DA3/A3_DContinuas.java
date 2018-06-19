/*-----------------------------------------------------------------------------
| Caso de Prueba #4: "Generación de Variables Aleatorias Continuas"(A3)(DOUBLE)|
| Version: 1.0    Fecha: Enero del 2013                                        |
| Autor: ISC. Luis César Guadarrama Rogel email: cesarguadarrama@cenidet.edu.mx|
-------------------------------------------------------------------------------
| La generación de las V.A se realiza mediante las distribuciones (A)Gauss,    |
| (B)Gamma y (C)Beta, las cuales utilizan un conjunto de valores 'k' obtenidos |
| mediante los Métodos Congruenciales: (1)Lineal, (2)No Lineal, (3)Aditivo y   |
| (4)Multiplicativo y los Métodos No Congruenciales: (5)Cuadrados Medios,      |
| (6)Productos Medios y (7)Multiplicador Constante)                            |
------------------------------------------------------------------------------*/
package Continuas_DA3;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService()
public class A3_DContinuas
{
    @WebMethod(operationName = "peticionContinuasDA3")
    public double peticionContinuasDA3(
    @WebParam(name = "repeticiones") int repeticiones,
    @WebParam(name = "tipoAleatorios") int tipoAleatorios)
    {
        long tiempoInicio = System.currentTimeMillis();

        try
        {
            switch (tipoAleatorios)
            {
                case 0:
                {
                    Distribuciones d = new Distribuciones(repeticiones);

                    for (int i = 0; i <= 3; i++) //Métodos Congruenciales
                    {
                        System.out.println("------ Distribución Gauss ------");
                        imprime(d.gauss(i));
                        System.out.println("------ Distribución Gamma ------");
                        imprime(d.gamma(i));
                        System.out.println("------ Distribución Beta ------");
                        imprime(d.beta(i));
                    }
                }
                break;

                case 1:
                {
                    Distribuciones d = new Distribuciones(repeticiones);

                    for (int i = 4; i <= 6; i++) //Métodos No Congruenciales
                    {
                        System.out.println("------ Distribución Gauss ------");
                        imprime(d.gauss(i));
                        System.out.println("------ Distribución Gamma ------");
                        imprime(d.gamma(i));
                        System.out.println("------ Distribución Beta ------");
                        imprime(d.beta(i));
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

    private void imprime(double[] valores)
    {
        for (int i = 0; i < valores.length; i++)
        {
            System.out.println(valores[i]);
        }
    }
}