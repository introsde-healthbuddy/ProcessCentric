
package introsde.storage.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde.storage.ws package. 
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

    private final static QName _ReadGoalResponse_QNAME = new QName("http://ws.storage.introsde/", "readGoalResponse");
    private final static QName _GetExercises_QNAME = new QName("http://ws.storage.introsde/", "getExercises");
    private final static QName _DeletePersonResponse_QNAME = new QName("http://ws.storage.introsde/", "deletePersonResponse");
    private final static QName _UpdatePersonMeasureResponse_QNAME = new QName("http://ws.storage.introsde/", "updatePersonMeasureResponse");
    private final static QName _CreateActivityResponse_QNAME = new QName("http://ws.storage.introsde/", "createActivityResponse");
    private final static QName _UpdateActivity_QNAME = new QName("http://ws.storage.introsde/", "updateActivity");
    private final static QName _ReadActivityResponse_QNAME = new QName("http://ws.storage.introsde/", "readActivityResponse");
    private final static QName _DeleteActivityResponse_QNAME = new QName("http://ws.storage.introsde/", "deleteActivityResponse");
    private final static QName _ReadActivity_QNAME = new QName("http://ws.storage.introsde/", "readActivity");
    private final static QName _ReadGoal_QNAME = new QName("http://ws.storage.introsde/", "readGoal");
    private final static QName _DeleteGoalResponse_QNAME = new QName("http://ws.storage.introsde/", "deleteGoalResponse");
    private final static QName _SearchFood_QNAME = new QName("http://ws.storage.introsde/", "searchFood");
    private final static QName _ReadMeasureTypesResponse_QNAME = new QName("http://ws.storage.introsde/", "readMeasureTypesResponse");
    private final static QName _ReadPersonMeasure_QNAME = new QName("http://ws.storage.introsde/", "readPersonMeasure");
    private final static QName _CreateGoal_QNAME = new QName("http://ws.storage.introsde/", "createGoal");
    private final static QName _DeleteGoal_QNAME = new QName("http://ws.storage.introsde/", "deleteGoal");
    private final static QName _GetPeopleList_QNAME = new QName("http://ws.storage.introsde/", "getPeopleList");
    private final static QName _ReadPersonMeasureResponse_QNAME = new QName("http://ws.storage.introsde/", "readPersonMeasureResponse");
    private final static QName _GetExercisesResponse_QNAME = new QName("http://ws.storage.introsde/", "getExercisesResponse");
    private final static QName _GetFoodResponse_QNAME = new QName("http://ws.storage.introsde/", "getFoodResponse");
    private final static QName _UpdatePerson_QNAME = new QName("http://ws.storage.introsde/", "updatePerson");
    private final static QName _CreateGoalResponse_QNAME = new QName("http://ws.storage.introsde/", "createGoalResponse");
    private final static QName _ReadPersonHistory_QNAME = new QName("http://ws.storage.introsde/", "readPersonHistory");
    private final static QName _ReadPersonResponse_QNAME = new QName("http://ws.storage.introsde/", "readPersonResponse");
    private final static QName _ReadPersonHistoryResponse_QNAME = new QName("http://ws.storage.introsde/", "readPersonHistoryResponse");
    private final static QName _UpdatePersonResponse_QNAME = new QName("http://ws.storage.introsde/", "updatePersonResponse");
    private final static QName _ReadPerson_QNAME = new QName("http://ws.storage.introsde/", "readPerson");
    private final static QName _DeleteActivity_QNAME = new QName("http://ws.storage.introsde/", "deleteActivity");
    private final static QName _GetPeopleListResponse_QNAME = new QName("http://ws.storage.introsde/", "getPeopleListResponse");
    private final static QName _UpdateGoal_QNAME = new QName("http://ws.storage.introsde/", "updateGoal");
    private final static QName _GetFood_QNAME = new QName("http://ws.storage.introsde/", "getFood");
    private final static QName _ReadMeasureTypes_QNAME = new QName("http://ws.storage.introsde/", "readMeasureTypes");
    private final static QName _CreatePerson_QNAME = new QName("http://ws.storage.introsde/", "createPerson");
    private final static QName _UpdateActivityResponse_QNAME = new QName("http://ws.storage.introsde/", "updateActivityResponse");
    private final static QName _SearchFoodResponse_QNAME = new QName("http://ws.storage.introsde/", "searchFoodResponse");
    private final static QName _UpdatePersonMeasure_QNAME = new QName("http://ws.storage.introsde/", "updatePersonMeasure");
    private final static QName _CreateActivity_QNAME = new QName("http://ws.storage.introsde/", "createActivity");
    private final static QName _UpdateGoalResponse_QNAME = new QName("http://ws.storage.introsde/", "updateGoalResponse");
    private final static QName _DeletePerson_QNAME = new QName("http://ws.storage.introsde/", "deletePerson");
    private final static QName _CreatePersonResponse_QNAME = new QName("http://ws.storage.introsde/", "createPersonResponse");
    private final static QName _SavePersonMeasure_QNAME = new QName("http://ws.storage.introsde/", "savePersonMeasure");
    private final static QName _SavePersonMeasureResponse_QNAME = new QName("http://ws.storage.introsde/", "savePersonMeasureResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.storage.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteGoalResponse }
     * 
     */
    public DeleteGoalResponse createDeleteGoalResponse() {
        return new DeleteGoalResponse();
    }

    /**
     * Create an instance of {@link ReadMeasureTypesResponse }
     * 
     */
    public ReadMeasureTypesResponse createReadMeasureTypesResponse() {
        return new ReadMeasureTypesResponse();
    }

    /**
     * Create an instance of {@link SearchFood }
     * 
     */
    public SearchFood createSearchFood() {
        return new SearchFood();
    }

    /**
     * Create an instance of {@link ReadActivityResponse }
     * 
     */
    public ReadActivityResponse createReadActivityResponse() {
        return new ReadActivityResponse();
    }

    /**
     * Create an instance of {@link ReadGoal }
     * 
     */
    public ReadGoal createReadGoal() {
        return new ReadGoal();
    }

    /**
     * Create an instance of {@link DeleteActivityResponse }
     * 
     */
    public DeleteActivityResponse createDeleteActivityResponse() {
        return new DeleteActivityResponse();
    }

    /**
     * Create an instance of {@link ReadActivity }
     * 
     */
    public ReadActivity createReadActivity() {
        return new ReadActivity();
    }

    /**
     * Create an instance of {@link CreateActivityResponse }
     * 
     */
    public CreateActivityResponse createCreateActivityResponse() {
        return new CreateActivityResponse();
    }

    /**
     * Create an instance of {@link UpdateActivity }
     * 
     */
    public UpdateActivity createUpdateActivity() {
        return new UpdateActivity();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     * 
     */
    public DeletePersonResponse createDeletePersonResponse() {
        return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonMeasureResponse }
     * 
     */
    public UpdatePersonMeasureResponse createUpdatePersonMeasureResponse() {
        return new UpdatePersonMeasureResponse();
    }

    /**
     * Create an instance of {@link GetExercises }
     * 
     */
    public GetExercises createGetExercises() {
        return new GetExercises();
    }

    /**
     * Create an instance of {@link ReadGoalResponse }
     * 
     */
    public ReadGoalResponse createReadGoalResponse() {
        return new ReadGoalResponse();
    }

    /**
     * Create an instance of {@link DeletePerson }
     * 
     */
    public DeletePerson createDeletePerson() {
        return new DeletePerson();
    }

    /**
     * Create an instance of {@link CreatePersonResponse }
     * 
     */
    public CreatePersonResponse createCreatePersonResponse() {
        return new CreatePersonResponse();
    }

    /**
     * Create an instance of {@link CreateActivity }
     * 
     */
    public CreateActivity createCreateActivity() {
        return new CreateActivity();
    }

    /**
     * Create an instance of {@link UpdateGoalResponse }
     * 
     */
    public UpdateGoalResponse createUpdateGoalResponse() {
        return new UpdateGoalResponse();
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
     * Create an instance of {@link CreatePerson }
     * 
     */
    public CreatePerson createCreatePerson() {
        return new CreatePerson();
    }

    /**
     * Create an instance of {@link UpdateActivityResponse }
     * 
     */
    public UpdateActivityResponse createUpdateActivityResponse() {
        return new UpdateActivityResponse();
    }

    /**
     * Create an instance of {@link UpdateGoal }
     * 
     */
    public UpdateGoal createUpdateGoal() {
        return new UpdateGoal();
    }

    /**
     * Create an instance of {@link GetFood }
     * 
     */
    public GetFood createGetFood() {
        return new GetFood();
    }

    /**
     * Create an instance of {@link ReadMeasureTypes }
     * 
     */
    public ReadMeasureTypes createReadMeasureTypes() {
        return new ReadMeasureTypes();
    }

    /**
     * Create an instance of {@link SearchFoodResponse }
     * 
     */
    public SearchFoodResponse createSearchFoodResponse() {
        return new SearchFoodResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonMeasure }
     * 
     */
    public UpdatePersonMeasure createUpdatePersonMeasure() {
        return new UpdatePersonMeasure();
    }

    /**
     * Create an instance of {@link ReadPersonHistoryResponse }
     * 
     */
    public ReadPersonHistoryResponse createReadPersonHistoryResponse() {
        return new ReadPersonHistoryResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link CreateGoalResponse }
     * 
     */
    public CreateGoalResponse createCreateGoalResponse() {
        return new CreateGoalResponse();
    }

    /**
     * Create an instance of {@link ReadPersonHistory }
     * 
     */
    public ReadPersonHistory createReadPersonHistory() {
        return new ReadPersonHistory();
    }

    /**
     * Create an instance of {@link ReadPersonResponse }
     * 
     */
    public ReadPersonResponse createReadPersonResponse() {
        return new ReadPersonResponse();
    }

    /**
     * Create an instance of {@link DeleteActivity }
     * 
     */
    public DeleteActivity createDeleteActivity() {
        return new DeleteActivity();
    }

    /**
     * Create an instance of {@link GetPeopleListResponse }
     * 
     */
    public GetPeopleListResponse createGetPeopleListResponse() {
        return new GetPeopleListResponse();
    }

    /**
     * Create an instance of {@link ReadPerson }
     * 
     */
    public ReadPerson createReadPerson() {
        return new ReadPerson();
    }

    /**
     * Create an instance of {@link CreateGoal }
     * 
     */
    public CreateGoal createCreateGoal() {
        return new CreateGoal();
    }

    /**
     * Create an instance of {@link DeleteGoal }
     * 
     */
    public DeleteGoal createDeleteGoal() {
        return new DeleteGoal();
    }

    /**
     * Create an instance of {@link ReadPersonMeasure }
     * 
     */
    public ReadPersonMeasure createReadPersonMeasure() {
        return new ReadPersonMeasure();
    }

    /**
     * Create an instance of {@link ReadPersonMeasureResponse }
     * 
     */
    public ReadPersonMeasureResponse createReadPersonMeasureResponse() {
        return new ReadPersonMeasureResponse();
    }

    /**
     * Create an instance of {@link GetExercisesResponse }
     * 
     */
    public GetExercisesResponse createGetExercisesResponse() {
        return new GetExercisesResponse();
    }

    /**
     * Create an instance of {@link GetFoodResponse }
     * 
     */
    public GetFoodResponse createGetFoodResponse() {
        return new GetFoodResponse();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link GetPeopleList }
     * 
     */
    public GetPeopleList createGetPeopleList() {
        return new GetPeopleList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "readGoalResponse")
    public JAXBElement<ReadGoalResponse> createReadGoalResponse(ReadGoalResponse value) {
        return new JAXBElement<ReadGoalResponse>(_ReadGoalResponse_QNAME, ReadGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExercises }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "getExercises")
    public JAXBElement<GetExercises> createGetExercises(GetExercises value) {
        return new JAXBElement<GetExercises>(_GetExercises_QNAME, GetExercises.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "deletePersonResponse")
    public JAXBElement<DeletePersonResponse> createDeletePersonResponse(DeletePersonResponse value) {
        return new JAXBElement<DeletePersonResponse>(_DeletePersonResponse_QNAME, DeletePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "updatePersonMeasureResponse")
    public JAXBElement<UpdatePersonMeasureResponse> createUpdatePersonMeasureResponse(UpdatePersonMeasureResponse value) {
        return new JAXBElement<UpdatePersonMeasureResponse>(_UpdatePersonMeasureResponse_QNAME, UpdatePersonMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateActivityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "createActivityResponse")
    public JAXBElement<CreateActivityResponse> createCreateActivityResponse(CreateActivityResponse value) {
        return new JAXBElement<CreateActivityResponse>(_CreateActivityResponse_QNAME, CreateActivityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateActivity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "updateActivity")
    public JAXBElement<UpdateActivity> createUpdateActivity(UpdateActivity value) {
        return new JAXBElement<UpdateActivity>(_UpdateActivity_QNAME, UpdateActivity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadActivityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "readActivityResponse")
    public JAXBElement<ReadActivityResponse> createReadActivityResponse(ReadActivityResponse value) {
        return new JAXBElement<ReadActivityResponse>(_ReadActivityResponse_QNAME, ReadActivityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteActivityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "deleteActivityResponse")
    public JAXBElement<DeleteActivityResponse> createDeleteActivityResponse(DeleteActivityResponse value) {
        return new JAXBElement<DeleteActivityResponse>(_DeleteActivityResponse_QNAME, DeleteActivityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadActivity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "readActivity")
    public JAXBElement<ReadActivity> createReadActivity(ReadActivity value) {
        return new JAXBElement<ReadActivity>(_ReadActivity_QNAME, ReadActivity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "readGoal")
    public JAXBElement<ReadGoal> createReadGoal(ReadGoal value) {
        return new JAXBElement<ReadGoal>(_ReadGoal_QNAME, ReadGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "deleteGoalResponse")
    public JAXBElement<DeleteGoalResponse> createDeleteGoalResponse(DeleteGoalResponse value) {
        return new JAXBElement<DeleteGoalResponse>(_DeleteGoalResponse_QNAME, DeleteGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFood }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "searchFood")
    public JAXBElement<SearchFood> createSearchFood(SearchFood value) {
        return new JAXBElement<SearchFood>(_SearchFood_QNAME, SearchFood.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "readMeasureTypesResponse")
    public JAXBElement<ReadMeasureTypesResponse> createReadMeasureTypesResponse(ReadMeasureTypesResponse value) {
        return new JAXBElement<ReadMeasureTypesResponse>(_ReadMeasureTypesResponse_QNAME, ReadMeasureTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "readPersonMeasure")
    public JAXBElement<ReadPersonMeasure> createReadPersonMeasure(ReadPersonMeasure value) {
        return new JAXBElement<ReadPersonMeasure>(_ReadPersonMeasure_QNAME, ReadPersonMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "createGoal")
    public JAXBElement<CreateGoal> createCreateGoal(CreateGoal value) {
        return new JAXBElement<CreateGoal>(_CreateGoal_QNAME, CreateGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "deleteGoal")
    public JAXBElement<DeleteGoal> createDeleteGoal(DeleteGoal value) {
        return new JAXBElement<DeleteGoal>(_DeleteGoal_QNAME, DeleteGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPeopleList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "getPeopleList")
    public JAXBElement<GetPeopleList> createGetPeopleList(GetPeopleList value) {
        return new JAXBElement<GetPeopleList>(_GetPeopleList_QNAME, GetPeopleList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "readPersonMeasureResponse")
    public JAXBElement<ReadPersonMeasureResponse> createReadPersonMeasureResponse(ReadPersonMeasureResponse value) {
        return new JAXBElement<ReadPersonMeasureResponse>(_ReadPersonMeasureResponse_QNAME, ReadPersonMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExercisesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "getExercisesResponse")
    public JAXBElement<GetExercisesResponse> createGetExercisesResponse(GetExercisesResponse value) {
        return new JAXBElement<GetExercisesResponse>(_GetExercisesResponse_QNAME, GetExercisesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFoodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "getFoodResponse")
    public JAXBElement<GetFoodResponse> createGetFoodResponse(GetFoodResponse value) {
        return new JAXBElement<GetFoodResponse>(_GetFoodResponse_QNAME, GetFoodResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<UpdatePerson>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "createGoalResponse")
    public JAXBElement<CreateGoalResponse> createCreateGoalResponse(CreateGoalResponse value) {
        return new JAXBElement<CreateGoalResponse>(_CreateGoalResponse_QNAME, CreateGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "readPersonHistory")
    public JAXBElement<ReadPersonHistory> createReadPersonHistory(ReadPersonHistory value) {
        return new JAXBElement<ReadPersonHistory>(_ReadPersonHistory_QNAME, ReadPersonHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "readPersonResponse")
    public JAXBElement<ReadPersonResponse> createReadPersonResponse(ReadPersonResponse value) {
        return new JAXBElement<ReadPersonResponse>(_ReadPersonResponse_QNAME, ReadPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "readPersonHistoryResponse")
    public JAXBElement<ReadPersonHistoryResponse> createReadPersonHistoryResponse(ReadPersonHistoryResponse value) {
        return new JAXBElement<ReadPersonHistoryResponse>(_ReadPersonHistoryResponse_QNAME, ReadPersonHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<UpdatePersonResponse>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "readPerson")
    public JAXBElement<ReadPerson> createReadPerson(ReadPerson value) {
        return new JAXBElement<ReadPerson>(_ReadPerson_QNAME, ReadPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteActivity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "deleteActivity")
    public JAXBElement<DeleteActivity> createDeleteActivity(DeleteActivity value) {
        return new JAXBElement<DeleteActivity>(_DeleteActivity_QNAME, DeleteActivity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPeopleListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "getPeopleListResponse")
    public JAXBElement<GetPeopleListResponse> createGetPeopleListResponse(GetPeopleListResponse value) {
        return new JAXBElement<GetPeopleListResponse>(_GetPeopleListResponse_QNAME, GetPeopleListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "updateGoal")
    public JAXBElement<UpdateGoal> createUpdateGoal(UpdateGoal value) {
        return new JAXBElement<UpdateGoal>(_UpdateGoal_QNAME, UpdateGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFood }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "getFood")
    public JAXBElement<GetFood> createGetFood(GetFood value) {
        return new JAXBElement<GetFood>(_GetFood_QNAME, GetFood.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "readMeasureTypes")
    public JAXBElement<ReadMeasureTypes> createReadMeasureTypes(ReadMeasureTypes value) {
        return new JAXBElement<ReadMeasureTypes>(_ReadMeasureTypes_QNAME, ReadMeasureTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "createPerson")
    public JAXBElement<CreatePerson> createCreatePerson(CreatePerson value) {
        return new JAXBElement<CreatePerson>(_CreatePerson_QNAME, CreatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateActivityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "updateActivityResponse")
    public JAXBElement<UpdateActivityResponse> createUpdateActivityResponse(UpdateActivityResponse value) {
        return new JAXBElement<UpdateActivityResponse>(_UpdateActivityResponse_QNAME, UpdateActivityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchFoodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "searchFoodResponse")
    public JAXBElement<SearchFoodResponse> createSearchFoodResponse(SearchFoodResponse value) {
        return new JAXBElement<SearchFoodResponse>(_SearchFoodResponse_QNAME, SearchFoodResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "updatePersonMeasure")
    public JAXBElement<UpdatePersonMeasure> createUpdatePersonMeasure(UpdatePersonMeasure value) {
        return new JAXBElement<UpdatePersonMeasure>(_UpdatePersonMeasure_QNAME, UpdatePersonMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateActivity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "createActivity")
    public JAXBElement<CreateActivity> createCreateActivity(CreateActivity value) {
        return new JAXBElement<CreateActivity>(_CreateActivity_QNAME, CreateActivity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "updateGoalResponse")
    public JAXBElement<UpdateGoalResponse> createUpdateGoalResponse(UpdateGoalResponse value) {
        return new JAXBElement<UpdateGoalResponse>(_UpdateGoalResponse_QNAME, UpdateGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "deletePerson")
    public JAXBElement<DeletePerson> createDeletePerson(DeletePerson value) {
        return new JAXBElement<DeletePerson>(_DeletePerson_QNAME, DeletePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "createPersonResponse")
    public JAXBElement<CreatePersonResponse> createCreatePersonResponse(CreatePersonResponse value) {
        return new JAXBElement<CreatePersonResponse>(_CreatePersonResponse_QNAME, CreatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "savePersonMeasure")
    public JAXBElement<SavePersonMeasure> createSavePersonMeasure(SavePersonMeasure value) {
        return new JAXBElement<SavePersonMeasure>(_SavePersonMeasure_QNAME, SavePersonMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.storage.introsde/", name = "savePersonMeasureResponse")
    public JAXBElement<SavePersonMeasureResponse> createSavePersonMeasureResponse(SavePersonMeasureResponse value) {
        return new JAXBElement<SavePersonMeasureResponse>(_SavePersonMeasureResponse_QNAME, SavePersonMeasureResponse.class, null, value);
    }

}
