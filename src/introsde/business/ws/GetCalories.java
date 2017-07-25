
package introsde.business.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import introsde.adapter.ws.Exercise;


/**
 * <p>Classe Java per getCalories complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getCalories">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chatId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="exercise" type="{http://ws.adapter.introsde/}exercise" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCalories", propOrder = {
    "chatId",
    "exercise"
})
public class GetCalories {

    protected Long chatId;
    protected Exercise exercise;

    /**
     * Recupera il valore della proprietà chatId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getChatId() {
        return chatId;
    }

    /**
     * Imposta il valore della proprietà chatId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setChatId(Long value) {
        this.chatId = value;
    }

    /**
     * Recupera il valore della proprietà exercise.
     * 
     * @return
     *     possible object is
     *     {@link Exercise }
     *     
     */
    public Exercise getExercise() {
        return exercise;
    }

    /**
     * Imposta il valore della proprietà exercise.
     * 
     * @param value
     *     allowed object is
     *     {@link Exercise }
     *     
     */
    public void setExercise(Exercise value) {
        this.exercise = value;
    }

}
