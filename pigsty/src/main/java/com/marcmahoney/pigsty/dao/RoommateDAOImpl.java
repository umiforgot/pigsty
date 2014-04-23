/**
 * pigsty
 * RoommateDAOImpl.java
 *
 * 
 *
 * @author Marc Mahoney
 * @version Apr 23, 2014
 */
package com.marcmahoney.pigsty.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import com.marcmahoney.pigsty.model.Roommate;

@Repository
@Configuration
@ComponentScan("com.marcmahoney.pigsty.init")
public class RoommateDAOImpl implements RoommateDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}
	
	public void addRoommate(Roommate roommate) {
		getCurrentSession().save(roommate);
	}

	public void updateRoommate(Roommate roommate) {
		Roommate roommateToUpdate = getRoommate(roommate.getId());
		
		roommateToUpdate.setFirstName(roommate.getFirstName());
		roommateToUpdate.setLastName(roommate.getLastName());
		roommateToUpdate.setHomeId(roommate.getHomeId());
		
		getCurrentSession().update(roommateToUpdate);		
	}

	public Roommate getRoommate(int id) {
		Roommate roommate = (Roommate) getCurrentSession().get(Roommate.class, id);
		return roommate;
	}

	public void deleteRoommate(int id) {
		Roommate roommate = getRoommate(id);
		if (roommate != null) getCurrentSession().delete(roommate);		
	}

	@SuppressWarnings("unchecked")
	public List<Roommate> getRoommates() {
		return getCurrentSession().createQuery("from Roommate").list();

	}

}
