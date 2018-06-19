
package continuas_fa3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the continuas_fa3 package. 
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

    private final static QName _PeticionContinuasFA3_QNAME = new QName("http://Continuas_FA3/", "peticionContinuasFA3");
    private final static QName _PeticionContinuasFA3Response_QNAME = new QName("http://Continuas_FA3/", "peticionContinuasFA3Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: continuas_fa3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PeticionContinuasFA3 }
     * 
     */
    public PeticionContinuasFA3 createPeticionContinuasFA3() {
        return new PeticionContinuasFA3();
    }

    /**
     * Create an instance of {@link PeticionContinuasFA3Response }
     * 
     */
    public PeticionContinuasFA3Response createPeticionContinuasFA3Response() {
        return new PeticionContinuasFA3Response();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionContinuasFA3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Continuas_FA3/", name = "peticionContinuasFA3")
    public JAXBElement<PeticionContinuasFA3> createPeticionContinuasFA3(PeticionContinuasFA3 value) {
        return new JAXBElement<PeticionContinuasFA3>(_PeticionContinuasFA3_QNAME, PeticionContinuasFA3 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionContinuasFA3Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Continuas_FA3/", name = "peticionContinuasFA3Response")
    public JAXBElement<PeticionContinuasFA3Response> createPeticionContinuasFA3Response(PeticionContinuasFA3Response value) {
        return new JAXBElement<PeticionContinuasFA3Response>(_PeticionContinuasFA3Response_QNAME, PeticionContinuasFA3Response.class, null, value);
    }

}
