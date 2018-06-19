
package discretas_fa1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the discretas_fa1 package. 
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

    private final static QName _PeticionDiscretasFA1Response_QNAME = new QName("http://Discretas_FA1/", "peticionDiscretasFA1Response");
    private final static QName _PeticionDiscretasFA1_QNAME = new QName("http://Discretas_FA1/", "peticionDiscretasFA1");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: discretas_fa1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PeticionDiscretasFA1 }
     * 
     */
    public PeticionDiscretasFA1 createPeticionDiscretasFA1() {
        return new PeticionDiscretasFA1();
    }

    /**
     * Create an instance of {@link PeticionDiscretasFA1Response }
     * 
     */
    public PeticionDiscretasFA1Response createPeticionDiscretasFA1Response() {
        return new PeticionDiscretasFA1Response();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionDiscretasFA1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Discretas_FA1/", name = "peticionDiscretasFA1Response")
    public JAXBElement<PeticionDiscretasFA1Response> createPeticionDiscretasFA1Response(PeticionDiscretasFA1Response value) {
        return new JAXBElement<PeticionDiscretasFA1Response>(_PeticionDiscretasFA1Response_QNAME, PeticionDiscretasFA1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionDiscretasFA1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Discretas_FA1/", name = "peticionDiscretasFA1")
    public JAXBElement<PeticionDiscretasFA1> createPeticionDiscretasFA1(PeticionDiscretasFA1 value) {
        return new JAXBElement<PeticionDiscretasFA1>(_PeticionDiscretasFA1_QNAME, PeticionDiscretasFA1 .class, null, value);
    }

}
