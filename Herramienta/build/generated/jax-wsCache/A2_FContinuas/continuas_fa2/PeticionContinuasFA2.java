
package continuas_fa2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para peticionContinuasFA2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="peticionContinuasFA2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="totalContinuas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipoMetodos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "peticionContinuasFA2", propOrder = {
    "totalContinuas",
    "tipoMetodos"
})
public class PeticionContinuasFA2 {

    protected int totalContinuas;
    protected int tipoMetodos;

    /**
     * Obtiene el valor de la propiedad totalContinuas.
     * 
     */
    public int getTotalContinuas() {
        return totalContinuas;
    }

    /**
     * Define el valor de la propiedad totalContinuas.
     * 
     */
    public void setTotalContinuas(int value) {
        this.totalContinuas = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoMetodos.
     * 
     */
    public int getTipoMetodos() {
        return tipoMetodos;
    }

    /**
     * Define el valor de la propiedad tipoMetodos.
     * 
     */
    public void setTipoMetodos(int value) {
        this.tipoMetodos = value;
    }

}
