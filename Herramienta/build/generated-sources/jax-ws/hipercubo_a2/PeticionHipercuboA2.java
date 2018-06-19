
package hipercubo_a2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para peticionHipercuboA2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="peticionHipercuboA2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dim" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "peticionHipercuboA2", propOrder = {
    "dim"
})
public class PeticionHipercuboA2 {

    protected int dim;

    /**
     * Obtiene el valor de la propiedad dim.
     * 
     */
    public int getDim() {
        return dim;
    }

    /**
     * Define el valor de la propiedad dim.
     * 
     */
    public void setDim(int value) {
        this.dim = value;
    }

}
