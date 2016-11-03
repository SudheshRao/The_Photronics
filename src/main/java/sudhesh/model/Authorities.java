package sudhesh.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * Authorities model
 * created by sudhesh rao p 
 */

@Entity
public class Authorities implements Serializable {
	

	private static final long serialVersionUID = -7833758551782008779L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int aid;
	public String username;
	public String authority;
	public int id;
	
	//getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}

}
