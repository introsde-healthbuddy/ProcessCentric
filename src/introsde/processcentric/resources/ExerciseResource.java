package introsde.processcentric.resources;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
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

import introsde.processcentric.model.ExerciseList;
import introsde.business.ws.Business;
import introsde.business.ws.BusinessService;

@Stateless // only used if the the application is deployed in a Java EE container
@LocalBean // only used if the the application is deployed in a Java EE container
@Path("/exercises")
public class ExerciseResource {

    @Context
    UriInfo uriInfo;
    @Context
    Request request;
    
	BusinessService bService;
	Business business;
	

	public void initializeStorage(){
		bService = new BusinessService();
		business = bService.getBusinessImplPort();
	}
	
	@GET
	@Produces({ MediaType.APPLICATION_XML})
	public Response readExercises() {
		System.out.println("--> Reading Exercises");
		
		initializeStorage();
		
		 ExerciseList exerciseList = new ExerciseList();
		 exerciseList.setExerciseList(business.getExercises());

	        if (exerciseList.getExerciseList() == null) {
	        	return Response.noContent().build();
	        }

	        return Response.ok().entity(exerciseList).build(); 
		
			}
	
}
