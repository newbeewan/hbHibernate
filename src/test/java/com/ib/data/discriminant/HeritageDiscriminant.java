package com.ib.data.discriminant;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Transaction;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ib.util.HibernateUtil;

public class HeritageDiscriminant {
	private final Logger logger = LoggerFactory.getLogger(HeritageDiscriminant.class);

	@Test
	public void test() {
		Transaction transaction = HibernateUtil.beginTransaction();
		Personne personne = new Personne();
		personne.setNom("Doe");
		personne.setPrenom("John");
		
		Coach coach = new Coach();
		coach.setNom("Coach Nom");
		coach.setPrenom("Coach Prenom");
		coach.setTeam("The Team");
		
		Player player = new Player();
		player.setNom("player Nom");
		player.setPrenom("player Prenom");
		player.setScore(100);
		player.setPoids(70);
		
		HibernateUtil.getCurrentSession().save(personne);
		HibernateUtil.getCurrentSession().save(coach);
		HibernateUtil.getCurrentSession().save(player);
		
		transaction.commit();
		
		List<Personne> personnes = HibernateUtil.getCurrentSession().createQuery("From Personne", Personne.class).getResultList();
		personnes.forEach(p -> {
			logger.info("Personne type : {}", p.getClass().getName());
		});
		
	}

}
