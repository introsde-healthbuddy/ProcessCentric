package introsde.processcentric.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import introsde.localdatabase.soap.Goal;

@XmlRootElement(name = "goals")
public class GoalList {

	private List<Goal> goalList;
	
	public GoalList() {
	}

	@XmlElement(name = "goal")
	public List<Goal> getGoalList() {
		return goalList;
	}

	public void setGoalList(List<Goal> goalList) {
		this.goalList = goalList;
	}
	
	
}