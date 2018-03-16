/**
 * 
 */
package model;
import java.util.Set;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author Axel B.
 *
 */
@Entity
@Table(name="emprunt")
public class Emprunt {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	
	@Column(name= "DATE_DEBUT")
	
	private LocalDateTime  dateDebut;
	
	
	@Column(name= "DATE_FIN")
	
	private LocalDateTime  dateFin;
	


	@Column(name= "DELAI")
	
	private Integer  delai;
	
	
	@ManyToMany
	@JoinTable(name="compo", 
	joinColumns=@JoinColumn(name="ID_EMP", referencedColumnName="id"),
	inverseJoinColumns=@JoinColumn(name="ID_LIV", referencedColumnName="id"))
	private Set<Livre> livre;

	
	@ManyToOne
	@JoinColumn(name="ID_CLIENT")
	private Client client; 
	
	
	

	
	
	@Override
	public String toString() {
		return "Emprunt [id=" + id + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", delai=" + delai
				+ ", client=" + client + "]";
	}

	/**
	 * @return the livre
	 */
	public Set<Livre> getLivre() {
		return livre;
	}

	/**
	 * @param livre the livre to set
	 */
	public void setLivre(Set<Livre> livre) {
		this.livre = livre;
	}

	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	public Emprunt(){
		
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
	 * @return the dateDebut
	 */
	public LocalDateTime getDateDebut() {
		return dateDebut;
	}

	/**
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(LocalDateTime dateDebut) {
		this.dateDebut = dateDebut;
	}

	/**
	 * @return the dateFin
	 */
	public LocalDateTime getDateFin() {
		return dateFin;
	}

	/**
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(LocalDateTime dateFin) {
		this.dateFin = dateFin;
	}

	/**
	 * @return the delai
	 */
	public Integer getDelai() {
		return delai;
	}

	/**
	 * @param delai the delai to set
	 */
	public void setDelai(Integer delai) {
		this.delai = delai;
	}

		
}
