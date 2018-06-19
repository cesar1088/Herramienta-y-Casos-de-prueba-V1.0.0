
package bernoulli_a2;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "A2_Bernoulli1Service", targetNamespace = "http://Bernoulli_A2/", wsdlLocation = "http://192.168.0.107:8080/Servicios_Web/A2_Bernoulli1?wsdl")
public class A2Bernoulli1Service
    extends Service
{

    private final static URL A2BERNOULLI1SERVICE_WSDL_LOCATION;
    private final static WebServiceException A2BERNOULLI1SERVICE_EXCEPTION;
    private final static QName A2BERNOULLI1SERVICE_QNAME = new QName("http://Bernoulli_A2/", "A2_Bernoulli1Service");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.0.107:8080/Servicios_Web/A2_Bernoulli1?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        A2BERNOULLI1SERVICE_WSDL_LOCATION = url;
        A2BERNOULLI1SERVICE_EXCEPTION = e;
    }

    public A2Bernoulli1Service() {
        super(__getWsdlLocation(), A2BERNOULLI1SERVICE_QNAME);
    }

    public A2Bernoulli1Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), A2BERNOULLI1SERVICE_QNAME, features);
    }

    public A2Bernoulli1Service(URL wsdlLocation) {
        super(wsdlLocation, A2BERNOULLI1SERVICE_QNAME);
    }

    public A2Bernoulli1Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, A2BERNOULLI1SERVICE_QNAME, features);
    }

    public A2Bernoulli1Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public A2Bernoulli1Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns A2Bernoulli1
     */
    @WebEndpoint(name = "A2_Bernoulli1Port")
    public A2Bernoulli1 getA2Bernoulli1Port() {
        return super.getPort(new QName("http://Bernoulli_A2/", "A2_Bernoulli1Port"), A2Bernoulli1.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns A2Bernoulli1
     */
    @WebEndpoint(name = "A2_Bernoulli1Port")
    public A2Bernoulli1 getA2Bernoulli1Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://Bernoulli_A2/", "A2_Bernoulli1Port"), A2Bernoulli1.class, features);
    }

    private static URL __getWsdlLocation() {
        if (A2BERNOULLI1SERVICE_EXCEPTION!= null) {
            throw A2BERNOULLI1SERVICE_EXCEPTION;
        }
        return A2BERNOULLI1SERVICE_WSDL_LOCATION;
    }

}