
package continuas_fa2;

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
@WebService(name = "A2_FContinuas", targetNamespace = "http://Continuas_FA2/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface A2FContinuas {


    /**
     * 
     * @param tipoMetodos
     * @param totalContinuas
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "peticionContinuasFA2", targetNamespace = "http://Continuas_FA2/", className = "continuas_fa2.PeticionContinuasFA2")
    @ResponseWrapper(localName = "peticionContinuasFA2Response", targetNamespace = "http://Continuas_FA2/", className = "continuas_fa2.PeticionContinuasFA2Response")
    @Action(input = "http://Continuas_FA2/A2_FContinuas/peticionContinuasFA2Request", output = "http://Continuas_FA2/A2_FContinuas/peticionContinuasFA2Response")
    public double peticionContinuasFA2(
        @WebParam(name = "totalContinuas", targetNamespace = "")
        int totalContinuas,
        @WebParam(name = "tipoMetodos", targetNamespace = "")
        int tipoMetodos);

}
