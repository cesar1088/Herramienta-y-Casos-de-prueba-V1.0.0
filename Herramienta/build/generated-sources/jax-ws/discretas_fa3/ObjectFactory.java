
package discretas_fa3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the discretas_fa3 package. 
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

    private final static QName _PeticionDiscretasFA3Response_QNAME = new QName("http://Discretas_FA3/", "peticionDiscretasFA3Response");
    private final static QName _PeticionDiscretasFA3_QNAME = new QName("http://Discretas_FA3/", "peticionDiscretasFA3");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: discretas_fa3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PeticionDiscretasFA3Response }
     * 
     */
    public PeticionDiscretasFA3Response createPeticionDiscretasFA3Response() {
        return new PeticionDiscretasFA3Response();
    }

    /**
     * Create an instance of {@link PeticionDiscretasFA3 }
     * 
     */
    public PeticionDiscretasFA3 createPeticionDiscretasFA3() {
        return new PeticionDiscretasFA3();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionDiscretasFA3Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Discretas_FA3/", name = "peticionDiscretasFA3Response")
    public JAXBElement<PeticionDiscretasFA3Response> createPeticionDiscretasFA3Response(PeticionDiscretasFA3Response value) {
        return new JAXBElement<PeticionDiscretasFA3Response>(_PeticionDiscretasFA3Response_QNAME, PeticionDiscretasFA3Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionDiscretasFA3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Discretas_FA3/", name = "peticionDiscretasFA3")
    public JAXBElement<PeticionDiscretasFA3> createPeticionDiscretasFA3(PeticionDiscretasFA3 value) {
        return new JAXBElement<PeticionDiscretasFA3>(_PeticionDiscretasFA3_QNAME, PeticionDiscretasFA3 .class, null, value);
    }

}
