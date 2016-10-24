package sudhesh.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cartitem {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int ciid;
	public int quantity;
	public long total;
	
}
