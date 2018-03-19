/**
 * 
 */
package banque;

import javax.persistence.*;

/**
 * @author Axel B.
 *
 */
@Entity
@Table(name="virement")
public class Virement extends Operation{
	
	/** beneficiaire : String
	 * 
	 */
	@Column(name="beneficiaire")
	private String beneficiaire;
	
	
	public Virement(){
		
	}

	/**
	 * @return the beneficiaire
	 */
	public String getBeneficiaire() {
		return beneficiaire;
	}

	/**
	 * @param beneficiaire the beneficiaire to set
	 */
	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}


	@Override
	public String toString() {
		return "Virement [beneficiaire=" + beneficiaire + "]";
	}
	
	

}
