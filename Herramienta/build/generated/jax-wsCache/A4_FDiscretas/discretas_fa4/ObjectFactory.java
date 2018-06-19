
package discretas_fa4;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the discretas_fa4 package. 
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

    private final static QName _PeticionDiscretasFA4Response_QNAME = new QName("http://Discretas_FA4/", "peticionDiscretasFA4Response");
    private final static QName _PeticionDiscretasFA4_QNAME = new QName("http://Discretas_FA4/", "peticionDiscretasFA4");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: discretas_fa4
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PeticionDiscretasFA4Response }
     * 
     */
    public PeticionDiscretasFA4Response createPeticionDiscretasFA4Response() {
        return new PeticionDiscretasFA4Response();
    }

    /**
     * Create an instance of {@link PeticionDiscretasFA4 }
     * 
     */
    public PeticionDiscretasFA4 createPeticionDiscretasFA4() {
        return new PeticionDiscretasFA4();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionDiscretasFA4Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Discretas_FA4/", name = "peticionDiscretasFA4Response")
    public JAXBElement<PeticionDiscretasFA4Response> createPeticionDiscretasFA4Response(PeticionDiscretasFA4Response value) {
        return new JAXBElement<PeticionDiscretasFA4Response>(_PeticionDiscretasFA4Response_QNAME, PeticionDiscretasFA4Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionDiscretasFA4 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Discretas_FA4/", name = "peticionDiscretasFA4")
    public JAXBElement<PeticionDiscretasFA4> createPeticionDiscretasFA4(PeticionDiscretasFA4 value) {
        return new JAXBElement<PeticionDiscretasFA4>(_PeticionDiscretasFA4_QNAME, PeticionDiscretasFA4 .class, null, value);
    }

}
