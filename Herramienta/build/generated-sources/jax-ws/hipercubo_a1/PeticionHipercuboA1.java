
package hipercubo_a1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para peticionHipercuboA1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="peticionHipercuboA1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dimension" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "peticionHipercuboA1", propOrder = {
    "dimension"
})
public class PeticionHipercuboA1 {

    protected int dimension;

    /**
     * Obtiene el valor de la propiedad dimension.
     * 
     */
    public int getDimension() {
        return dimension;
    }

    /**
     * Define el valor de la propiedad dimension.
     * 
     */
    public void setDimension(int value) {
        this.dimension = value;
    }

}
