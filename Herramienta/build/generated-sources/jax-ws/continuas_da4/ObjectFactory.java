
package continuas_da4;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the continuas_da4 package. 
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

    private final static QName _PeticionContinuasDA4_QNAME = new QName("http://Continuas_DA4/", "peticionContinuasDA4");
    private final static QName _PeticionContinuasDA4Response_QNAME = new QName("http://Continuas_DA4/", "peticionContinuasDA4Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: continuas_da4
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PeticionContinuasDA4Response }
     * 
     */
    public PeticionContinuasDA4Response createPeticionContinuasDA4Response() {
        return new PeticionContinuasDA4Response();
    }

    /**
     * Create an instance of {@link PeticionContinuasDA4 }
     * 
     */
    public PeticionContinuasDA4 createPeticionContinuasDA4() {
        return new PeticionContinuasDA4();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionContinuasDA4 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Continuas_DA4/", name = "peticionContinuasDA4")
    public JAXBElement<PeticionContinuasDA4> createPeticionContinuasDA4(PeticionContinuasDA4 value) {
        return new JAXBElement<PeticionContinuasDA4>(_PeticionContinuasDA4_QNAME, PeticionContinuasDA4 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionContinuasDA4Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Continuas_DA4/", name = "peticionContinuasDA4Response")
    public JAXBElement<PeticionContinuasDA4Response> createPeticionContinuasDA4Response(PeticionContinuasDA4Response value) {
        return new JAXBElement<PeticionContinuasDA4Response>(_PeticionContinuasDA4Response_QNAME, PeticionContinuasDA4Response.class, null, value);
    }

}
