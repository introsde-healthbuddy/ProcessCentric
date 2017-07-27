package introsde.processcentric.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import introsde.localdatabase.soap.Measure;

@XmlRootElement(name = "history")
public class HistoryList {

	private List<Measure> historyList;
	
	public HistoryList() {
	}

	@XmlElement(name = "measure")
	public List<Measure> getHistoryList() {
		return historyList;
	}

	public void setHistoryList(List<Measure> historyList) {
		this.historyList = historyList;
	}
	
}