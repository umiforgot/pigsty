/**
 * pigsty
 * ChoreDAOImpl.java
 *
 * 
 *
 * @author Marc Mahoney
 * @version Apr 27, 2014
 */
package com.marcmahoney.pigsty.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import com.marcmahoney.pigsty.model.Chore;

@Repository
@Configuration
@ComponentScan("com.marcmahoney.pigsty.init")
public class ChoreDAOImpl implements ChoreDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void addChore(Chore chore) {
		getCurrentSession().save(chore);
	}

	public Chore getChore(int id) {
		Chore chore = (Chore) getCurrentSession().get(Chore.class, id);
		return chore;
	}

	public void deleteChore(int id) {
		Chore chore = getChore(id);
		if (chore != null) getCurrentSession().delete(chore);
	}

	@SuppressWarnings("unchecked")
	public List<Chore> getChores(int roommateId) {
		Query query = getCurrentSession().createQuery("from Chore where idOfRoommateAssigned = :roommateId");
		query.setParameter("roommateId", roommateId);
		return query.list();
	}

}
