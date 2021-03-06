
package discretas_da1;

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
@WebService(name = "A1_DDiscretas", targetNamespace = "http://Discretas_DA1/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface A1DDiscretas {


    /**
     * 
     * @param repeticiones
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "peticionDiscretasDA1", targetNamespace = "http://Discretas_DA1/", className = "discretas_da1.PeticionDiscretasDA1")
    @ResponseWrapper(localName = "peticionDiscretasDA1Response", targetNamespace = "http://Discretas_DA1/", className = "discretas_da1.PeticionDiscretasDA1Response")
    @Action(input = "http://Discretas_DA1/A1_DDiscretas/peticionDiscretasDA1Request", output = "http://Discretas_DA1/A1_DDiscretas/peticionDiscretasDA1Response")
    public double peticionDiscretasDA1(
        @WebParam(name = "repeticiones", targetNamespace = "")
        int repeticiones);

}
