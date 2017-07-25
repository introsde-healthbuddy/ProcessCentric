
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

    private final static QName _UpdatePersonResponse_QNAME = new QName("http://ws.business.introsde/", "updatePersonResponse");
    private final static QName _SetSleepTimeResponse_QNAME = new QName("http://ws.business.introsde/", "setSleepTimeResponse");
    private final static QName _GetCalories_QNAME = new QName("http://ws.business.introsde/", "getCalories");
    private final static QName _GetTodayExercises_QNAME = new QName("http://ws.business.introsde/", "getTodayExercises");
    private final static QName _UpdatePerson_QNAME = new QName("http://ws.business.introsde/", "updatePerson");
    private final static QName _SetSleepTime_QNAME = new QName("http://ws.business.introsde/", "setSleepTime");
    private final static QName _GetProfileResponse_QNAME = new QName("http://ws.business.introsde/", "getProfileResponse");
    private final static QName _CreatePersonResponse_QNAME = new QName("http://ws.business.introsde/", "createPersonResponse");
    private final static QName _GetExercise_QNAME = new QName("http://ws.business.introsde/", "getExercise");
    private final static QName _GetSentenceRecipeCaloriesResponse_QNAME = new QName("http://ws.business.introsde/", "getSentenceRecipeCaloriesResponse");
    private final static QName _SavePersonMeasure_QNAME = new QName("http://ws.business.introsde/", "savePersonMeasure");
    private final static QName _SavePersonMeasureResponse_QNAME = new QName("http://ws.business.introsde/", "savePersonMeasureResponse");
    private final static QName _GetCaloriesResponse_QNAME = new QName("http://ws.business.introsde/", "getCaloriesResponse");
    private final static QName _CreatePerson_QNAME = new QName("http://ws.business.introsde/", "createPerson");
    private final static QName _GetExerciseResponse_QNAME = new QName("http://ws.business.introsde/", "getExerciseResponse");
    private final static QName _GetProfile_QNAME = new QName("http://ws.business.introsde/", "getProfile");
    private final static QName _GetSentenceRecipeCalories_QNAME = new QName("http://ws.business.introsde/", "getSentenceRecipeCalories");
    private final static QName _GetTodayExercisesResponse_QNAME = new QName("http://ws.business.introsde/", "getTodayExercisesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.business.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreatePersonResponse }
     * 
     */
    public CreatePersonResponse createCreatePersonResponse() {
        return new CreatePersonResponse();
    }

    /**
     * Create an instance of {@link GetProfileResponse }
     * 
     */
    public GetProfileResponse createGetProfileResponse() {
        return new GetProfileResponse();
    }

    /**
     * Create an instance of {@link GetSentenceRecipeCaloriesResponse }
     * 
     */
    public GetSentenceRecipeCaloriesResponse createGetSentenceRecipeCaloriesResponse() {
        return new GetSentenceRecipeCaloriesResponse();
    }

    /**
     * Create an instance of {@link SavePersonMeasure }
     * 
     */
    public SavePersonMeasure createSavePersonMeasure() {
        return new SavePersonMeasure();
    }

    /**
     * Create an instance of {@link SavePersonMeasureResponse }
     * 
     */
    public SavePersonMeasureResponse createSavePersonMeasureResponse() {
        return new SavePersonMeasureResponse();
    }

    /**
     * Create an instance of {@link GetExercise }
     * 
     */
    public GetExercise createGetExercise() {
        return new GetExercise();
    }

    /**
     * Create an instance of {@link GetExerciseResponse }
     * 
     */
    public GetExerciseResponse createGetExerciseResponse() {
        return new GetExerciseResponse();
    }

    /**
     * Create an instance of {@link GetProfile }
     * 
     */
    public GetProfile createGetProfile() {
        return new GetProfile();
    }

    /**
     * Create an instance of {@link CreatePerson }
     * 
     */
    public CreatePerson createCreatePerson() {
        return new CreatePerson();
    }

    /**
     * Create an instance of {@link GetCaloriesResponse }
     * 
     */
    public GetCaloriesResponse createGetCaloriesResponse() {
        return new GetCaloriesResponse();
    }

    /**
     * Create an instance of {@link GetSentenceRecipeCalories }
     * 
     */
    public GetSentenceRecipeCalories createGetSentenceRecipeCalories() {
        return new GetSentenceRecipeCalories();
    }

    /**
     * Create an instance of {@link GetTodayExercisesResponse }
     * 
     */
    public GetTodayExercisesResponse createGetTodayExercisesResponse() {
        return new GetTodayExercisesResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link GetCalories }
     * 
     */
    public GetCalories createGetCalories() {
        return new GetCalories();
    }

    /**
     * Create an instance of {@link SetSleepTimeResponse }
     * 
     */
    public SetSleepTimeResponse createSetSleepTimeResponse() {
        return new SetSleepTimeResponse();
    }

    /**
     * Create an instance of {@link GetTodayExercises }
     * 
     */
    public GetTodayExercises createGetTodayExercises() {
        return new GetTodayExercises();
    }

    /**
     * Create an instance of {@link SetSleepTime }
     * 
     */
    public SetSleepTime createSetSleepTime() {
        return new SetSleepTime();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.introsde/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<UpdatePersonResponse>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetSleepTimeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.introsde/", name = "setSleepTimeResponse")
    public JAXBElement<SetSleepTimeResponse> createSetSleepTimeResponse(SetSleepTimeResponse value) {
        return new JAXBElement<SetSleepTimeResponse>(_SetSleepTimeResponse_QNAME, SetSleepTimeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCalories }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.introsde/", name = "getCalories")
    public JAXBElement<GetCalories> createGetCalories(GetCalories value) {
        return new JAXBElement<GetCalories>(_GetCalories_QNAME, GetCalories.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTodayExercises }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.introsde/", name = "getTodayExercises")
    public JAXBElement<GetTodayExercises> createGetTodayExercises(GetTodayExercises value) {
        return new JAXBElement<GetTodayExercises>(_GetTodayExercises_QNAME, GetTodayExercises.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.introsde/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<UpdatePerson>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetSleepTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.introsde/", name = "setSleepTime")
    public JAXBElement<SetSleepTime> createSetSleepTime(SetSleepTime value) {
        return new JAXBElement<SetSleepTime>(_SetSleepTime_QNAME, SetSleepTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.introsde/", name = "getProfileResponse")
    public JAXBElement<GetProfileResponse> createGetProfileResponse(GetProfileResponse value) {
        return new JAXBElement<GetProfileResponse>(_GetProfileResponse_QNAME, GetProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.introsde/", name = "createPersonResponse")
    public JAXBElement<CreatePersonResponse> createCreatePersonResponse(CreatePersonResponse value) {
        return new JAXBElement<CreatePersonResponse>(_CreatePersonResponse_QNAME, CreatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExercise }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.introsde/", name = "getExercise")
    public JAXBElement<GetExercise> createGetExercise(GetExercise value) {
        return new JAXBElement<GetExercise>(_GetExercise_QNAME, GetExercise.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSentenceRecipeCaloriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.introsde/", name = "getSentenceRecipeCaloriesResponse")
    public JAXBElement<GetSentenceRecipeCaloriesResponse> createGetSentenceRecipeCaloriesResponse(GetSentenceRecipeCaloriesResponse value) {
        return new JAXBElement<GetSentenceRecipeCaloriesResponse>(_GetSentenceRecipeCaloriesResponse_QNAME, GetSentenceRecipeCaloriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.introsde/", name = "savePersonMeasure")
    public JAXBElement<SavePersonMeasure> createSavePersonMeasure(SavePersonMeasure value) {
        return new JAXBElement<SavePersonMeasure>(_SavePersonMeasure_QNAME, SavePersonMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.introsde/", name = "savePersonMeasureResponse")
    public JAXBElement<SavePersonMeasureResponse> createSavePersonMeasureResponse(SavePersonMeasureResponse value) {
        return new JAXBElement<SavePersonMeasureResponse>(_SavePersonMeasureResponse_QNAME, SavePersonMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCaloriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.introsde/", name = "getCaloriesResponse")
    public JAXBElement<GetCaloriesResponse> createGetCaloriesResponse(GetCaloriesResponse value) {
        return new JAXBElement<GetCaloriesResponse>(_GetCaloriesResponse_QNAME, GetCaloriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.introsde/", name = "createPerson")
    public JAXBElement<CreatePerson> createCreatePerson(CreatePerson value) {
        return new JAXBElement<CreatePerson>(_CreatePerson_QNAME, CreatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExerciseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.introsde/", name = "getExerciseResponse")
    public JAXBElement<GetExerciseResponse> createGetExerciseResponse(GetExerciseResponse value) {
        return new JAXBElement<GetExerciseResponse>(_GetExerciseResponse_QNAME, GetExerciseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.introsde/", name = "getProfile")
    public JAXBElement<GetProfile> createGetProfile(GetProfile value) {
        return new JAXBElement<GetProfile>(_GetProfile_QNAME, GetProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSentenceRecipeCalories }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.introsde/", name = "getSentenceRecipeCalories")
    public JAXBElement<GetSentenceRecipeCalories> createGetSentenceRecipeCalories(GetSentenceRecipeCalories value) {
        return new JAXBElement<GetSentenceRecipeCalories>(_GetSentenceRecipeCalories_QNAME, GetSentenceRecipeCalories.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTodayExercisesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.business.introsde/", name = "getTodayExercisesResponse")
    public JAXBElement<GetTodayExercisesResponse> createGetTodayExercisesResponse(GetTodayExercisesResponse value) {
        return new JAXBElement<GetTodayExercisesResponse>(_GetTodayExercisesResponse_QNAME, GetTodayExercisesResponse.class, null, value);
    }

}
