package model;

import java.util.Set;

import javax.persistence.*;

/**
 * 
 */

/**
 * @author Axel B.
 *
 */
@Entity
@Table(name = "livre")
public class Livre {

	/** id : Integer
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	/** titre : String
	 * 
	 */
	@Column(name="titre")
	private String titre;
	
	/** auteur : String
	 * 
	 */
	@Column(name="auteur")
	private String auteur;
	
	@ManyToMany(mappedBy="livre")
	private Set<Emprunt> emprunt; 

	// Constructeurs
	public Livre() {

	}

	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
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
	 * @param titre
	 *            the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/**
	 * @return the auteur
	 */
	public String getAuteur() {
		return auteur;
	}

	/**
	 * @param auteur
	 *            the auteur to set
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * ToString
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Livre [id= " + id + ", titre= " + titre + ", auteur= " + auteur + "]";
	}

}
