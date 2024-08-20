package oneToOnes;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Person {
	@Id
	private int personId;
	private String personName;
	private long personMobileNumber;
	private String address;
	
	@OneToOne
	private PanCardVerfication pan;
	
	public PanCardVerfication getPan() {
		return pan;
	}
	public void setPan(PanCardVerfication pan) {
		this.pan = pan;
	}
	public void setPersonId(int personId) {
		this.personId=personId;
	}
	public int getPersonId() {
		return personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public long getPersonMobileNumber() {
		return personMobileNumber;
	}
	public void setPersonMobileNumber(long personMobileNumber) {
		this.personMobileNumber = personMobileNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personMobileNumber="
				+ personMobileNumber + ", address=" + address + ", pan=" + pan + "]";
	}
	
	

}
