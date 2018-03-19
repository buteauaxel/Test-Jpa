package banque;

import javax.persistence.*;

/**
 * @author Axel B.
 *
 */
@Entity
@Table(name="livretA")
public class LivretA extends Compte{
	
	/** taux : Double
	 * 
	 */
	@Column(name="taux")
	private Double taux;
	
	public LivretA(){
		
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
		return "LivretA [ taux=" + taux + "]";
	}

	
	

}
