package FirstLevelCachingMach;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mobile {
	@Id
	private int mobileSerialNumber;
	private String mobileName;
	private int mobilePrice;
	private String purpchase;
	public int getMobileSerialNumber() {
		return mobileSerialNumber;
	}
	public void setMobileSerialNumber(int mobileSerialNumber) {
		this.mobileSerialNumber = mobileSerialNumber;
	}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public double getMobilePrice() {
		return mobilePrice;
	}
	public void setMobilePrice(int mobilePrice) {
		this.mobilePrice = mobilePrice;
	}
	public String getPurpchase() {
		return purpchase;
	}
	public void setPurpchase(String purpchase) {
		this.purpchase = purpchase;
	}
	@Override
	public String toString() {
		return "Mobile [mobileSerialNumber=" + mobileSerialNumber + ", mobileName=" + mobileName + ", mobilePrice="
				+ mobilePrice + ", purpchase=" + purpchase + "]";
	}
	
	

}
