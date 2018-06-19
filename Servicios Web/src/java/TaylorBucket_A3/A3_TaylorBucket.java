/*-----------------------------------------------------------------------------
| Caso de Prueba #3: Ordenamiento de Series de Taylor mediante BucketSort (A3) |
| Version: 1.0    Fecha: Enero del 2013                                        |
| Autor: ISC. Luis César Guadarrama Rogel email: cesarguadarrama@cenidet.edu.mx|
-------------------------------------------------------------------------------
| El ordenamiento de las series de Taylor tiene 3 pasos:                       |
| 1: Se genera la serie de Taylor a ordenar                                    |
| 2: Se invoca al algoritmo BucketSort el cual cada uno de los casilleros      |
| 3: Se invoca al subalgoritmo para ordenar cada uno de los datos almacenados  |
------------------------------------------------------------------------------*/
package TaylorBucket_A3;

import java.math.BigDecimal;
import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService()
public class A3_TaylorBucket
{
    @WebMethod(operationName = "peticionTaylorBucketA3")
    public double peticionTaylorBucketA3(
    @WebParam(name = "total") int total,
    @WebParam(name = "totalCasilleros") int numCasilleros,
    @WebParam(name = "subAlgoritmo") int subAlgoritmo)
    {
        long tiempoInicio = System.currentTimeMillis();

        try
        {
            Operaciones op = new Operaciones(total, numCasilleros, subAlgoritmo);
            ArrayList<BigDecimal> serieTaylor = op.taylorSeno();
            op.bucketSort(serieTaylor);
        }

        catch (Exception ex)
        {
            System.out.println("Error en el Caso de Prueba: Taylor\n" + ex);
        }

        long tiempoFinal = System.currentTimeMillis();
        return (tiempoFinal - tiempoInicio) / 1000.00; //Tiempo de respuesta
    }
}