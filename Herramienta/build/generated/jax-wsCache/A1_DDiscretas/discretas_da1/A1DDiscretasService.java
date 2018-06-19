
package discretas_da1;

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
@WebServiceClient(name = "A1_DDiscretasService", targetNamespace = "http://Discretas_DA1/", wsdlLocation = "http://192.168.0.107:8080/Servicios_Web/A1_DDiscretas?wsdl")
public class A1DDiscretasService
    extends Service
{

    private final static URL A1DDISCRETASSERVICE_WSDL_LOCATION;
    private final static WebServiceException A1DDISCRETASSERVICE_EXCEPTION;
    private final static QName A1DDISCRETASSERVICE_QNAME = new QName("http://Discretas_DA1/", "A1_DDiscretasService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.0.107:8080/Servicios_Web/A1_DDiscretas?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        A1DDISCRETASSERVICE_WSDL_LOCATION = url;
        A1DDISCRETASSERVICE_EXCEPTION = e;
    }

    public A1DDiscretasService() {
        super(__getWsdlLocation(), A1DDISCRETASSERVICE_QNAME);
    }

    public A1DDiscretasService(WebServiceFeature... features) {
        super(__getWsdlLocation(), A1DDISCRETASSERVICE_QNAME, features);
    }

    public A1DDiscretasService(URL wsdlLocation) {
        super(wsdlLocation, A1DDISCRETASSERVICE_QNAME);
    }

    public A1DDiscretasService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, A1DDISCRETASSERVICE_QNAME, features);
    }

    public A1DDiscretasService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public A1DDiscretasService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns A1DDiscretas
     */
    @WebEndpoint(name = "A1_DDiscretasPort")
    public A1DDiscretas getA1DDiscretasPort() {
        return super.getPort(new QName("http://Discretas_DA1/", "A1_DDiscretasPort"), A1DDiscretas.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns A1DDiscretas
     */
    @WebEndpoint(name = "A1_DDiscretasPort")
    public A1DDiscretas getA1DDiscretasPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Discretas_DA1/", "A1_DDiscretasPort"), A1DDiscretas.class, features);
    }

    private static URL __getWsdlLocation() {
        if (A1DDISCRETASSERVICE_EXCEPTION!= null) {
            throw A1DDISCRETASSERVICE_EXCEPTION;
        }
        return A1DDISCRETASSERVICE_WSDL_LOCATION;
    }

}