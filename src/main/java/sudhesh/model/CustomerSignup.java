package sudhesh.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/*
 * Customer Signup model
 * created by sudhesh rao p 
 */

@Entity
@Table(name="customer")
public class CustomerSignup {
	
	@Id
    @GenericGenerator(name = "customer", strategy = "enhanced-table", 
    				  parameters = {@org.hibernate.annotations.Parameter(name = "customer", value = "hibernate_sequences")})
    @GeneratedValue(generator = "customer", strategy=GenerationType.TABLE)
	public int id;
	@NotEmpty
	String username;
	@NotEmpty @Email
	public String email;
	@NotEmpty
	public String password;
	@NotEmpty
	public String confirmpassword;
	@NotEmpty
	public String address;
	@NotNull
	private long phno;
	
	//getters and setters
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
