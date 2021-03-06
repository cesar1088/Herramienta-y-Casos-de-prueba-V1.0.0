
package continuas_da1;

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
@WebServiceClient(name = "A1_DContinuasService", targetNamespace = "http://Continuas_DA1/", wsdlLocation = "http://192.168.0.107:8080/Servicios_Web/A1_DContinuas?wsdl")
public class A1DContinuasService
    extends Service
{

    private final static URL A1DCONTINUASSERVICE_WSDL_LOCATION;
    private final static WebServiceException A1DCONTINUASSERVICE_EXCEPTION;
    private final static QName A1DCONTINUASSERVICE_QNAME = new QName("http://Continuas_DA1/", "A1_DContinuasService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.0.107:8080/Servicios_Web/A1_DContinuas?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        A1DCONTINUASSERVICE_WSDL_LOCATION = url;
        A1DCONTINUASSERVICE_EXCEPTION = e;
    }

    public A1DContinuasService() {
        super(__getWsdlLocation(), A1DCONTINUASSERVICE_QNAME);
    }

    public A1DContinuasService(WebServiceFeature... features) {
        super(__getWsdlLocation(), A1DCONTINUASSERVICE_QNAME, features);
    }

    public A1DContinuasService(URL wsdlLocation) {
        super(wsdlLocation, A1DCONTINUASSERVICE_QNAME);
    }

    public A1DContinuasService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, A1DCONTINUASSERVICE_QNAME, features);
    }

    public A1DContinuasService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public A1DContinuasService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns A1DContinuas
     */
    @WebEndpoint(name = "A1_DContinuasPort")
    public A1DContinuas getA1DContinuasPort() {
        return super.getPort(new QName("http://Continuas_DA1/", "A1_DContinuasPort"), A1DContinuas.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns A1DContinuas
     */
    @WebEndpoint(name = "A1_DContinuasPort")
    public A1DContinuas getA1DContinuasPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Continuas_DA1/", "A1_DContinuasPort"), A1DContinuas.class, features);
    }

    private static URL __getWsdlLocation() {
        if (A1DCONTINUASSERVICE_EXCEPTION!= null) {
            throw A1DCONTINUASSERVICE_EXCEPTION;
        }
        return A1DCONTINUASSERVICE_WSDL_LOCATION;
    }

}
