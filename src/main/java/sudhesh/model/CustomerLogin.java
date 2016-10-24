package sudhesh.model;

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
public class CustomerLogin {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cid;	
	private String username;
	private String password;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private CustomerSignup cs;
	
	//getters and setters
	
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
