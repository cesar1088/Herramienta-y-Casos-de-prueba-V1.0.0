
package bernoulli_a1;

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
@WebServiceClient(name = "A1_BernoulliService", targetNamespace = "http://Bernoulli_A1/", wsdlLocation = "http://192.168.0.107:8080/Servicios_Web/A1_Bernoulli?wsdl")
public class A1BernoulliService
    extends Service
{

    private final static URL A1BERNOULLISERVICE_WSDL_LOCATION;
    private final static WebServiceException A1BERNOULLISERVICE_EXCEPTION;
    private final static QName A1BERNOULLISERVICE_QNAME = new QName("http://Bernoulli_A1/", "A1_BernoulliService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.0.107:8080/Servicios_Web/A1_Bernoulli?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        A1BERNOULLISERVICE_WSDL_LOCATION = url;
        A1BERNOULLISERVICE_EXCEPTION = e;
    }

    public A1BernoulliService() {
        super(__getWsdlLocation(), A1BERNOULLISERVICE_QNAME);
    }

    public A1BernoulliService(WebServiceFeature... features) {
        super(__getWsdlLocation(), A1BERNOULLISERVICE_QNAME, features);
    }

    public A1BernoulliService(URL wsdlLocation) {
        super(wsdlLocation, A1BERNOULLISERVICE_QNAME);
    }

    public A1BernoulliService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, A1BERNOULLISERVICE_QNAME, features);
    }

    public A1BernoulliService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public A1BernoulliService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns A1Bernoulli
     */
    @WebEndpoint(name = "A1_BernoulliPort")
    public A1Bernoulli getA1BernoulliPort() {
        return super.getPort(new QName("http://Bernoulli_A1/", "A1_BernoulliPort"), A1Bernoulli.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns A1Bernoulli
     */
    @WebEndpoint(name = "A1_BernoulliPort")
    public A1Bernoulli getA1BernoulliPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Bernoulli_A1/", "A1_BernoulliPort"), A1Bernoulli.class, features);
    }

    private static URL __getWsdlLocation() {
        if (A1BERNOULLISERVICE_EXCEPTION!= null) {
            throw A1BERNOULLISERVICE_EXCEPTION;
        }
        return A1BERNOULLISERVICE_WSDL_LOCATION;
    }

}