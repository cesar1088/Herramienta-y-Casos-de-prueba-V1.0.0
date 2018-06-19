
package hipercubo_a2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the hipercubo_a2 package. 
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

    private final static QName _PeticionHipercuboA2Response_QNAME = new QName("http://Hipercubo_A2/", "peticionHipercuboA2Response");
    private final static QName _PeticionHipercuboA2_QNAME = new QName("http://Hipercubo_A2/", "peticionHipercuboA2");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hipercubo_a2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PeticionHipercuboA2 }
     * 
     */
    public PeticionHipercuboA2 createPeticionHipercuboA2() {
        return new PeticionHipercuboA2();
    }

    /**
     * Create an instance of {@link PeticionHipercuboA2Response }
     * 
     */
    public PeticionHipercuboA2Response createPeticionHipercuboA2Response() {
        return new PeticionHipercuboA2Response();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionHipercuboA2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Hipercubo_A2/", name = "peticionHipercuboA2Response")
    public JAXBElement<PeticionHipercuboA2Response> createPeticionHipercuboA2Response(PeticionHipercuboA2Response value) {
        return new JAXBElement<PeticionHipercuboA2Response>(_PeticionHipercuboA2Response_QNAME, PeticionHipercuboA2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionHipercuboA2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Hipercubo_A2/", name = "peticionHipercuboA2")
    public JAXBElement<PeticionHipercuboA2> createPeticionHipercuboA2(PeticionHipercuboA2 value) {
        return new JAXBElement<PeticionHipercuboA2>(_PeticionHipercuboA2_QNAME, PeticionHipercuboA2 .class, null, value);
    }

}
