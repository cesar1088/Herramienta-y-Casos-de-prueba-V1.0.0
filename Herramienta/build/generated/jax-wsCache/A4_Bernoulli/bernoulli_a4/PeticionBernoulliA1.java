
package bernoulli_a4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para peticionBernoulliA1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="peticionBernoulliA1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="n" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "peticionBernoulliA1", propOrder = {
    "n"
})
public class PeticionBernoulliA1 {

    protected int n;

    /**
     * Obtiene el valor de la propiedad n.
     * 
     */
    public int getN() {
        return n;
    }

    /**
     * Define el valor de la propiedad n.
     * 
     */
    public void setN(int value) {
        this.n = value;
    }

}
