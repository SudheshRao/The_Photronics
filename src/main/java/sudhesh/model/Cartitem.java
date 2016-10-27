package sudhesh.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Cartitem {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int ciid;
	public int quantity;
	public long total;
	public int cid;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	@ManyToOne
	@JoinColumn(name="cartid")
	@JsonIgnore
	private Cart cart;
	@ManyToOne
	@JoinColumn(name="pid")
	private Product product;
	
	//getters and setters
	public int getCiid() {
		return ciid;
	}
	public void setCiid(int ciid) {
		this.ciid = ciid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
}
