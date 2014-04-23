/**
 * pigsty
 * HomeDAOImpl.java
 *
 * 
 *
 * @author Marc Mahoney
 * @version Mar 17, 2014
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

import com.marcmahoney.pigsty.model.Home;
import com.marcmahoney.pigsty.model.Roommate;

@Repository
@Configuration
@ComponentScan("com.marcmahoney.pigsty.init")
public class HomeDAOImpl implements HomeDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void addHome(Home home) {
		getCurrentSession().save(home);
	}

	public void updateHome(Home home) {
		Home homeToUpdate = getHome(home.getId());
		homeToUpdate.setAddress(home.getAddress());
		getCurrentSession().update(homeToUpdate);
		
	}

	public Home getHome(int id) {
		Home home = (Home) getCurrentSession().get(Home.class, id);
		return home;
	}

	public void deleteHome(int id) {
		Home home = getHome(id);
		if (home != null) getCurrentSession().delete(home);
	}

	@SuppressWarnings("unchecked")
	public List<Home> getHomes() {
		return getCurrentSession().createQuery("from Home").list();
	}

	@SuppressWarnings("unchecked")
	public List<Roommate> getRoommates(String address) {
		Query query = getCurrentSession().createQuery("from Roommate where homeAddress = :address");
		query.setParameter("address", address);
		return query.list();
		
	}
}
