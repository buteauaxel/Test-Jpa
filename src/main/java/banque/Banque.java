/**
 * 
 */
package banque;

import java.util.Set;

import javax.persistence.*;

/**
 * @author Axel B.
 *
 */
@Entity
@Table (name ="banque")
public class Banque {
	
	/** id : Integer
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	/** nom : String
	 * 
	 */
	@Column(name="nom")
	private String nom;
	
	@OneToMany(mappedBy="banque")
	private Set<Client> client;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the client
	 */
	public Set<Client> getClient() {
		return client;
	}

	/**
	 * @param client the client to set
	 */
	public void setClient(Set<Client> client) {
		this.client = client;
	}


	@Override
	public String toString() {
		return "Banque [id=" + id + ", nom=" + nom + ", client=" + client + "]";
	}

}
