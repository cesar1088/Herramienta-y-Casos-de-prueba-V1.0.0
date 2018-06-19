
package hipercubo_a3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the hipercubo_a3 package. 
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

    private final static QName _PeticionHipercuboA3_QNAME = new QName("http://Hipercubo_A3/", "peticionHipercuboA3");
    private final static QName _PeticionHipercuboA3Response_QNAME = new QName("http://Hipercubo_A3/", "peticionHipercuboA3Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hipercubo_a3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PeticionHipercuboA3 }
     * 
     */
    public PeticionHipercuboA3 createPeticionHipercuboA3() {
        return new PeticionHipercuboA3();
    }

    /**
     * Create an instance of {@link PeticionHipercuboA3Response }
     * 
     */
    public PeticionHipercuboA3Response createPeticionHipercuboA3Response() {
        return new PeticionHipercuboA3Response();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionHipercuboA3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Hipercubo_A3/", name = "peticionHipercuboA3")
    public JAXBElement<PeticionHipercuboA3> createPeticionHipercuboA3(PeticionHipercuboA3 value) {
        return new JAXBElement<PeticionHipercuboA3>(_PeticionHipercuboA3_QNAME, PeticionHipercuboA3 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionHipercuboA3Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Hipercubo_A3/", name = "peticionHipercuboA3Response")
    public JAXBElement<PeticionHipercuboA3Response> createPeticionHipercuboA3Response(PeticionHipercuboA3Response value) {
        return new JAXBElement<PeticionHipercuboA3Response>(_PeticionHipercuboA3Response_QNAME, PeticionHipercuboA3Response.class, null, value);
    }

}
