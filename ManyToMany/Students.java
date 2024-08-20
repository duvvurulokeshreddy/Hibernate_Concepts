package ManyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Students {
	@Id
	private int studentId;
	private String studentName;
	private int marks;
	private String address;
	@ManyToMany
	private List<Colleges> clist=new ArrayList<Colleges>();
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Colleges> getClist() {
		return clist;
	}
	public void setClist(List<Colleges> clist) {
		this.clist = clist;
	}
	
}
