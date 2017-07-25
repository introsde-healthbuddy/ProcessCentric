
package introsde.business.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import introsde.adapter.ws.Exercise;


/**
 * <p>Classe Java per getCaloriesResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getCaloriesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calories" type="{http://ws.adapter.introsde/}exercise" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCaloriesResponse", propOrder = {
    "calories"
})
public class GetCaloriesResponse {

    protected Exercise calories;

    /**
     * Recupera il valore della proprietà calories.
     * 
     * @return
     *     possible object is
     *     {@link Exercise }
     *     
     */
    public Exercise getCalories() {
        return calories;
    }

    /**
     * Imposta il valore della proprietà calories.
     * 
     * @param value
     *     allowed object is
     *     {@link Exercise }
     *     
     */
    public void setCalories(Exercise value) {
        this.calories = value;
    }

}
