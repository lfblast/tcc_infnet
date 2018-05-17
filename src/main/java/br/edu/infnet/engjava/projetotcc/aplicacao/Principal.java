package br.edu.infnet.engjava.projetotcc.aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Principal {

	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sistema-de-avaliacao");
		EntityManager em = emf.createEntityManager();

		em.close();
		emf.close();

	}

}
