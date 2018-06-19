/*-----------------------------------------------------------------------------
| Caso de Prueba #1: "Multiplicación de matrices mediante el algoritmo de      |
|                     Hipercubo Simple" (A4)                                   |
| Versión: 1.0    Fecha: Enero del 2013                                        |
| Autor: ISC. Luis César Guadarrama Rogel email: cesarguadarrama@cenidet.edu.mx|
-------------------------------------------------------------------------------
| La mutliplicación de matrices mediante el hipercubo simple tiene 3 pasos:    |
| (1) Se intercambian los valores de las matrices A y B                        |
| (2) Se realiza la multiplicación de los valores almacenados en cada nodo     |
| (3) Se realiza la suma de los nodos relacionados entre si                    |
------------------------------------------------------------------------------*/
package Hipercubo_A4;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService()
public class A4_Hipercubo
{
    @WebMethod(operationName = "peticionHipercuboA4")
    public double peticionHipercuboA4(@WebParam(name = "dimension")int dimension) 
    {
        long tiempoInicio = System.currentTimeMillis();

        try
        {
            new Algoritmo().iniciar(dimension);
        }
        catch (Exception ex)
        {
            System.out.println("Error en el Caso de Prueba: Hipercubo\n" + ex);
        }

        long tiempoFinal = System.currentTimeMillis();
        return (tiempoFinal - tiempoInicio) / 1000.00; //Tiempo de respuesta
    }
}