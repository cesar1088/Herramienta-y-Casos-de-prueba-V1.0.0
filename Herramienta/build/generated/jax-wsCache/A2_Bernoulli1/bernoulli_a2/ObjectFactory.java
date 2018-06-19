
package bernoulli_a2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the bernoulli_a2 package. 
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

    private final static QName _PeticionBernoulliA2Response_QNAME = new QName("http://Bernoulli_A2/", "peticionBernoulliA2Response");
    private final static QName _PeticionBernoulliA2_QNAME = new QName("http://Bernoulli_A2/", "peticionBernoulliA2");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: bernoulli_a2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PeticionBernoulliA2 }
     * 
     */
    public PeticionBernoulliA2 createPeticionBernoulliA2() {
        return new PeticionBernoulliA2();
    }

    /**
     * Create an instance of {@link PeticionBernoulliA2Response }
     * 
     */
    public PeticionBernoulliA2Response createPeticionBernoulliA2Response() {
        return new PeticionBernoulliA2Response();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionBernoulliA2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Bernoulli_A2/", name = "peticionBernoulliA2Response")
    public JAXBElement<PeticionBernoulliA2Response> createPeticionBernoulliA2Response(PeticionBernoulliA2Response value) {
        return new JAXBElement<PeticionBernoulliA2Response>(_PeticionBernoulliA2Response_QNAME, PeticionBernoulliA2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionBernoulliA2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Bernoulli_A2/", name = "peticionBernoulliA2")
    public JAXBElement<PeticionBernoulliA2> createPeticionBernoulliA2(PeticionBernoulliA2 value) {
        return new JAXBElement<PeticionBernoulliA2>(_PeticionBernoulliA2_QNAME, PeticionBernoulliA2 .class, null, value);
    }

}
