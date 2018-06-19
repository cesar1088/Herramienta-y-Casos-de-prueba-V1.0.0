
package discretas_fa4;

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
@WebServiceClient(name = "A4_FDiscretasService", targetNamespace = "http://Discretas_FA4/", wsdlLocation = "http://192.168.0.107:8080/Servicios_Web/A4_FDiscretas?wsdl")
public class A4FDiscretasService
    extends Service
{

    private final static URL A4FDISCRETASSERVICE_WSDL_LOCATION;
    private final static WebServiceException A4FDISCRETASSERVICE_EXCEPTION;
    private final static QName A4FDISCRETASSERVICE_QNAME = new QName("http://Discretas_FA4/", "A4_FDiscretasService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.0.107:8080/Servicios_Web/A4_FDiscretas?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        A4FDISCRETASSERVICE_WSDL_LOCATION = url;
        A4FDISCRETASSERVICE_EXCEPTION = e;
    }

    public A4FDiscretasService() {
        super(__getWsdlLocation(), A4FDISCRETASSERVICE_QNAME);
    }

    public A4FDiscretasService(WebServiceFeature... features) {
        super(__getWsdlLocation(), A4FDISCRETASSERVICE_QNAME, features);
    }

    public A4FDiscretasService(URL wsdlLocation) {
        super(wsdlLocation, A4FDISCRETASSERVICE_QNAME);
    }

    public A4FDiscretasService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, A4FDISCRETASSERVICE_QNAME, features);
    }

    public A4FDiscretasService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public A4FDiscretasService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns A4FDiscretas
     */
    @WebEndpoint(name = "A4_FDiscretasPort")
    public A4FDiscretas getA4FDiscretasPort() {
        return super.getPort(new QName("http://Discretas_FA4/", "A4_FDiscretasPort"), A4FDiscretas.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns A4FDiscretas
     */
    @WebEndpoint(name = "A4_FDiscretasPort")
    public A4FDiscretas getA4FDiscretasPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Discretas_FA4/", "A4_FDiscretasPort"), A4FDiscretas.class, features);
    }

    private static URL __getWsdlLocation() {
        if (A4FDISCRETASSERVICE_EXCEPTION!= null) {
            throw A4FDISCRETASSERVICE_EXCEPTION;
        }
        return A4FDISCRETASSERVICE_WSDL_LOCATION;
    }

}
