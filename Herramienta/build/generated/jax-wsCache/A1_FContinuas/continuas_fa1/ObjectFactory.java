
package continuas_fa1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the continuas_fa1 package. 
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

    private final static QName _PeticionContinuasFA1Response_QNAME = new QName("http://Continuas_FA1/", "peticionContinuasFA1Response");
    private final static QName _PeticionContinuasFA1_QNAME = new QName("http://Continuas_FA1/", "peticionContinuasFA1");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: continuas_fa1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PeticionContinuasFA1Response }
     * 
     */
    public PeticionContinuasFA1Response createPeticionContinuasFA1Response() {
        return new PeticionContinuasFA1Response();
    }

    /**
     * Create an instance of {@link PeticionContinuasFA1 }
     * 
     */
    public PeticionContinuasFA1 createPeticionContinuasFA1() {
        return new PeticionContinuasFA1();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionContinuasFA1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Continuas_FA1/", name = "peticionContinuasFA1Response")
    public JAXBElement<PeticionContinuasFA1Response> createPeticionContinuasFA1Response(PeticionContinuasFA1Response value) {
        return new JAXBElement<PeticionContinuasFA1Response>(_PeticionContinuasFA1Response_QNAME, PeticionContinuasFA1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionContinuasFA1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Continuas_FA1/", name = "peticionContinuasFA1")
    public JAXBElement<PeticionContinuasFA1> createPeticionContinuasFA1(PeticionContinuasFA1 value) {
        return new JAXBElement<PeticionContinuasFA1>(_PeticionContinuasFA1_QNAME, PeticionContinuasFA1 .class, null, value);
    }

}
