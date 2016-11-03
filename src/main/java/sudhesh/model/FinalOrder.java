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
@Table(name="finalorder")
public class FinalOrder implements Serializable {

	private static final long serialVersionUID = 8110528930515471569L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	    private int customerorderid;


	    
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

	



}
