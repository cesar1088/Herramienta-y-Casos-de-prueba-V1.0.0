
package continuas_fa3;

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
@WebService(name = "A3_FContinuas", targetNamespace = "http://Continuas_FA3/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface A3FContinuas {


    /**
     * 
     * @param tipoAleatorios
     * @param repeticiones
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "peticionContinuasFA3", targetNamespace = "http://Continuas_FA3/", className = "continuas_fa3.PeticionContinuasFA3")
    @ResponseWrapper(localName = "peticionContinuasFA3Response", targetNamespace = "http://Continuas_FA3/", className = "continuas_fa3.PeticionContinuasFA3Response")
    @Action(input = "http://Continuas_FA3/A3_FContinuas/peticionContinuasFA3Request", output = "http://Continuas_FA3/A3_FContinuas/peticionContinuasFA3Response")
    public double peticionContinuasFA3(
        @WebParam(name = "repeticiones", targetNamespace = "")
        int repeticiones,
        @WebParam(name = "tipoAleatorios", targetNamespace = "")
        int tipoAleatorios);

}
