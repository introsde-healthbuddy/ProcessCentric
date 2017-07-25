package introsde.processcentric.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import introsde.adapter.ws.Food;

@XmlRootElement(name = "food")
public class FoodList {

	private List<Food> foodList;
	
	public FoodList() {
	}

	@XmlElement(name = "meal")
	public List<Food> getFoodList() {
		return foodList;
	}

	public void setFoodList(List<Food> foodList) {
		this.foodList = foodList;
	}
	
	
}