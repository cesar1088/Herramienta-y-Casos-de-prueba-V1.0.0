
package discretas_da4;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the discretas_da4 package. 
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

    private final static QName _PeticionDiscretasDA4_QNAME = new QName("http://Discretas_DA4/", "peticionDiscretasDA4");
    private final static QName _PeticionDiscretasDA4Response_QNAME = new QName("http://Discretas_DA4/", "peticionDiscretasDA4Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: discretas_da4
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PeticionDiscretasDA4Response }
     * 
     */
    public PeticionDiscretasDA4Response createPeticionDiscretasDA4Response() {
        return new PeticionDiscretasDA4Response();
    }

    /**
     * Create an instance of {@link PeticionDiscretasDA4 }
     * 
     */
    public PeticionDiscretasDA4 createPeticionDiscretasDA4() {
        return new PeticionDiscretasDA4();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionDiscretasDA4 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Discretas_DA4/", name = "peticionDiscretasDA4")
    public JAXBElement<PeticionDiscretasDA4> createPeticionDiscretasDA4(PeticionDiscretasDA4 value) {
        return new JAXBElement<PeticionDiscretasDA4>(_PeticionDiscretasDA4_QNAME, PeticionDiscretasDA4 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionDiscretasDA4Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Discretas_DA4/", name = "peticionDiscretasDA4Response")
    public JAXBElement<PeticionDiscretasDA4Response> createPeticionDiscretasDA4Response(PeticionDiscretasDA4Response value) {
        return new JAXBElement<PeticionDiscretasDA4Response>(_PeticionDiscretasDA4Response_QNAME, PeticionDiscretasDA4Response.class, null, value);
    }

}
