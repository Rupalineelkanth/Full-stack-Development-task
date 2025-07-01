package managment.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the contact_forms database table.
 * 
 */
@Entity
@Table(name="contact_forms")
@NamedQuery(name="ContactForm.findAll", query="SELECT c FROM ContactForm c")
public class ContactForm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String city;

	@Column(name="created_at")
	private Timestamp createdAt;

	private String email;

	@Column(name="full_name")
	private String fullName;

	private String mobile;

	public ContactForm() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}