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

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import com.marcmahoney.pigsty.model.Home;

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
		Home homeToUpdate = getHome(home.getAddress());
		getCurrentSession().update(homeToUpdate);
		
	}

	public Home getHome(String address) {
		Home home = (Home) getCurrentSession().get(Home.class, address);
		return home;
	}

	public void deleteHome(String address) {
		Home home = getHome(address);
		if (home != null)
				getCurrentSession().delete(home);
	}

	@SuppressWarnings("unchecked")
	public List<Home> getHomes() {
		return getCurrentSession().createQuery("from Home").list();
	}
}
