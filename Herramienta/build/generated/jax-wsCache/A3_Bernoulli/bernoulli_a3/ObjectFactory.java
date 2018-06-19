
package bernoulli_a3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the bernoulli_a3 package. 
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

    private final static QName _PeticionBernoulliA3_QNAME = new QName("http://Bernoulli_A3/", "peticionBernoulliA3");
    private final static QName _PeticionBernoulliA3Response_QNAME = new QName("http://Bernoulli_A3/", "peticionBernoulliA3Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: bernoulli_a3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PeticionBernoulliA3Response }
     * 
     */
    public PeticionBernoulliA3Response createPeticionBernoulliA3Response() {
        return new PeticionBernoulliA3Response();
    }

    /**
     * Create an instance of {@link PeticionBernoulliA3 }
     * 
     */
    public PeticionBernoulliA3 createPeticionBernoulliA3() {
        return new PeticionBernoulliA3();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionBernoulliA3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Bernoulli_A3/", name = "peticionBernoulliA3")
    public JAXBElement<PeticionBernoulliA3> createPeticionBernoulliA3(PeticionBernoulliA3 value) {
        return new JAXBElement<PeticionBernoulliA3>(_PeticionBernoulliA3_QNAME, PeticionBernoulliA3 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeticionBernoulliA3Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Bernoulli_A3/", name = "peticionBernoulliA3Response")
    public JAXBElement<PeticionBernoulliA3Response> createPeticionBernoulliA3Response(PeticionBernoulliA3Response value) {
        return new JAXBElement<PeticionBernoulliA3Response>(_PeticionBernoulliA3Response_QNAME, PeticionBernoulliA3Response.class, null, value);
    }

}
