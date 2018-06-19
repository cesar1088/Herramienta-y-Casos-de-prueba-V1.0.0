
package taylorbucket_a3;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "A3_TaylorBucket", targetNamespace = "http://TaylorBucket_A3/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface A3TaylorBucket {


    /**
     * 
     * @param total
     * @param totalCasilleros
     * @param subAlgoritmo
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "peticionTaylorBucketA3", targetNamespace = "http://TaylorBucket_A3/", className = "taylorbucket_a3.PeticionTaylorBucketA3")
    @ResponseWrapper(localName = "peticionTaylorBucketA3Response", targetNamespace = "http://TaylorBucket_A3/", className = "taylorbucket_a3.PeticionTaylorBucketA3Response")
    @Action(input = "http://TaylorBucket_A3/A3_TaylorBucket/peticionTaylorBucketA3Request", output = "http://TaylorBucket_A3/A3_TaylorBucket/peticionTaylorBucketA3Response")
    public double peticionTaylorBucketA3(
        @WebParam(name = "total", targetNamespace = "")
        int total,
        @WebParam(name = "totalCasilleros", targetNamespace = "")
        int totalCasilleros,
        @WebParam(name = "subAlgoritmo", targetNamespace = "")
        int subAlgoritmo);

}
