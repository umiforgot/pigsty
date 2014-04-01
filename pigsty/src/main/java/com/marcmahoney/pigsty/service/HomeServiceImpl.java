/**
 * pigsty
 * HomeServiceImpl.java
 *
 * 
 *
 * @author Marc Mahoney
 * @version Mar 17, 2014
 */
package com.marcmahoney.pigsty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcmahoney.pigsty.dao.HomeDAO;
import com.marcmahoney.pigsty.model.Home;

@Service
@Transactional
public class HomeServiceImpl implements HomeService{

	@Autowired
	HomeDAO homeDAO;

	public void addHome(Home home) {
		homeDAO.addHome(home);
	}

	public void updateHome(Home home) {
		homeDAO.updateHome(home);
	}

	public Home getHome(String address) {
		return homeDAO.getHome(address);
	}

	public void deleteHome(String address) {
		homeDAO.deleteHome(address);
	}

	public List<Home> getHomes() {
		return homeDAO.getHomes();
	}


	
	
	
}
