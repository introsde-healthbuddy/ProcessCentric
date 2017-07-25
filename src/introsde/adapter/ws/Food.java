
package introsde.adapter.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for food complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="food">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="food_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="food_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="food_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="food_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="food_url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "food", propOrder = {
    "foodDescription",
    "foodId",
    "foodName",
    "foodType",
    "foodUrl"
})
public class Food {

    @XmlElement(name = "food_description")
    protected String foodDescription;
    @XmlElement(name = "food_id")
    protected int foodId;
    @XmlElement(name = "food_name")
    protected String foodName;
    @XmlElement(name = "food_type")
    protected String foodType;
    @XmlElement(name = "food_url")
    protected String foodUrl;

    /**
     * Gets the value of the foodDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoodDescription() {
        return foodDescription;
    }

    /**
     * Sets the value of the foodDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoodDescription(String value) {
        this.foodDescription = value;
    }

    /**
     * Gets the value of the foodId property.
     * 
     */
    public int getFoodId() {
        return foodId;
    }

    /**
     * Sets the value of the foodId property.
     * 
     */
    public void setFoodId(int value) {
        this.foodId = value;
    }

    /**
     * Gets the value of the foodName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoodName() {
        return foodName;
    }

    /**
     * Sets the value of the foodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoodName(String value) {
        this.foodName = value;
    }

    /**
     * Gets the value of the foodType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoodType() {
        return foodType;
    }

    /**
     * Sets the value of the foodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoodType(String value) {
        this.foodType = value;
    }

    /**
     * Gets the value of the foodUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoodUrl() {
        return foodUrl;
    }

    /**
     * Sets the value of the foodUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoodUrl(String value) {
        this.foodUrl = value;
    }

}
