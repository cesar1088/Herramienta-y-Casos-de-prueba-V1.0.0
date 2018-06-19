
package discretas_da1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para peticionDiscretasDA1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="peticionDiscretasDA1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="repeticiones" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "peticionDiscretasDA1", propOrder = {
    "repeticiones"
})
public class PeticionDiscretasDA1 {

    protected int repeticiones;

    /**
     * Obtiene el valor de la propiedad repeticiones.
     * 
     */
    public int getRepeticiones() {
        return repeticiones;
    }

    /**
     * Define el valor de la propiedad repeticiones.
     * 
     */
    public void setRepeticiones(int value) {
        this.repeticiones = value;
    }

}
