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
import javax.xml.ws.Holder;

import javax.xml.namespace.QName;

import introsde.localdatabase.soap.Measure;
import introsde.processcentric.model.HistoryList;
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
	
	
	public void initializeStorage(){
		sService = new StorageService();
		storage = sService.getStorageImplPort();
	}
	
	
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
        return Response.ok().entity(new JAXBElement<Measure>(
				new QName("measure"), 
			    Measure.class, 
			    holder.value)).build(); 
	
	}
	
	@PUT
	@Consumes({ MediaType.APPLICATION_XML})
	@Path("{personId}")
	public Response updateMeasure(@PathParam("personId") Long personId, Measure measure) {
		System.out.println("--> Updating Measure... ");
		System.out.println("measure " + measure.getMeasureType());

		initializeStorage();
		
		Holder<Measure> holder = new Holder<Measure>(measure);
		
		storage.updatePersonMeasure(personId, holder);
	
		if (holder.value == null) {
        	return Response.serverError().build();
        }
        return Response.ok().entity(new JAXBElement<Measure>(
				new QName("measure"), 
			    Measure.class, 
			    holder.value)).build(); 
	
	}
	
	@GET
	@Produces({ MediaType.APPLICATION_XML})
	@Path("history/{personId}/{mtype}")
	public Response readPersonHistory(@PathParam("personId") Long personId, @PathParam("mtype") String mtype) {
		System.out.println("--> Reading Person History");
		System.out.println("for: "+mtype);
		
		initializeStorage();
		
		HistoryList historyList = new HistoryList();
		historyList.setHistoryList(storage.readPersonHistory(personId, mtype));

		
        if (historyList.getHistoryList() == null) {
        	return Response.noContent().build();
        }

        return Response.ok().entity(historyList).build(); 
	}

}
