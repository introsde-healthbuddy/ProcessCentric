
package introsde.storage.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import introsde.localdatabase.soap.Person;


/**
 * <p>Java class for editExerciseEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="editExerciseEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user" type="{http://soap.localdatabase.introsde/}person" minOccurs="0"/>
 *         &lt;element name="id_exercise" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minutes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editExerciseEntry", propOrder = {
    "user",
    "idExercise",
    "minutes"
})
public class EditExerciseEntry {

    protected Person user;
    @XmlElement(name = "id_exercise")
    protected int idExercise;
    protected int minutes;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setUser(Person value) {
        this.user = value;
    }

    /**
     * Gets the value of the idExercise property.
     * 
     */
    public int getIdExercise() {
        return idExercise;
    }

    /**
     * Sets the value of the idExercise property.
     * 
     */
    public void setIdExercise(int value) {
        this.idExercise = value;
    }

    /**
     * Gets the value of the minutes property.
     * 
     */
    public int getMinutes() {
        return minutes;
    }

    /**
     * Sets the value of the minutes property.
     * 
     */
    public void setMinutes(int value) {
        this.minutes = value;
    }

}
