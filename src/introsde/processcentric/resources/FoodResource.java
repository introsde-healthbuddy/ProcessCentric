package introsde.processcentric.resources;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import introsde.storage.ws.Storage;
import introsde.storage.ws.StorageService;
import introsde.processcentric.model.*;

@Stateless // only used if the the application is deployed in a Java EE container
@LocalBean // only used if the the application is deployed in a Java EE container
@Path("/food")
public class FoodResource {

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
    @Produces({ MediaType.APPLICATION_XML })
    @Path("search/{text}")
    public Response searchFood(@PathParam("text") String text) {
        System.out.println("--> Get Food... ");

        initializeStorage();
        
        FoodList foodList = new FoodList();
        foodList.setFoodList(storage.searchFood(text));

        if (foodList.getFoodList() == null) {
        	return Response.noContent().build();
        }

        return Response.ok().entity(foodList).build(); 
    }
	

}
