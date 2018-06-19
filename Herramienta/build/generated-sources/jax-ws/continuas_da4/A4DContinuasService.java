
package continuas_da4;

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
@WebServiceClient(name = "A4_DContinuasService", targetNamespace = "http://Continuas_DA4/", wsdlLocation = "http://192.168.0.107:8080/Servicios_Web/A4_DContinuas?wsdl")
public class A4DContinuasService
    extends Service
{

    private final static URL A4DCONTINUASSERVICE_WSDL_LOCATION;
    private final static WebServiceException A4DCONTINUASSERVICE_EXCEPTION;
    private final static QName A4DCONTINUASSERVICE_QNAME = new QName("http://Continuas_DA4/", "A4_DContinuasService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.0.107:8080/Servicios_Web/A4_DContinuas?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        A4DCONTINUASSERVICE_WSDL_LOCATION = url;
        A4DCONTINUASSERVICE_EXCEPTION = e;
    }

    public A4DContinuasService() {
        super(__getWsdlLocation(), A4DCONTINUASSERVICE_QNAME);
    }

    public A4DContinuasService(WebServiceFeature... features) {
        super(__getWsdlLocation(), A4DCONTINUASSERVICE_QNAME, features);
    }

    public A4DContinuasService(URL wsdlLocation) {
        super(wsdlLocation, A4DCONTINUASSERVICE_QNAME);
    }

    public A4DContinuasService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, A4DCONTINUASSERVICE_QNAME, features);
    }

    public A4DContinuasService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public A4DContinuasService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns A4DContinuas
     */
    @WebEndpoint(name = "A4_DContinuasPort")
    public A4DContinuas getA4DContinuasPort() {
        return super.getPort(new QName("http://Continuas_DA4/", "A4_DContinuasPort"), A4DContinuas.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns A4DContinuas
     */
    @WebEndpoint(name = "A4_DContinuasPort")
    public A4DContinuas getA4DContinuasPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Continuas_DA4/", "A4_DContinuasPort"), A4DContinuas.class, features);
    }

    private static URL __getWsdlLocation() {
        if (A4DCONTINUASSERVICE_EXCEPTION!= null) {
            throw A4DCONTINUASSERVICE_EXCEPTION;
        }
        return A4DCONTINUASSERVICE_WSDL_LOCATION;
    }

}