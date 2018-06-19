
package continuas_da2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the continuas_da2 package. 
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

    private final static QName _PeticionContinuasDA2Response_QNAME = new QName("http://Continuas_DA2/", "peticionContinuasDA2Response");
    private final static QName _PeticionContinuasDA2_QNAME = new QName("http://Continuas_DA2/", "peticionContinuasDA2");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: continuas_da2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PeticionContinuasDA2Response }
     * 
     */
    public PeticionContinuasDA2Response createPeticionContinuasDA2Response() {
        return new PeticionContinuasDA2Response();
    }

    /**
     * Create an instance of {@link PeticionContinuasDA2 }
     * 
     */
    public PeticionContinuasDA2 createPeticionContinuasDA2() {
        return new PeticionContinuasDA2();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionContinuasDA2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Continuas_DA2/", name = "peticionContinuasDA2Response")
    public JAXBElement<PeticionContinuasDA2Response> createPeticionContinuasDA2Response(PeticionContinuasDA2Response value) {
        return new JAXBElement<PeticionContinuasDA2Response>(_PeticionContinuasDA2Response_QNAME, PeticionContinuasDA2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionContinuasDA2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Continuas_DA2/", name = "peticionContinuasDA2")
    public JAXBElement<PeticionContinuasDA2> createPeticionContinuasDA2(PeticionContinuasDA2 value) {
        return new JAXBElement<PeticionContinuasDA2>(_PeticionContinuasDA2_QNAME, PeticionContinuasDA2 .class, null, value);
    }

}
