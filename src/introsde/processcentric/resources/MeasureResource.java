package introsde.processcentric.resources;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.xml.ws.Holder;

//import introsde.business.ws.Business;
//import introsde.business.ws.BusinessService;
import introsde.localdatabase.soap.Measure;
import introsde.localdatabase.soap.Person;
import introsde.storage.ws.Storage;
import introsde.storage.ws.StorageService;

@Stateless // only used if the the application is deployed in a Java EE container
@LocalBean // only used if the the application is deployed in a Java EE container
@Path("/measure")
public class MeasureResource {

    @Context
    UriInfo uriInfo;
    @Context
    Request request;
    
	StorageService sService;
	Storage storage;
//	BusinessService bService;
//	Business business;
	
	
	public void initializeStorage(){
		sService = new StorageService();
		storage = sService.getStorageImplPort();
	}
	
//	public void initializeBusiness(){
//		bService = new BusinessService();
//		business = bService.getBusinessImplPort();
//	}
	
	@POST
	@Consumes({ MediaType.APPLICATION_XML })
    @Path("{personId}")
	public Response createMeasure(@PathParam("personId") Long personId, Measure measure) {
		System.out.println("--> Creating Measure... ");
		System.out.println("measure " + measure.getMeasureType());

		initializeStorage();
		
		Holder<Measure> holder = new Holder<Measure>(measure);
		
		storage.savePersonMeasure(personId, holder);
	
		if (holder.value == null) {
        	return Response.serverError().build();
        }
        return Response.ok(measure.getMeasureType() + " is updated to " + measure.getMeasureValue()).build(); 
	
	}
	

}
