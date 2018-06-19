
package discretas_da3;

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
@WebServiceClient(name = "A3_DDiscretasService", targetNamespace = "http://Discretas_DA3/", wsdlLocation = "http://192.168.0.107:8080/Servicios_Web/A3_DDiscretas?wsdl")
public class A3DDiscretasService
    extends Service
{

    private final static URL A3DDISCRETASSERVICE_WSDL_LOCATION;
    private final static WebServiceException A3DDISCRETASSERVICE_EXCEPTION;
    private final static QName A3DDISCRETASSERVICE_QNAME = new QName("http://Discretas_DA3/", "A3_DDiscretasService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.0.107:8080/Servicios_Web/A3_DDiscretas?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        A3DDISCRETASSERVICE_WSDL_LOCATION = url;
        A3DDISCRETASSERVICE_EXCEPTION = e;
    }

    public A3DDiscretasService() {
        super(__getWsdlLocation(), A3DDISCRETASSERVICE_QNAME);
    }

    public A3DDiscretasService(WebServiceFeature... features) {
        super(__getWsdlLocation(), A3DDISCRETASSERVICE_QNAME, features);
    }

    public A3DDiscretasService(URL wsdlLocation) {
        super(wsdlLocation, A3DDISCRETASSERVICE_QNAME);
    }

    public A3DDiscretasService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, A3DDISCRETASSERVICE_QNAME, features);
    }

    public A3DDiscretasService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public A3DDiscretasService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns A3DDiscretas
     */
    @WebEndpoint(name = "A3_DDiscretasPort")
    public A3DDiscretas getA3DDiscretasPort() {
        return super.getPort(new QName("http://Discretas_DA3/", "A3_DDiscretasPort"), A3DDiscretas.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns A3DDiscretas
     */
    @WebEndpoint(name = "A3_DDiscretasPort")
    public A3DDiscretas getA3DDiscretasPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Discretas_DA3/", "A3_DDiscretasPort"), A3DDiscretas.class, features);
    }

    private static URL __getWsdlLocation() {
        if (A3DDISCRETASSERVICE_EXCEPTION!= null) {
            throw A3DDISCRETASSERVICE_EXCEPTION;
        }
        return A3DDISCRETASSERVICE_WSDL_LOCATION;
    }

}