package sudhesh.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int aid;
	private String address;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	CustomerSignup cs;
	
	//getters and setters
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public CustomerSignup getCs() {
		return cs;
	}
	public void setCs(CustomerSignup cs) {
		this.cs = cs;
	}
}
