
package taylorbucket_a1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the taylorbucket_a1 package. 
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

    private final static QName _PeticionTaylorBucketA1_QNAME = new QName("http://TaylorBucket_A1/", "peticionTaylorBucketA1");
    private final static QName _PeticionTaylorBucketA1Response_QNAME = new QName("http://TaylorBucket_A1/", "peticionTaylorBucketA1Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: taylorbucket_a1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PeticionTaylorBucketA1 }
     * 
     */
    public PeticionTaylorBucketA1 createPeticionTaylorBucketA1() {
        return new PeticionTaylorBucketA1();
    }

    /**
     * Create an instance of {@link PeticionTaylorBucketA1Response }
     * 
     */
    public PeticionTaylorBucketA1Response createPeticionTaylorBucketA1Response() {
        return new PeticionTaylorBucketA1Response();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionTaylorBucketA1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://TaylorBucket_A1/", name = "peticionTaylorBucketA1")
    public JAXBElement<PeticionTaylorBucketA1> createPeticionTaylorBucketA1(PeticionTaylorBucketA1 value) {
        return new JAXBElement<PeticionTaylorBucketA1>(_PeticionTaylorBucketA1_QNAME, PeticionTaylorBucketA1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionTaylorBucketA1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://TaylorBucket_A1/", name = "peticionTaylorBucketA1Response")
    public JAXBElement<PeticionTaylorBucketA1Response> createPeticionTaylorBucketA1Response(PeticionTaylorBucketA1Response value) {
        return new JAXBElement<PeticionTaylorBucketA1Response>(_PeticionTaylorBucketA1Response_QNAME, PeticionTaylorBucketA1Response.class, null, value);
    }

}
