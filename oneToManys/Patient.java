package oneToManys;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Patient {
	@Id
	private int patientAge;
	private String patientName;
	private long patientMobileNumber;
	private String patientAddress;
	@OneToMany
	private List<HosptialRoom> dlist=new ArrayList<HosptialRoom>();
	
	public List<HosptialRoom> getDlist() {
		return dlist;
	}
	public void setDlist(List<HosptialRoom> list) {
		this.dlist = list;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}
	public long getPatientMobileNumber() {
		return patientMobileNumber;
	}
	public void setPatientMobileNumber(long patientMobileNumber) {
		this.patientMobileNumber = patientMobileNumber;
	}
	public String getPatientAddress() {
		return patientAddress;
	}
	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}
	
	
	

}
