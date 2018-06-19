
package bernoulli_a4;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the bernoulli_a4 package. 
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

    private final static QName _PeticionBernoulliA1Response_QNAME = new QName("http://Bernoulli_A4/", "peticionBernoulliA1Response");
    private final static QName _PeticionBernoulliA1_QNAME = new QName("http://Bernoulli_A4/", "peticionBernoulliA1");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: bernoulli_a4
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PeticionBernoulliA1Response }
     * 
     */
    public PeticionBernoulliA1Response createPeticionBernoulliA1Response() {
        return new PeticionBernoulliA1Response();
    }

    /**
     * Create an instance of {@link PeticionBernoulliA1 }
     * 
     */
    public PeticionBernoulliA1 createPeticionBernoulliA1() {
        return new PeticionBernoulliA1();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionBernoulliA1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Bernoulli_A4/", name = "peticionBernoulliA1Response")
    public JAXBElement<PeticionBernoulliA1Response> createPeticionBernoulliA1Response(PeticionBernoulliA1Response value) {
        return new JAXBElement<PeticionBernoulliA1Response>(_PeticionBernoulliA1Response_QNAME, PeticionBernoulliA1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionBernoulliA1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Bernoulli_A4/", name = "peticionBernoulliA1")
    public JAXBElement<PeticionBernoulliA1> createPeticionBernoulliA1(PeticionBernoulliA1 value) {
        return new JAXBElement<PeticionBernoulliA1>(_PeticionBernoulliA1_QNAME, PeticionBernoulliA1 .class, null, value);
    }

}
