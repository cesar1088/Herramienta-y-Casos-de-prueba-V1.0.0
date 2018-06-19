
package taylorbucket_a3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the taylorbucket_a3 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PeticionTaylorBucketA3_QNAME = new QName("http://TaylorBucket_A3/", "peticionTaylorBucketA3");
    private final static QName _PeticionTaylorBucketA3Response_QNAME = new QName("http://TaylorBucket_A3/", "peticionTaylorBucketA3Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: taylorbucket_a3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PeticionTaylorBucketA3Response }
     * 
     */
    public PeticionTaylorBucketA3Response createPeticionTaylorBucketA3Response() {
        return new PeticionTaylorBucketA3Response();
    }

    /**
     * Create an instance of {@link PeticionTaylorBucketA3 }
     * 
     */
    public PeticionTaylorBucketA3 createPeticionTaylorBucketA3() {
        return new PeticionTaylorBucketA3();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionTaylorBucketA3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://TaylorBucket_A3/", name = "peticionTaylorBucketA3")
    public JAXBElement<PeticionTaylorBucketA3> createPeticionTaylorBucketA3(PeticionTaylorBucketA3 value) {
        return new JAXBElement<PeticionTaylorBucketA3>(_PeticionTaylorBucketA3_QNAME, PeticionTaylorBucketA3 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionTaylorBucketA3Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://TaylorBucket_A3/", name = "peticionTaylorBucketA3Response")
    public JAXBElement<PeticionTaylorBucketA3Response> createPeticionTaylorBucketA3Response(PeticionTaylorBucketA3Response value) {
        return new JAXBElement<PeticionTaylorBucketA3Response>(_PeticionTaylorBucketA3Response_QNAME, PeticionTaylorBucketA3Response.class, null, value);
    }

}
