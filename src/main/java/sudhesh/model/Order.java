package sudhesh.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Order {
	
	 @Id
	    @GeneratedValue
	    private int customerOrderId;

		@OneToOne
	    @JoinColumn(name = "cartId")
	    private Cart cart;

	    @OneToOne
	    @JoinColumn(name = "customerId")
	    private CustomerSignup customer;

	    @OneToOne
	    @JoinColumn(name = "aid")
	    private Address billingAddress;

	    //getters and setters
	    public int getCustomerOrderId() {
			return customerOrderId;
		}

		public void setCustomerOrderId(int customerOrderId) {
			this.customerOrderId = customerOrderId;
		}

		public Cart getCart() {
			return cart;
		}

		public void setCart(Cart cart) {
			this.cart = cart;
		}

		public CustomerSignup getCustomer() {
			return customer;
		}

		public void setCustomer(CustomerSignup customer) {
			this.customer = customer;
		}

		public Address getBillingAddress() {
			return billingAddress;
		}

		public void setBillingAddress(Address billingAddress) {
			this.billingAddress = billingAddress;
		}

	    
}
