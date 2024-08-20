package oneToManys;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HosptialRoom {
	@Id
	private int hosptialId;
	private String hosptialName;
	private String doctorName;
	public int getHosptialId() {
		return hosptialId;
	}

	public void setHosptialId(int hosptialId) {
		this.hosptialId = hosptialId;
	}

	public String getHosptialName() {
		return hosptialName;
	}

	public void setHosptialName(String hosptialName) {
		this.hosptialName = hosptialName;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	

}
