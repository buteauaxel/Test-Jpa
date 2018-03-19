/**
 * 
 */
package banque;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

/**
 * @author Axel B.
 *
 */
@Entity
@Table (name ="client")
public class Client {
	
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
	
	/** prenom : String
	 * 
	 */
	@Column(name="prenom")
	private String prenom;
	
	/** dateNaissance : LocalDate
	 * 
	 */
	@Column(name="dateNaissance")
	private LocalDate dateNaissance;
	
	@Embedded
	private Adresse adresse;
	
	@ManyToMany
	@JoinTable(name="JOIN_CLIENT_COMPTE",
	joinColumns=@JoinColumn(name="ID_CLI", referencedColumnName="id"),
	inverseJoinColumns=@JoinColumn(name="ID_CPT", referencedColumnName="id"))
	private Set<Compte> Compte = new HashSet<>();
	
	@ManyToOne
	@JoinColumn(name="ID_BQ")
	private  Banque banque;
	
	public Client(){
		
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

	/**
	 * @return the dateNaissance
	 */
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	/**
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}



	/**
	 * @return the compte
	 */
	public Set<Compte> getCompte() {
		return Compte;
	}

	/**
	 * @param compte the compte to set
	 */
	public void setCompte(Set<Compte> compte) {
		Compte = compte;
	}

	/**
	 * @return the banque
	 */
	public Banque getBanque() {
		return banque;
	}

	/**
	 * @param banque the banque to set
	 */
	public void setBanque(Banque banque) {
		this.banque = banque;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance
				+ ", adresse=" + adresse + ",Compte=" + Compte + ", banque=" + banque
				+ "]";
	} 

	
}
