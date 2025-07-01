package managment.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the newsletter_subscribers database table.
 * 
 */
@Entity
@Table(name="newsletter_subscribers")
@NamedQuery(name="NewsletterSubscriber.findAll", query="SELECT n FROM NewsletterSubscriber n")
public class NewsletterSubscriber implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="created_at")
	private Timestamp createdAt;

	private String email;

	public NewsletterSubscriber() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

}