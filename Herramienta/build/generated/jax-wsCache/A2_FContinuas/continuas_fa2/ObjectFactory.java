
package continuas_fa2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the continuas_fa2 package. 
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

    private final static QName _PeticionContinuasFA2_QNAME = new QName("http://Continuas_FA2/", "peticionContinuasFA2");
    private final static QName _PeticionContinuasFA2Response_QNAME = new QName("http://Continuas_FA2/", "peticionContinuasFA2Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: continuas_fa2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PeticionContinuasFA2 }
     * 
     */
    public PeticionContinuasFA2 createPeticionContinuasFA2() {
        return new PeticionContinuasFA2();
    }

    /**
     * Create an instance of {@link PeticionContinuasFA2Response }
     * 
     */
    public PeticionContinuasFA2Response createPeticionContinuasFA2Response() {
        return new PeticionContinuasFA2Response();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionContinuasFA2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Continuas_FA2/", name = "peticionContinuasFA2")
    public JAXBElement<PeticionContinuasFA2> createPeticionContinuasFA2(PeticionContinuasFA2 value) {
        return new JAXBElement<PeticionContinuasFA2>(_PeticionContinuasFA2_QNAME, PeticionContinuasFA2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionContinuasFA2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Continuas_FA2/", name = "peticionContinuasFA2Response")
    public JAXBElement<PeticionContinuasFA2Response> createPeticionContinuasFA2Response(PeticionContinuasFA2Response value) {
        return new JAXBElement<PeticionContinuasFA2Response>(_PeticionContinuasFA2Response_QNAME, PeticionContinuasFA2Response.class, null, value);
    }

}
