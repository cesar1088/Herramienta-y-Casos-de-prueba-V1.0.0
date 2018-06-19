
package continuas_da2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para peticionContinuasDA2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="peticionContinuasDA2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="totalContinuas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="metodos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "peticionContinuasDA2", propOrder = {
    "totalContinuas",
    "metodos"
})
public class PeticionContinuasDA2 {

    protected int totalContinuas;
    protected int metodos;

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
     * Obtiene el valor de la propiedad metodos.
     * 
     */
    public int getMetodos() {
        return metodos;
    }

    /**
     * Define el valor de la propiedad metodos.
     * 
     */
    public void setMetodos(int value) {
        this.metodos = value;
    }

}
