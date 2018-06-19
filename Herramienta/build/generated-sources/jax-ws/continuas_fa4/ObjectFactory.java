
package continuas_fa4;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the continuas_fa4 package. 
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

    private final static QName _PeticionContinuasFA4_QNAME = new QName("http://Continuas_FA4/", "peticionContinuasFA4");
    private final static QName _PeticionContinuasFA4Response_QNAME = new QName("http://Continuas_FA4/", "peticionContinuasFA4Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: continuas_fa4
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PeticionContinuasFA4Response }
     * 
     */
    public PeticionContinuasFA4Response createPeticionContinuasFA4Response() {
        return new PeticionContinuasFA4Response();
    }

    /**
     * Create an instance of {@link PeticionContinuasFA4 }
     * 
     */
    public PeticionContinuasFA4 createPeticionContinuasFA4() {
        return new PeticionContinuasFA4();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionContinuasFA4 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Continuas_FA4/", name = "peticionContinuasFA4")
    public JAXBElement<PeticionContinuasFA4> createPeticionContinuasFA4(PeticionContinuasFA4 value) {
        return new JAXBElement<PeticionContinuasFA4>(_PeticionContinuasFA4_QNAME, PeticionContinuasFA4 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionContinuasFA4Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Continuas_FA4/", name = "peticionContinuasFA4Response")
    public JAXBElement<PeticionContinuasFA4Response> createPeticionContinuasFA4Response(PeticionContinuasFA4Response value) {
        return new JAXBElement<PeticionContinuasFA4Response>(_PeticionContinuasFA4Response_QNAME, PeticionContinuasFA4Response.class, null, value);
    }

}
