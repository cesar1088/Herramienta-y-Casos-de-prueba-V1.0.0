
package discretas_da3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the discretas_da3 package. 
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

    private final static QName _PeticionDiscretasDA3Response_QNAME = new QName("http://Discretas_DA3/", "peticionDiscretasDA3Response");
    private final static QName _PeticionDiscretasDA3_QNAME = new QName("http://Discretas_DA3/", "peticionDiscretasDA3");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: discretas_da3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PeticionDiscretasDA3 }
     * 
     */
    public PeticionDiscretasDA3 createPeticionDiscretasDA3() {
        return new PeticionDiscretasDA3();
    }

    /**
     * Create an instance of {@link PeticionDiscretasDA3Response }
     * 
     */
    public PeticionDiscretasDA3Response createPeticionDiscretasDA3Response() {
        return new PeticionDiscretasDA3Response();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionDiscretasDA3Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Discretas_DA3/", name = "peticionDiscretasDA3Response")
    public JAXBElement<PeticionDiscretasDA3Response> createPeticionDiscretasDA3Response(PeticionDiscretasDA3Response value) {
        return new JAXBElement<PeticionDiscretasDA3Response>(_PeticionDiscretasDA3Response_QNAME, PeticionDiscretasDA3Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionDiscretasDA3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Discretas_DA3/", name = "peticionDiscretasDA3")
    public JAXBElement<PeticionDiscretasDA3> createPeticionDiscretasDA3(PeticionDiscretasDA3 value) {
        return new JAXBElement<PeticionDiscretasDA3>(_PeticionDiscretasDA3_QNAME, PeticionDiscretasDA3 .class, null, value);
    }

}
