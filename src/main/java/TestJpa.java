import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import org.hibernate.mapping.Array;

import banque.*;
/**
 * 
 */

/**
 * @author Axel B.
 *
 */
public class TestJpa {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("banque");
		EntityManager em = entityManagerFactory.createEntityManager();
		
		EntityTransaction et= em.getTransaction();
		et.begin();


		Banque banque = new Banque();
		banque.setNom("MMA");
		em.persist(banque);
		
	
		
		Adresse adresse1 = new Adresse();
		adresse1.setNumero(14);
		adresse1.setCodePostal(44000);
		adresse1.setVille("Nantes");
		adresse1.setRue("Rue du commerce");
		 
		Adresse adresse2 = new Adresse();
		adresse2.setNumero(1);
		adresse2.setCodePostal(75000);
		adresse2.setVille("Paris");
		adresse2.setRue("Rue des Champs Elysées");

		
		
		Client client1 = new Client();
		client1.setNom("Paul");
		client1.setPrenom("Pierre");
		client1.setDateNaissance(LocalDate.of(1990,03,14));
		client1.setBanque(banque);
		client1.setAdresse(adresse1);

		
		
		em.persist(client1);
		
		Client client2 = new Client();
		client2.setNom("Jean");
		client2.setPrenom("Jacques");
		client2.setDateNaissance(LocalDate.of(1975,8,28));
		client2.setBanque(banque);
		client2.setAdresse(adresse2);
		
		em.persist(client2);
		

		
		Compte compte1 = new Compte();
		compte1.setNumero("5555");
		compte1.setSolde(55_000_000.00);
		
		

		em.persist(compte1);
		
		compte1.getListClient().add(client1);

		Compte compte2 = new Compte();
		compte2.setNumero("128");
		compte2.setSolde(5_000.00);

		em.persist(compte2);
		
		compte2.getListClient().add(client2);

		
		
		Operation operation = new Operation();
		operation.setCompte(compte1);
		operation.setDate(LocalDateTime.of(2018,03,18, 12,48));
		operation.setMotif("Remboursement");
		operation.setMontant(12_500.00);
		em.persist(operation);
		
		
		LivretA livretA = new LivretA();
		livretA.getListClient().add(client1);
		livretA.setNumero("1234");
		livretA.setTaux(00.75);
		livretA.setSolde(5000.00);
		

		em.persist(livretA);	
		
		
		AssuranceVie assVie = new AssuranceVie();
		assVie.setNumero("4321");
		assVie.setSolde(138.00);
		assVie.getListClient().add(client2);
		assVie.setTaux(0.13);
		assVie.setDateFin(LocalDate.of(2070, 03, 14));
		
	
		em.persist(assVie);
		
		
		Virement vm = new Virement();
		vm.setBeneficiaire("Pierre");
		em.persist(vm);

		
		et.commit();
		
		em.close();
		entityManagerFactory.close();
	}
}
