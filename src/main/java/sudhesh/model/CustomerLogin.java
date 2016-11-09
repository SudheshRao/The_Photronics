package sudhesh.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*
 * Customer login model
 * created by sudhesh rao p 
 */

@Entity
@Table(name="customerlogin")
public class CustomerLogin implements Serializable {

	private static final long serialVersionUID = -3212693696567628355L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cid;	
	private String username;
	private String password;
	private boolean enabled;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private CustomerSignup cs;
	
	//getters and setters
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public CustomerSignup getCs() {
		return cs;
	}
	public void setCs(CustomerSignup cs) {
		this.cs = cs;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
