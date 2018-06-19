
package discretas_fa2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para peticionDiscretasFA2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="peticionDiscretasFA2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="totalDiscretas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "peticionDiscretasFA2", propOrder = {
    "totalDiscretas"
})
public class PeticionDiscretasFA2 {

    protected int totalDiscretas;

    /**
     * Obtiene el valor de la propiedad totalDiscretas.
     * 
     */
    public int getTotalDiscretas() {
        return totalDiscretas;
    }

    /**
     * Define el valor de la propiedad totalDiscretas.
     * 
     */
    public void setTotalDiscretas(int value) {
        this.totalDiscretas = value;
    }

}
