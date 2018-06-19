
package taylorbucket_a4;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the taylorbucket_a4 package. 
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

    private final static QName _PeticionTaylorBucketA4_QNAME = new QName("http://TaylorBucket_A4/", "peticionTaylorBucketA4");
    private final static QName _PeticionTaylorBucketA4Response_QNAME = new QName("http://TaylorBucket_A4/", "peticionTaylorBucketA4Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: taylorbucket_a4
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PeticionTaylorBucketA4 }
     * 
     */
    public PeticionTaylorBucketA4 createPeticionTaylorBucketA4() {
        return new PeticionTaylorBucketA4();
    }

    /**
     * Create an instance of {@link PeticionTaylorBucketA4Response }
     * 
     */
    public PeticionTaylorBucketA4Response createPeticionTaylorBucketA4Response() {
        return new PeticionTaylorBucketA4Response();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionTaylorBucketA4 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://TaylorBucket_A4/", name = "peticionTaylorBucketA4")
    public JAXBElement<PeticionTaylorBucketA4> createPeticionTaylorBucketA4(PeticionTaylorBucketA4 value) {
        return new JAXBElement<PeticionTaylorBucketA4>(_PeticionTaylorBucketA4_QNAME, PeticionTaylorBucketA4 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionTaylorBucketA4Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://TaylorBucket_A4/", name = "peticionTaylorBucketA4Response")
    public JAXBElement<PeticionTaylorBucketA4Response> createPeticionTaylorBucketA4Response(PeticionTaylorBucketA4Response value) {
        return new JAXBElement<PeticionTaylorBucketA4Response>(_PeticionTaylorBucketA4Response_QNAME, PeticionTaylorBucketA4Response.class, null, value);
    }

}
