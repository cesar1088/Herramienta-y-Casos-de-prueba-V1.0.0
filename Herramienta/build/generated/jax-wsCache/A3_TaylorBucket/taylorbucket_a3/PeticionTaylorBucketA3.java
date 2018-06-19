
package taylorbucket_a3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para peticionTaylorBucketA3 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="peticionTaylorBucketA3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalCasilleros" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="subAlgoritmo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "peticionTaylorBucketA3", propOrder = {
    "total",
    "totalCasilleros",
    "subAlgoritmo"
})
public class PeticionTaylorBucketA3 {

    protected int total;
    protected int totalCasilleros;
    protected int subAlgoritmo;

    /**
     * Obtiene el valor de la propiedad total.
     * 
     */
    public int getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     */
    public void setTotal(int value) {
        this.total = value;
    }

    /**
     * Obtiene el valor de la propiedad totalCasilleros.
     * 
     */
    public int getTotalCasilleros() {
        return totalCasilleros;
    }

    /**
     * Define el valor de la propiedad totalCasilleros.
     * 
     */
    public void setTotalCasilleros(int value) {
        this.totalCasilleros = value;
    }

    /**
     * Obtiene el valor de la propiedad subAlgoritmo.
     * 
     */
    public int getSubAlgoritmo() {
        return subAlgoritmo;
    }

    /**
     * Define el valor de la propiedad subAlgoritmo.
     * 
     */
    public void setSubAlgoritmo(int value) {
        this.subAlgoritmo = value;
    }

}
