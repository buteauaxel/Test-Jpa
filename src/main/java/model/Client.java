/**
 * 
 */
package model;
import java.util.Set;

import javax.persistence.*;


/**
 * @author Axel B.
 *
 */
@Entity
@Table(name="client")
public class Client {
	
	@Id
	private Integer id;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="prenom")
	private String prenom;
	
	@OneToMany(mappedBy="client")
	private Set<Emprunt> emprunt;
	

	
	
	public Client(){
	}


	
	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}




	/**
	 * @return the emprunt
	 */
	public Set<Emprunt> getEmprunt() {
		return emprunt;
	}



	/**
	 * @param emprunt the emprunt to set
	 */
	public void setEmprunt(Set<Emprunt> emprunt) {
		this.emprunt = emprunt;
	}



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
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}



	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	

}
