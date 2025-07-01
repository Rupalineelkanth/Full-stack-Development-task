package managment.entity;

import java.io.Serializable;
import jakarta.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the clients database table.
 * 
 */
@Entity
@Table(name="clients")
@NamedQuery(name="Client.findAll", query="SELECT c FROM Client c")
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Lob
	private String description;

	private String designation;

	@Lob
	@Column(name="image_url")
	private String imageUrl;

	private String name;

	

}