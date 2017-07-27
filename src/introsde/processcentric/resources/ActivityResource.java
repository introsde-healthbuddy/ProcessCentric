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

import introsde.processcentric.model.ActivityList;
import introsde.storage.ws.Storage;
import introsde.storage.ws.StorageService;

import introsde.localdatabase.soap.Activity;

@Stateless // only used if the the application is deployed in a Java EE container
@LocalBean // only used if the the application is deployed in a Java EE container
@Path("/activity")
public class ActivityResource {

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
	public Response readPersonActivities(@PathParam("personId") Long personId) {
		System.out.println("--> Reading Person Activities");
		System.out.println("Person: " + personId);
		
		initializeStorage();
		
		ActivityList activityList = new ActivityList();
		activityList.setActivityList(storage.readActivity(personId));

		
        if (activityList.getActivityList() == null) {
        	return Response.noContent().build();
        }

        return Response.ok().entity(activityList).build(); 
	}
	
	@POST
	@Consumes({ MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_XML})
	@Path("{personId}")
	public Response createActivity(@PathParam("personId") Long personId, Activity activity) {
		System.out.println("--> creating activity for person with id=" + personId );
		
		initializeStorage();
		
		Holder<Activity> holder = new Holder<Activity>(activity);
        storage.createActivity(personId, holder);
        
        if (holder.value == null) {
        	return Response.notModified().build();
        }
        return Response.ok().entity(new JAXBElement<Activity>(
				new QName("activity"), 
			    Activity.class, 
			    holder.value)).build(); 
	}

	@PUT
	@Consumes({ MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_XML})
	@Path("{personId}")
	public Response updateActivity(@PathParam("personId") Long personId, Activity activity) {
		System.out.println("--> updating activity for person with id=" + personId );
		
		initializeStorage();
		
		Holder<Activity> holder = new Holder<Activity>(activity);
        storage.updateActivity(personId, holder);
        
        if (holder.value == null) {
        	return Response.notModified().build();
        }
        return Response.ok().entity(new JAXBElement<Activity>(
				new QName("activity"), 
			    Activity.class, 
			    holder.value)).build(); 
	}
	
	@DELETE
    @Path("{activityId}")
    public Response deleteActivity(@PathParam("activityId") Long activityId) {
    	
    	initializeStorage();
    	
    	storage.deleteActivity(activityId);
    	
        return Response.noContent().build();
    	
    }
	
}
