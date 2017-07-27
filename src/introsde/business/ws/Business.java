
package introsde.business.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import introsde.adapter.ws.Exercise;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Business", targetNamespace = "http://ws.business.introsde/")
@XmlSeeAlso({
    introsde.adapter.ws.ObjectFactory.class,
    introsde.business.ws.ObjectFactory.class
})
public interface Business {


    /**
     * 
     * @return
     *     returns java.util.List<introsde.adapter.ws.Exercise>
     */
    @WebMethod
    @WebResult(name = "exercises", targetNamespace = "")
    @RequestWrapper(localName = "getExercises", targetNamespace = "http://ws.business.introsde/", className = "introsde.business.ws.GetExercises")
    @ResponseWrapper(localName = "getExercisesResponse", targetNamespace = "http://ws.business.introsde/", className = "introsde.business.ws.GetExercisesResponse")
    @Action(input = "http://ws.business.introsde/Business/getExercisesRequest", output = "http://ws.business.introsde/Business/getExercisesResponse")
    public List<Exercise> getExercises();

}
