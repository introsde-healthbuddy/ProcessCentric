package introsde.processcentric.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import introsde.adapter.ws.Exercise;

@XmlRootElement(name = "exercises")
public class ExerciseList {

	private List<Exercise> exerciseList;
	
	public ExerciseList() {
	}

	@XmlElement(name = "exercise")
	public List<Exercise> getExerciseList() {
		return exerciseList;
	}

	public void setExerciseList(List<Exercise> exerciseList) {
		this.exerciseList = exerciseList;
	}
	
	
}