
package introsde.business.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde.business.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetExercises_QNAME = new QName("http://ws.business.introsde/", "getExercises");
    private final static QName _GetExercisesResponse_QNAME = new QName("http://ws.business.introsde/", "getExercisesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.business.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetExercises }
     * 
     */
    public GetExercises createGetExercises() {
        return new GetExercises();
    }

    /**
     * Create an instance of {@link GetExercisesResponse }
     * 
     */
    public GetExercisesResponse createGetExercisesResponse() {
        return new GetExercisesResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExercises }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.introsde/", name = "getExercises")
    public JAXBElement<GetExercises> createGetExercises(GetExercises value) {
        return new JAXBElement<GetExercises>(_GetExercises_QNAME, GetExercises.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExercisesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.introsde/", name = "getExercisesResponse")
    public JAXBElement<GetExercisesResponse> createGetExercisesResponse(GetExercisesResponse value) {
        return new JAXBElement<GetExercisesResponse>(_GetExercisesResponse_QNAME, GetExercisesResponse.class, null, value);
    }

}
