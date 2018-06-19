
package continuas_fa1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para peticionContinuasFA1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="peticionContinuasFA1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="repeticiones" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipoAleatorios" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "peticionContinuasFA1", propOrder = {
    "repeticiones",
    "tipoAleatorios"
})
public class PeticionContinuasFA1 {

    protected int repeticiones;
    protected int tipoAleatorios;

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

    /**
     * Obtiene el valor de la propiedad tipoAleatorios.
     * 
     */
    public int getTipoAleatorios() {
        return tipoAleatorios;
    }

    /**
     * Define el valor de la propiedad tipoAleatorios.
     * 
     */
    public void setTipoAleatorios(int value) {
        this.tipoAleatorios = value;
    }

}
