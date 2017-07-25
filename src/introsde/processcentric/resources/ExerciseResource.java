package introsde.processcentric.resources;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import introsde.adapter.ws.Exercise;
import introsde.business.ws.Business;
import introsde.business.ws.BusinessService;
import introsde.processcentric.model.ExerciseList;
import introsde.storage.ws.Storage;
import introsde.storage.ws.StorageService;


@Stateless // only used if the the application is deployed in a Java EE container
@LocalBean // only used if the the application is deployed in a Java EE container
@Path("/exercise")
public class ExerciseResource {
    @Context
    UriInfo uriInfo;
    @Context
    Request request;
    
	StorageService sService;
	Storage storage;
	BusinessService bService;
	Business business;
	
	
	public void initializeStorage(){
		sService = new StorageService();
		storage = sService.getStorageImplPort();
	}
	
	public void initializeBusiness(){
		bService = new BusinessService();
		business = bService.getBusinessImplPort();
	}
	
	@POST
	@Consumes({ MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_XML })
    @Path("{chatId}/calories")
	public Response getCalories(@PathParam("chatId") Long chatId, Exercise exercise) {
		System.out.println("--> Get calories... ");
		System.out.println("exercise " + exercise.getName() + " for " + exercise.getMinutes() + " minutes");

		initializeBusiness();
		
		Exercise ris = business.getCalories(chatId, exercise);

		if (ris.getCalories() < 0) {
			return Response.serverError().build();
		}
		return Response.ok().entity(new JAXBElement<Exercise>(
				new QName("exercise"), 
				Exercise.class, 
			    ris)).build();
	}
	
	@GET
	@Produces({ MediaType.APPLICATION_XML })
    @Path("{chatId}")
	public Response getRandomExercise(@PathParam("chatId") Long chatId) {
		System.out.println("--> Get exercise... ");
		System.out.println("chatId " + chatId);

		initializeBusiness();
		
		
		
		Exercise exercise = business.getExercise(chatId);
		if (exercise==null){
			return Response.noContent().build();
		}
		
		
		return Response.ok().entity(new JAXBElement<Exercise>(
				new QName("exercise"),
				Exercise.class,
				exercise)).build();
	}
	
	
	@GET
	@Produces({ MediaType.APPLICATION_XML })
    @Path("{chatId}/today")
	public Response getTodayExercises(@PathParam("chatId") Long chatId) {
		System.out.println("--> Get today exercise... ");
		System.out.println("chatId " + chatId);

		initializeBusiness();
		
		ExerciseList exerciseList = new ExerciseList();
		exerciseList.setExerciseList(business.getTodayExercises(chatId));
		
		if (exerciseList.getExerciseList() == null || exerciseList.getExerciseList().size() == 0) {
        	return Response.noContent().build();
        }

        return Response.ok().entity(exerciseList).build(); 
	}

	@PUT
    @Consumes({MediaType.TEXT_PLAIN})
    @Path("{chatId}/timesleep")
    public Response updateTimeSleep(@PathParam("chatId") Long chatId, String hours) {
        System.out.println("--> Updating time sleeping... ");
        System.out.println("chatId " + chatId + " hours = "+hours);
        
        try {
        	Double time = Double.parseDouble(hours);
        	initializeBusiness();
        	business.setSleepTime(chatId, time);
        	return Response.ok().build(); 
        	
        } catch (NumberFormatException e) {
        	return Response.serverError().build();
        }
        
    }
}
