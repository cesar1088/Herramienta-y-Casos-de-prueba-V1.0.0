
package discretas_da2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the discretas_da2 package. 
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

    private final static QName _PeticionDiscretasDA2_QNAME = new QName("http://Discretas_DA2/", "peticionDiscretasDA2");
    private final static QName _PeticionDiscretasDA2Response_QNAME = new QName("http://Discretas_DA2/", "peticionDiscretasDA2Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: discretas_da2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PeticionDiscretasDA2Response }
     * 
     */
    public PeticionDiscretasDA2Response createPeticionDiscretasDA2Response() {
        return new PeticionDiscretasDA2Response();
    }

    /**
     * Create an instance of {@link PeticionDiscretasDA2 }
     * 
     */
    public PeticionDiscretasDA2 createPeticionDiscretasDA2() {
        return new PeticionDiscretasDA2();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionDiscretasDA2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Discretas_DA2/", name = "peticionDiscretasDA2")
    public JAXBElement<PeticionDiscretasDA2> createPeticionDiscretasDA2(PeticionDiscretasDA2 value) {
        return new JAXBElement<PeticionDiscretasDA2>(_PeticionDiscretasDA2_QNAME, PeticionDiscretasDA2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionDiscretasDA2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Discretas_DA2/", name = "peticionDiscretasDA2Response")
    public JAXBElement<PeticionDiscretasDA2Response> createPeticionDiscretasDA2Response(PeticionDiscretasDA2Response value) {
        return new JAXBElement<PeticionDiscretasDA2Response>(_PeticionDiscretasDA2Response_QNAME, PeticionDiscretasDA2Response.class, null, value);
    }

}
