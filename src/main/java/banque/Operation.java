/**
 * 
 */
package banque;

import java.time.*;

import javax.persistence.*;

/**
 * @author Axel B.
 *
 */
@Entity
@Table (name ="operation")
@Inheritance(strategy = InheritanceType.JOINED)
public class Operation {
	/** id : Integer
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	/** date : LocalDateTime
	 * 
	 */
	@Column(name="date")
	private LocalDateTime date;
	/** montant : Double
	 * 
	 */
	@Column(name="montant")
	private Double montant;
	/** motif : String
	 * 
	 */
	@Column(name="motif")
	private String motif;
	
	
	public Operation(){
		
	}
	@ManyToOne
	@JoinColumn(name="ID_CPT")
	private Compte compte;


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
	 * @return the date
	 */
	public LocalDateTime getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	/**
	 * @return the montant
	 */
	public Double getMontant() {
		return montant;
	}
	/**
	 * @param montant the montant to set
	 */
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	/**
	 * @return the motif
	 */
	public String getMotif() {
		return motif;
	}
	/**
	 * @param motif the motif to set
	 */
	public void setMotif(String motif) {
		this.motif = motif;
	}
	/**
	 * @return the compte
	 */
	public Compte getCompte() {
		return compte;
	}
	/**
	 * @param compte the compte to set
	 */
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Operation [id=" + id + ", date=" + date + ", montant=" + montant + ", motif=" + motif + ", compte="
				+ compte + "]";
	}
	

	
	
}
