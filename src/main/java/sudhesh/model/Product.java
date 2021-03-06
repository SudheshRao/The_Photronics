package sudhesh.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

/*
 * Product model
 * created by sudhesh rao p 
 */

@Entity
@Table (name="product")
public class Product implements Serializable{
	
    private static final long serialVersionUID = -3532377236419382983L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int id;
	public String instrument;
	public String company;
	public String model;
	public String Spec;
	public int cost;
	public int stock;
	@Transient
	private MultipartFile productpicture;
	
	//getters and setters 
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getInstrument() {
		return instrument;
	}
	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getSpec() {
		return Spec;
	}
	public void setSpec(String spec) {
		Spec = spec;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public MultipartFile getproductpicture() {
		return productpicture;
	}
	public void setproductpicture(MultipartFile productpicture) {
		this.productpicture = productpicture;
	}

	

}
