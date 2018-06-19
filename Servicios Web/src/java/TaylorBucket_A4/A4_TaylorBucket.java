/*-----------------------------------------------------------------------------
| Caso de Prueba #3: Ordenamiento de Series de Taylor mediante BucketSort (A4) |
| Version: 1.0    Fecha: Enero del 2013                                        |
| Autor: ISC. Luis César Guadarrama Rogel email: cesarguadarrama@cenidet.edu.mx|
-------------------------------------------------------------------------------
| El ordenamiento de las series de Taylor tiene 3 pasos:                       |
| 1: Se genera la serie de Taylor a ordenar                                    |
| 2: Se invoca al algoritmo BucketSort el cual cada uno de los casilleros      |
| 3: Se invoca al subalgoritmo para ordenar cada uno de los datos almacenados  |
------------------------------------------------------------------------------*/
package TaylorBucket_A4;

import java.math.BigDecimal;
import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService()
public class A4_TaylorBucket
{
    @WebMethod(operationName = "peticionTaylorBucketA4")
    public double peticionTaylorBucketA4(
    @WebParam(name = "total") int total,
    @WebParam(name = "totalCasilleros") int totalCasilleros,
    @WebParam(name = "subAlgoritmo") int subAlgoritmo)
    {
        long tiempoInicio = System.currentTimeMillis();

        try
        {
            ArrayList<BigDecimal> serieTaylor = new SerieTaylor(total).seno();
            BucketSort bs = new BucketSort(totalCasilleros, subAlgoritmo);
            bs.generar(serieTaylor);
        }

        catch (Exception ex)
        {
            System.out.println("Error en el Caso de Prueba: Taylor\n" + ex);
        }

        long tiempoFinal = System.currentTimeMillis();
        return (tiempoFinal - tiempoInicio) / 1000.00; //Tiempo de respuesta

    }
}