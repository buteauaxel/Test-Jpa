package banque;
import java.time.LocalDate;

import javax.persistence.*;

/**
 * @author Axel B.
 *
 */
@Entity
@Table(name="assuranceVie")
public class AssuranceVie extends Compte{
	
	
	/** dateFin : LocalDate
	 * 
	 */
	@Column(name="dateFin")
	private LocalDate dateFin;
	/** taux : Double
	 * 
	 */
	@Column(name="taux")
	private Double taux;
	
	public AssuranceVie(){
		
	}


	/**
	 * @return the dateFin
	 */
	public LocalDate getDateFin() {
		return dateFin;
	}

	/**
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	/**
	 * @return the taux
	 */
	public Double getTaux() {
		return taux;
	}

	/**
	 * @param taux the taux to set
	 */
	public void setTaux(Double taux) {
		this.taux = taux;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AssuranceVie [ dateFin=" + dateFin + ", taux=" + taux + "]";
	}


	
}
