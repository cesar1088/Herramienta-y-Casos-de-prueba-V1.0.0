
package discretas_fa2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the discretas_fa2 package. 
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

    private final static QName _PeticionDiscretasFA2_QNAME = new QName("http://Discretas_FA2/", "peticionDiscretasFA2");
    private final static QName _PeticionDiscretasFA2Response_QNAME = new QName("http://Discretas_FA2/", "peticionDiscretasFA2Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: discretas_fa2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PeticionDiscretasFA2Response }
     * 
     */
    public PeticionDiscretasFA2Response createPeticionDiscretasFA2Response() {
        return new PeticionDiscretasFA2Response();
    }

    /**
     * Create an instance of {@link PeticionDiscretasFA2 }
     * 
     */
    public PeticionDiscretasFA2 createPeticionDiscretasFA2() {
        return new PeticionDiscretasFA2();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionDiscretasFA2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Discretas_FA2/", name = "peticionDiscretasFA2")
    public JAXBElement<PeticionDiscretasFA2> createPeticionDiscretasFA2(PeticionDiscretasFA2 value) {
        return new JAXBElement<PeticionDiscretasFA2>(_PeticionDiscretasFA2_QNAME, PeticionDiscretasFA2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionDiscretasFA2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Discretas_FA2/", name = "peticionDiscretasFA2Response")
    public JAXBElement<PeticionDiscretasFA2Response> createPeticionDiscretasFA2Response(PeticionDiscretasFA2Response value) {
        return new JAXBElement<PeticionDiscretasFA2Response>(_PeticionDiscretasFA2Response_QNAME, PeticionDiscretasFA2Response.class, null, value);
    }

}
