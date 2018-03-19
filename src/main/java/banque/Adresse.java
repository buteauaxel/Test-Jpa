/**
 * 
 */
package banque;

import javax.persistence.*;

/**
 * @author Axel B.
 *
 */
@Embeddable
public class Adresse {


	/** numero : Integer
	 * 
	 */
	@Column(name="numero")
	private Integer numero;
	/** rue : String
	 * 
	 */
	@Column(name="rue")
	private String rue;
	/** codePostal : Integer
	 * 
	 */
	@Column(name="codePostal")
	private Integer codePostal;
	/** ville : String
	 * 
	 */
	@Column(name="ville")
	private String ville;
	
	public Adresse(){
		
	}


	/**
	 * @return the numero
	 */
	public Integer getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	/**
	 * @return the rue
	 */
	public String getRue() {
		return rue;
	}

	/**
	 * @param rue the rue to set
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}

	/**
	 * @return the codePostal
	 */
	public Integer getCodePostal() {
		return codePostal;
	}

	/**
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(Integer codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Adresse [  numero=" + numero + ", rue=" + rue + ", codePostal=" + codePostal + ", ville="
				+ ville + "]";
	}
	
	
}
