package introsde.processcentric.resources;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.POST;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import javax.xml.ws.Holder;

import introsde.processcentric.model.GoalList;
import introsde.storage.ws.Storage;
import introsde.storage.ws.StorageService;

import introsde.localdatabase.soap.Goal;

@Stateless // only used if the the application is deployed in a Java EE container
@LocalBean // only used if the the application is deployed in a Java EE container
@Path("/goal")
public class GoalResource {

    @Context
    UriInfo uriInfo;
    @Context
    Request request;
    
	StorageService sService;
	Storage storage;

	public void initializeStorage(){
		sService = new StorageService();
		storage = sService.getStorageImplPort();
	}
	
	@GET
	@Produces({ MediaType.APPLICATION_XML})
	@Path("{personId}")
	public Response readPersonGoals(@PathParam("personId") Long personId) {
		System.out.println("--> Reading Person Goals");
		System.out.println("Person: " + personId);
		
		initializeStorage();
		
		GoalList goalList = new GoalList();
		goalList.setGoalList(storage.readGoal(personId));

		
        if (goalList.getGoalList() == null) {
        	return Response.noContent().build();
        }

        return Response.ok().entity(goalList).build(); 
	}
	
	@POST
	@Consumes({ MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_XML})
	@Path("{personId}")
	public Response createGoal(@PathParam("personId") Long personId, Goal goal) {
		System.out.println("--> creating goal for person with id=" + personId );
		
		initializeStorage();
		
		Holder<Goal> holder = new Holder<Goal>(goal);
        storage.createGoal(personId, holder);
        
        if (holder.value == null) {
        	return Response.notModified().build();
        }
        return Response.ok().entity(new JAXBElement<Goal>(
				new QName("goal"), 
			    Goal.class, 
			    holder.value)).build(); 
	}

	@PUT
	@Consumes({ MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_XML})
	@Path("{personId}")
	public Response updateGoal(@PathParam("personId") Long personId, Goal goal) {
		System.out.println("--> updating goal for person with id=" + personId );
		
		initializeStorage();
		
		Holder<Goal> holder = new Holder<Goal>(goal);
        storage.updateGoal(personId, holder);
        
        if (holder.value == null) {
        	return Response.notModified().build();
        }
        return Response.ok().entity(new JAXBElement<Goal>(
				new QName("goal"), 
			    Goal.class, 
			    holder.value)).build(); 
	}
	
	@DELETE
    @Path("{goalId}")
    public Response deleteGoal(@PathParam("goalId") Long goalId) {
    	
    	initializeStorage();
    	
    	storage.deleteGoal(goalId);
    	
        return Response.noContent().build();
    	
    }
	
}
