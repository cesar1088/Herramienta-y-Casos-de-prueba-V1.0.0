
package discretas_da1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the discretas_da1 package. 
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

    private final static QName _PeticionDiscretasDA1Response_QNAME = new QName("http://Discretas_DA1/", "peticionDiscretasDA1Response");
    private final static QName _PeticionDiscretasDA1_QNAME = new QName("http://Discretas_DA1/", "peticionDiscretasDA1");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: discretas_da1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PeticionDiscretasDA1Response }
     * 
     */
    public PeticionDiscretasDA1Response createPeticionDiscretasDA1Response() {
        return new PeticionDiscretasDA1Response();
    }

    /**
     * Create an instance of {@link PeticionDiscretasDA1 }
     * 
     */
    public PeticionDiscretasDA1 createPeticionDiscretasDA1() {
        return new PeticionDiscretasDA1();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionDiscretasDA1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Discretas_DA1/", name = "peticionDiscretasDA1Response")
    public JAXBElement<PeticionDiscretasDA1Response> createPeticionDiscretasDA1Response(PeticionDiscretasDA1Response value) {
        return new JAXBElement<PeticionDiscretasDA1Response>(_PeticionDiscretasDA1Response_QNAME, PeticionDiscretasDA1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionDiscretasDA1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Discretas_DA1/", name = "peticionDiscretasDA1")
    public JAXBElement<PeticionDiscretasDA1> createPeticionDiscretasDA1(PeticionDiscretasDA1 value) {
        return new JAXBElement<PeticionDiscretasDA1>(_PeticionDiscretasDA1_QNAME, PeticionDiscretasDA1 .class, null, value);
    }

}
