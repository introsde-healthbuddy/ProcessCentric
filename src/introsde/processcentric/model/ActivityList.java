package introsde.processcentric.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import introsde.localdatabase.soap.Activity;

@XmlRootElement(name = "activities")
public class ActivityList {

	private List<Activity> activityList;
	
	public ActivityList() {
	}

	@XmlElement(name = "activity")
	public List<Activity> getActivityList() {
		return activityList;
	}

	public void setActivityList(List<Activity> activityList) {
		this.activityList = activityList;
	}
	
	
}