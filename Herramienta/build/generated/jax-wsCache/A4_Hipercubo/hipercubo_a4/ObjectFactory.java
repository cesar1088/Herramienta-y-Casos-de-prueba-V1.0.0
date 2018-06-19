
package hipercubo_a4;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the hipercubo_a4 package. 
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

    private final static QName _PeticionHipercuboA4Response_QNAME = new QName("http://Hipercubo_A4/", "peticionHipercuboA4Response");
    private final static QName _PeticionHipercuboA4_QNAME = new QName("http://Hipercubo_A4/", "peticionHipercuboA4");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hipercubo_a4
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PeticionHipercuboA4 }
     * 
     */
    public PeticionHipercuboA4 createPeticionHipercuboA4() {
        return new PeticionHipercuboA4();
    }

    /**
     * Create an instance of {@link PeticionHipercuboA4Response }
     * 
     */
    public PeticionHipercuboA4Response createPeticionHipercuboA4Response() {
        return new PeticionHipercuboA4Response();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionHipercuboA4Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Hipercubo_A4/", name = "peticionHipercuboA4Response")
    public JAXBElement<PeticionHipercuboA4Response> createPeticionHipercuboA4Response(PeticionHipercuboA4Response value) {
        return new JAXBElement<PeticionHipercuboA4Response>(_PeticionHipercuboA4Response_QNAME, PeticionHipercuboA4Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionHipercuboA4 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Hipercubo_A4/", name = "peticionHipercuboA4")
    public JAXBElement<PeticionHipercuboA4> createPeticionHipercuboA4(PeticionHipercuboA4 value) {
        return new JAXBElement<PeticionHipercuboA4>(_PeticionHipercuboA4_QNAME, PeticionHipercuboA4 .class, null, value);
    }

}
