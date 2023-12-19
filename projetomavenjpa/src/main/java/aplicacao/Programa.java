package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(null, "Adrian Gabriel", "adriang.oliveira@unifacol.edu.br");
		Pessoa p2 = new Pessoa(null, "Daniel Silva", "danielf.silva@unifacol.edu.br");
		Pessoa p3 = new Pessoa(null, "David Nilton", "davidn.lima@unifacol.edu.br");
		Pessoa p4 = new Pessoa(null, "João Victor", "joaovn.santos@unifacol.edu.br");
		Pessoa p5 = new Pessoa(null, "Ricardo Correia", "ricardo.correia@unifacol.edu.br");
	

		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(p4);
		em.persist(p5);
		em.getTransaction().commit();
		
		System.out.println("Pronto!");
		em.close();
		emf.close();
	}
}
