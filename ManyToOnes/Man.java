package ManyToOnes;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Man {
	@Id
	private int manId;
	private String manName;
	private int manAge;
	@ManyToOne
	private Car car;
	public int getManId() {
		return manId;
	}
	public void setManId(int manId) {
		this.manId = manId;
	}
	public String getManName() {
		return manName;
	}
	public void setManName(String manName) {
		this.manName = manName;
	}
	public int getManAge() {
		return manAge;
	}
	public void setManAge(int manAge) {
		this.manAge = manAge;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	@Override
	public String toString() {
		return "Man [manId=" + manId + ", manName=" + manName + ", manAge=" + manAge + ", car=" + car + "]";
	}
	
	
	
	
}
