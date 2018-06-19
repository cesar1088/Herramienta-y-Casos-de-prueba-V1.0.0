
package continuas_da3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the continuas_da3 package. 
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

    private final static QName _PeticionContinuasDA3Response_QNAME = new QName("http://Continuas_DA3/", "peticionContinuasDA3Response");
    private final static QName _PeticionContinuasDA3_QNAME = new QName("http://Continuas_DA3/", "peticionContinuasDA3");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: continuas_da3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PeticionContinuasDA3Response }
     * 
     */
    public PeticionContinuasDA3Response createPeticionContinuasDA3Response() {
        return new PeticionContinuasDA3Response();
    }

    /**
     * Create an instance of {@link PeticionContinuasDA3 }
     * 
     */
    public PeticionContinuasDA3 createPeticionContinuasDA3() {
        return new PeticionContinuasDA3();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionContinuasDA3Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Continuas_DA3/", name = "peticionContinuasDA3Response")
    public JAXBElement<PeticionContinuasDA3Response> createPeticionContinuasDA3Response(PeticionContinuasDA3Response value) {
        return new JAXBElement<PeticionContinuasDA3Response>(_PeticionContinuasDA3Response_QNAME, PeticionContinuasDA3Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionContinuasDA3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Continuas_DA3/", name = "peticionContinuasDA3")
    public JAXBElement<PeticionContinuasDA3> createPeticionContinuasDA3(PeticionContinuasDA3 value) {
        return new JAXBElement<PeticionContinuasDA3>(_PeticionContinuasDA3_QNAME, PeticionContinuasDA3 .class, null, value);
    }

}
