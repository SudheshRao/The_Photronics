package sudhesh.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;



import com.fasterxml.jackson.annotation.JsonIgnore;

/*
 * Cart model
 * created by sudhesh rao p 
 */

@Entity
public class Cart {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int cartid;
	public int grandtotal;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "id")
	@JsonIgnore
	private CustomerSignup customer;
	
	//getters and setters
	public int getCartid() {
		return cartid;
	}
	public int getGrandtotal() {
		return grandtotal;
	}
	public void setGrandtotal(int grandtotal) {
		this.grandtotal = grandtotal;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	public CustomerSignup getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerSignup customer) {
		this.customer = customer;
	}
	

		 
}
