package ManyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Colleges {
	@Id
	private int collegeId;
	private String collegeName;
	private int highestMarks;
	@ManyToMany
	private List<Students> dlist=new ArrayList<Students>();
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getHighestMarks() {
		return highestMarks;
	}
	public void setHighestMarks(int highestMarks) {
		this.highestMarks = highestMarks;
	}
	public List<Students> getDlist() {
		return dlist;
	}
	public void setDlist(List<Students> dlist) {
		this.dlist = dlist;
	}
	
	

}
