
package continuas_da1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the continuas_da1 package. 
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

    private final static QName _PeticionContinuasDA1Response_QNAME = new QName("http://Continuas_DA1/", "peticionContinuasDA1Response");
    private final static QName _PeticionContinuasDA1_QNAME = new QName("http://Continuas_DA1/", "peticionContinuasDA1");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: continuas_da1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PeticionContinuasDA1Response }
     * 
     */
    public PeticionContinuasDA1Response createPeticionContinuasDA1Response() {
        return new PeticionContinuasDA1Response();
    }

    /**
     * Create an instance of {@link PeticionContinuasDA1 }
     * 
     */
    public PeticionContinuasDA1 createPeticionContinuasDA1() {
        return new PeticionContinuasDA1();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionContinuasDA1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Continuas_DA1/", name = "peticionContinuasDA1Response")
    public JAXBElement<PeticionContinuasDA1Response> createPeticionContinuasDA1Response(PeticionContinuasDA1Response value) {
        return new JAXBElement<PeticionContinuasDA1Response>(_PeticionContinuasDA1Response_QNAME, PeticionContinuasDA1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionContinuasDA1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Continuas_DA1/", name = "peticionContinuasDA1")
    public JAXBElement<PeticionContinuasDA1> createPeticionContinuasDA1(PeticionContinuasDA1 value) {
        return new JAXBElement<PeticionContinuasDA1>(_PeticionContinuasDA1_QNAME, PeticionContinuasDA1 .class, null, value);
    }

}
