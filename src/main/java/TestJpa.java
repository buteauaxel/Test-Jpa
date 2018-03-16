import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.hibernate.mapping.Array;

import model.Client;
import model.Emprunt;
import model.Livre;

/**
 * 
 */

/**
 * @author Axel B.
 *
 */
public class TestJpa {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager em = entityManagerFactory.createEntityManager();

		// TypedQuery<Livre> query= em.createQuery("FROM Livre where id=2",
		// Livre.class);
		// Livre livre2 = query.getResultList().get(0);
		// System.out.println("Auteur = "+livre2.getAuteur() +"; Titre = " +
		// livre2.getTitre());
		//
		//
		// Livre livre = em.find(Livre.class, 1);
		// System.out.println(livre.getId() + " " + livre.getAuteur() );

//		TypedQuery<Livre> query = em.createQuery("select l from Livre l where l.titre = :titre", Livre.class);
//		query.setParameter("titre", "Germinal");
//		Livre livree = query.getResultList().get(0);
//		System.out.println(livree);
		
//		TypedQuery<Emprunt> query = em.createQuery("from Emprunt e where e.id = :id ", Emprunt.class);
//		query.setParameter("id", 1);
//		Emprunt emprunt = query.getSingleResult();
//		for(Livre l : emprunt.getLivre()){
//			System.out.println(l);
//			
//		}
				
		TypedQuery<Client> cliQuery = em.createQuery("from Client c where c.id = :id ", Client.class);
		cliQuery.setParameter("id", 1);
		Client client = cliQuery.getSingleResult();
		
		List<Emprunt> listEmprunt = new ArrayList<Emprunt>();
		
		TypedQuery<Emprunt> emQuery = em.createQuery("from Emprunt e where e.client.id = :id", Emprunt.class );
		emQuery.setParameter("id", client.getId());
		listEmprunt = emQuery.getResultList();
		for(Emprunt e : listEmprunt){
			System.out.println(e);
			
		}
		
		
	

		em.close();
		entityManagerFactory.close();
	}
}
