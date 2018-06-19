
package hipercubo_a1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the hipercubo_a1 package. 
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

    private final static QName _PeticionHipercuboA1_QNAME = new QName("http://Hipercubo_A1/", "peticionHipercuboA1");
    private final static QName _PeticionHipercuboA1Response_QNAME = new QName("http://Hipercubo_A1/", "peticionHipercuboA1Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hipercubo_a1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PeticionHipercuboA1Response }
     * 
     */
    public PeticionHipercuboA1Response createPeticionHipercuboA1Response() {
        return new PeticionHipercuboA1Response();
    }

    /**
     * Create an instance of {@link PeticionHipercuboA1 }
     * 
     */
    public PeticionHipercuboA1 createPeticionHipercuboA1() {
        return new PeticionHipercuboA1();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionHipercuboA1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Hipercubo_A1/", name = "peticionHipercuboA1")
    public JAXBElement<PeticionHipercuboA1> createPeticionHipercuboA1(PeticionHipercuboA1 value) {
        return new JAXBElement<PeticionHipercuboA1>(_PeticionHipercuboA1_QNAME, PeticionHipercuboA1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionHipercuboA1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Hipercubo_A1/", name = "peticionHipercuboA1Response")
    public JAXBElement<PeticionHipercuboA1Response> createPeticionHipercuboA1Response(PeticionHipercuboA1Response value) {
        return new JAXBElement<PeticionHipercuboA1Response>(_PeticionHipercuboA1Response_QNAME, PeticionHipercuboA1Response.class, null, value);
    }

}
