/**
 * 
 */
package banque;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


/**
 * @author Axel B.
 *
 */
@Entity
@Table (name ="compte")
@Inheritance(strategy = InheritanceType.JOINED)
public class Compte {

	/** id : Integer
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	/** numero : String
	 * 
	 */
	@Column(name="numero")
	private String numero;
	/** solde : Double
	 * 
	 */
	@Column(name="solde")
	private Double solde; 
	
	public Compte(){
		
	}
	
	@OneToMany(mappedBy="compte")
	private Set<Operation> operation = new HashSet<Operation>();
	
	@ManyToMany
	@JoinTable(name="JOIN_CLIENT_COMPTE",
	joinColumns=@JoinColumn(name="ID_CPT", referencedColumnName="id"),
	inverseJoinColumns=@JoinColumn(name="ID_CLI", referencedColumnName="id"))
	private Set<Client> listClient = new HashSet<>();

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
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @return the solde
	 */
	public Double getSolde() {
		return solde;
	}

	/**
	 * @param solde the solde to set
	 */
	public void setSolde(Double solde) {
		this.solde = solde;
	}

	/**
	 * @return the operation
	 */
	public Set<Operation> getOperation() {
		return operation;
	}

	/**
	 * @param operation the operation to set
	 */
	public void setOperation(Set<Operation> operation) {
		this.operation = operation;
	}

	/**
	 * @return the listClient
	 */
	public Set<Client> getListClient() {
		return listClient;
	}

	/**
	 * @param listClient the listClient to set
	 */
	public void setListClient(Set<Client> listClient) {
		this.listClient = listClient;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Compte [id=" + id + ", numero=" + numero + ", solde=" + solde + ", operation=" + operation
				+ ", listClient=" + listClient + "]";
	}
	
	
}
