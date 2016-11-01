package sudhesh.model;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customerorder")
public class Order implements Serializable {
	
    private static final long serialVersionUID = 2983360377227484514L;

	 @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private int customerorderid;

		@OneToOne
	    @JoinColumn(name = "cartid")
	    private Cart cart;

	    @OneToOne
	    @JoinColumn(name = "customerid")
	    private CustomerSignup customer;

	    @OneToOne
	    @JoinColumn(name = "aid")
	    private Address billingAddress;
	    
	    String customername;
	    String deliveryadrress;
	    String manufacturer;
	    int quant;
	    public int getQuant() {
			return quant;
		}

		public void setQuant(int quant) {
			this.quant = quant;
		}

		public String getManufacturer() {
			return manufacturer;
		}

		public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}

		String Model;
	    String Instrument;
	    int pid;
	    

		public String getModel() {
			return Model;
		}

		public void setModel(String model) {
			Model = model;
		}

		public String getInstrument() {
			return Instrument;
		}

		public void setInstrument(String instrument) {
			Instrument = instrument;
		}

		public int getPid() {
			return pid;
		}

		public void setPid(int i) {
			this.pid = i;
		}

		public String getDeliveryadrress() {
			return deliveryadrress;
		}

		public void setDeliveryadrress(String deliveryadrress) {
			this.deliveryadrress = deliveryadrress;
		}

		public int getCustomerorderid() {
			return customerorderid;
		}

		public void setCustomerorderid(int customerorderid) {
			this.customerorderid = customerorderid;
		}

		public String getCustomername() {
			return customername;
		}

		public void setCustomername(String customername) {
			this.customername = customername;
		}

		//getters and setters
	    public int getCustomerOrderId() {
			return customerorderid;
		}

		public void setCustomerOrderId(int customerOrderId) {
			this.customerorderid = customerOrderId;
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
