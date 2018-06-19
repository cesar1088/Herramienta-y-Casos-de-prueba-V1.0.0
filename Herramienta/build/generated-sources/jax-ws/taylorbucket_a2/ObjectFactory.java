
package taylorbucket_a2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the taylorbucket_a2 package. 
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

    private final static QName _PeticionTaylorBucketA2_QNAME = new QName("http://TaylorBucket_A2/", "peticionTaylorBucketA2");
    private final static QName _PeticionTaylorBucketA2Response_QNAME = new QName("http://TaylorBucket_A2/", "peticionTaylorBucketA2Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: taylorbucket_a2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PeticionTaylorBucketA2Response }
     * 
     */
    public PeticionTaylorBucketA2Response createPeticionTaylorBucketA2Response() {
        return new PeticionTaylorBucketA2Response();
    }

    /**
     * Create an instance of {@link PeticionTaylorBucketA2 }
     * 
     */
    public PeticionTaylorBucketA2 createPeticionTaylorBucketA2() {
        return new PeticionTaylorBucketA2();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionTaylorBucketA2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://TaylorBucket_A2/", name = "peticionTaylorBucketA2")
    public JAXBElement<PeticionTaylorBucketA2> createPeticionTaylorBucketA2(PeticionTaylorBucketA2 value) {
        return new JAXBElement<PeticionTaylorBucketA2>(_PeticionTaylorBucketA2_QNAME, PeticionTaylorBucketA2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionTaylorBucketA2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://TaylorBucket_A2/", name = "peticionTaylorBucketA2Response")
    public JAXBElement<PeticionTaylorBucketA2Response> createPeticionTaylorBucketA2Response(PeticionTaylorBucketA2Response value) {
        return new JAXBElement<PeticionTaylorBucketA2Response>(_PeticionTaylorBucketA2Response_QNAME, PeticionTaylorBucketA2Response.class, null, value);
    }

}
