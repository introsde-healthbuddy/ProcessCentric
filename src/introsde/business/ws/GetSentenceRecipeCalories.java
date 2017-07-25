
package introsde.business.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getSentenceRecipeCalories complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getSentenceRecipeCalories">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chatId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="recipeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSentenceRecipeCalories", propOrder = {
    "chatId",
    "recipeId"
})
public class GetSentenceRecipeCalories {

    protected Long chatId;
    protected Integer recipeId;

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
     * Recupera il valore della proprietà recipeId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecipeId() {
        return recipeId;
    }

    /**
     * Imposta il valore della proprietà recipeId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecipeId(Integer value) {
        this.recipeId = value;
    }

}
