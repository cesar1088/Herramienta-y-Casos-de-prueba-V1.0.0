
package taylorbucket_a2;

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
@WebServiceClient(name = "A2_TaylorBucketService", targetNamespace = "http://TaylorBucket_A2/", wsdlLocation = "http://192.168.0.107:8080/Servicios_Web/A2_TaylorBucket?wsdl")
public class A2TaylorBucketService
    extends Service
{

    private final static URL A2TAYLORBUCKETSERVICE_WSDL_LOCATION;
    private final static WebServiceException A2TAYLORBUCKETSERVICE_EXCEPTION;
    private final static QName A2TAYLORBUCKETSERVICE_QNAME = new QName("http://TaylorBucket_A2/", "A2_TaylorBucketService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.0.107:8080/Servicios_Web/A2_TaylorBucket?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        A2TAYLORBUCKETSERVICE_WSDL_LOCATION = url;
        A2TAYLORBUCKETSERVICE_EXCEPTION = e;
    }

    public A2TaylorBucketService() {
        super(__getWsdlLocation(), A2TAYLORBUCKETSERVICE_QNAME);
    }

    public A2TaylorBucketService(WebServiceFeature... features) {
        super(__getWsdlLocation(), A2TAYLORBUCKETSERVICE_QNAME, features);
    }

    public A2TaylorBucketService(URL wsdlLocation) {
        super(wsdlLocation, A2TAYLORBUCKETSERVICE_QNAME);
    }

    public A2TaylorBucketService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, A2TAYLORBUCKETSERVICE_QNAME, features);
    }

    public A2TaylorBucketService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public A2TaylorBucketService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns A2TaylorBucket
     */
    @WebEndpoint(name = "A2_TaylorBucketPort")
    public A2TaylorBucket getA2TaylorBucketPort() {
        return super.getPort(new QName("http://TaylorBucket_A2/", "A2_TaylorBucketPort"), A2TaylorBucket.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns A2TaylorBucket
     */
    @WebEndpoint(name = "A2_TaylorBucketPort")
    public A2TaylorBucket getA2TaylorBucketPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://TaylorBucket_A2/", "A2_TaylorBucketPort"), A2TaylorBucket.class, features);
    }

    private static URL __getWsdlLocation() {
        if (A2TAYLORBUCKETSERVICE_EXCEPTION!= null) {
            throw A2TAYLORBUCKETSERVICE_EXCEPTION;
        }
        return A2TAYLORBUCKETSERVICE_WSDL_LOCATION;
    }

}
