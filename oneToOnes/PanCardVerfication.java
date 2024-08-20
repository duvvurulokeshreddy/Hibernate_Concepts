package oneToOnes;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PanCardVerfication {
	@Id
	private int adharCardId;
	private String name;
	private String documents;
	public int getAdharCardId() {
		return adharCardId;
	}
	public void setAdharCardId(int adharCardId) {
		this.adharCardId = adharCardId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDocuments() {
		return documents;
	}
	public void setDocuments(String documents) {
		this.documents = documents;
	}
	@Override
	public String toString() {
		return "PanCardVerfication [adharCardId=" + adharCardId + ", name=" + name + ", documents=" + documents + "]";
	}
	
	

}
