package SecondLevelCachingMach;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Institute {
	@Id
	private int instituteId;
	private String instituteName;
	private int noOfRequirements;
	public int getInstituteId() {
		return instituteId;
	}
	public void setInstituteId(int instituteId) {
		this.instituteId = instituteId;
	}
	public String getInstituteName() {
		return instituteName;
	}
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	public int getNoOfRequirements() {
		return noOfRequirements;
	}
	public void setNoOfRequirements(int noOfRequirements) {
		this.noOfRequirements = noOfRequirements;
	}
	@Override
	public String toString() {
		return "Institute [instituteId=" + instituteId + ", instituteName=" + instituteName + ", noOfRequirements="
				+ noOfRequirements + "]";
	}
	
	
	

}
