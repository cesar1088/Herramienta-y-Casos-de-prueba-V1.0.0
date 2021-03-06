
package discretas_da2;

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
@WebServiceClient(name = "A2_DDiscretasService", targetNamespace = "http://Discretas_DA2/", wsdlLocation = "http://192.168.0.107:8080/Servicios_Web/A2_DDiscretas?wsdl")
public class A2DDiscretasService
    extends Service
{

    private final static URL A2DDISCRETASSERVICE_WSDL_LOCATION;
    private final static WebServiceException A2DDISCRETASSERVICE_EXCEPTION;
    private final static QName A2DDISCRETASSERVICE_QNAME = new QName("http://Discretas_DA2/", "A2_DDiscretasService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.0.107:8080/Servicios_Web/A2_DDiscretas?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        A2DDISCRETASSERVICE_WSDL_LOCATION = url;
        A2DDISCRETASSERVICE_EXCEPTION = e;
    }

    public A2DDiscretasService() {
        super(__getWsdlLocation(), A2DDISCRETASSERVICE_QNAME);
    }

    public A2DDiscretasService(WebServiceFeature... features) {
        super(__getWsdlLocation(), A2DDISCRETASSERVICE_QNAME, features);
    }

    public A2DDiscretasService(URL wsdlLocation) {
        super(wsdlLocation, A2DDISCRETASSERVICE_QNAME);
    }

    public A2DDiscretasService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, A2DDISCRETASSERVICE_QNAME, features);
    }

    public A2DDiscretasService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public A2DDiscretasService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns A2DDiscretas
     */
    @WebEndpoint(name = "A2_DDiscretasPort")
    public A2DDiscretas getA2DDiscretasPort() {
        return super.getPort(new QName("http://Discretas_DA2/", "A2_DDiscretasPort"), A2DDiscretas.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns A2DDiscretas
     */
    @WebEndpoint(name = "A2_DDiscretasPort")
    public A2DDiscretas getA2DDiscretasPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Discretas_DA2/", "A2_DDiscretasPort"), A2DDiscretas.class, features);
    }

    private static URL __getWsdlLocation() {
        if (A2DDISCRETASSERVICE_EXCEPTION!= null) {
            throw A2DDISCRETASSERVICE_EXCEPTION;
        }
        return A2DDISCRETASSERVICE_WSDL_LOCATION;
    }

}
