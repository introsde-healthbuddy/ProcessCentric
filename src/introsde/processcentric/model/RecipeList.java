package introsde.processcentric.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import introsde.adapter.ws.Recipe;

@XmlRootElement(name = "recipes")
public class RecipeList {

	private List<Recipe> recipeList;
	
	public RecipeList() {
	}

	@XmlElement(name = "recipe")
	public List<Recipe> getRecipeList() {
		return recipeList;
	}

	public void setRecipeList(List<Recipe> recipeList) {
		this.recipeList = recipeList;
	}
	
	
}
