
package hipercubo_a4;

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
@WebServiceClient(name = "A4_HipercuboService", targetNamespace = "http://Hipercubo_A4/", wsdlLocation = "http://192.168.0.107:8080/Servicios_Web/A4_Hipercubo?wsdl")
public class A4HipercuboService
    extends Service
{

    private final static URL A4HIPERCUBOSERVICE_WSDL_LOCATION;
    private final static WebServiceException A4HIPERCUBOSERVICE_EXCEPTION;
    private final static QName A4HIPERCUBOSERVICE_QNAME = new QName("http://Hipercubo_A4/", "A4_HipercuboService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.0.107:8080/Servicios_Web/A4_Hipercubo?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        A4HIPERCUBOSERVICE_WSDL_LOCATION = url;
        A4HIPERCUBOSERVICE_EXCEPTION = e;
    }

    public A4HipercuboService() {
        super(__getWsdlLocation(), A4HIPERCUBOSERVICE_QNAME);
    }

    public A4HipercuboService(WebServiceFeature... features) {
        super(__getWsdlLocation(), A4HIPERCUBOSERVICE_QNAME, features);
    }

    public A4HipercuboService(URL wsdlLocation) {
        super(wsdlLocation, A4HIPERCUBOSERVICE_QNAME);
    }

    public A4HipercuboService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, A4HIPERCUBOSERVICE_QNAME, features);
    }

    public A4HipercuboService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public A4HipercuboService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns A4Hipercubo
     */
    @WebEndpoint(name = "A4_HipercuboPort")
    public A4Hipercubo getA4HipercuboPort() {
        return super.getPort(new QName("http://Hipercubo_A4/", "A4_HipercuboPort"), A4Hipercubo.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns A4Hipercubo
     */
    @WebEndpoint(name = "A4_HipercuboPort")
    public A4Hipercubo getA4HipercuboPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Hipercubo_A4/", "A4_HipercuboPort"), A4Hipercubo.class, features);
    }

    private static URL __getWsdlLocation() {
        if (A4HIPERCUBOSERVICE_EXCEPTION!= null) {
            throw A4HIPERCUBOSERVICE_EXCEPTION;
        }
        return A4HIPERCUBOSERVICE_WSDL_LOCATION;
    }

}
