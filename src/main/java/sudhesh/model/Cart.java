package sudhesh.model;


import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

/*
 * Cart model
 * created by sudhesh rao p 
 */

@Entity
public class Cart implements Serializable {
    private static final long serialVersionUID = 3940548625296145582L;

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int cartid;
	public double grandtotal;
	@OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Cartitem> cartItems;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "id")
	@JsonIgnore
	private CustomerSignup customer;
	
	//getters and setters
	public List<Cartitem> getCartItems() {
		return cartItems;
	}
	public void setCartItems(List<Cartitem> cartItems) {
		this.cartItems = cartItems;
	}
	public int getCartid() {
		return cartid;
	}
	public double getGrandtotal() {
		return grandtotal;
	}
	public void setGrandtotal(double grandTotal2) {
		this.grandtotal = grandTotal2;
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
