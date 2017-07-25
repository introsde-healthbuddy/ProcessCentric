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
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import introsde.adapter.ws.Recipe;
import introsde.business.ws.Business;
import introsde.business.ws.BusinessService;
import introsde.processcentric.model.RecipeList;
import introsde.storage.ws.Storage;
import introsde.storage.ws.StorageService;

@Stateless // only used if the the application is deployed in a Java EE container
@LocalBean // only used if the the application is deployed in a Java EE container
@Path("/recipe")
public class RecipeResource {

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

    
    @GET
    @Produces({ MediaType.APPLICATION_XML })
    @Path("search/{text}")
    public Response searchRecipes(@PathParam("text") String text) {
        System.out.println("--> Get Recipe... ");

        initializeStorage();
        
        RecipeList recipeList = new RecipeList();
        recipeList.setRecipeList(storage.searchRecipes(text));

        if (recipeList.getRecipeList() == null) {
        	return Response.noContent().build();
        }

        return Response.ok().entity(recipeList).build(); 
    }
    
    @GET
    @Produces({ MediaType.APPLICATION_XML })
    @Path("{recipeId}")
    public Response getRecipe(@PathParam("recipeId") Integer recipeId) {
        System.out.println("--> Get Recipe... ");

        initializeStorage();
        
        Recipe recipe = storage.getRecipe(recipeId);

        if (recipe == null) {
        	return Response.noContent().build();
        }

        return Response.ok().entity(new JAXBElement<Recipe>(
				new QName("recipe"), 
			    Recipe.class, 
			    recipe)).build(); 
    }
    
    
    @GET
    @Produces({ MediaType.APPLICATION_XML })
    @Path("{recipeId}/{chatId}")
    public Response getSentenceRecipeCalories(@PathParam("recipeId") Integer recipeId, @PathParam("chatId") Long chatId) {
        System.out.println("--> Get Recipe sentence... ");

        initializeBusiness();
        
        String sentence = business.getSentenceRecipeCalories(chatId, recipeId);

        if (sentence == null) {
        	return Response.noContent().build();
        }

        return Response.ok().entity(sentence).build(); 
    }
}
