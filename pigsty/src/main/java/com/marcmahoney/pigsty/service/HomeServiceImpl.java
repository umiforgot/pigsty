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
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcmahoney.pigsty.dao.HomeDAO;
import com.marcmahoney.pigsty.model.Home;
import com.marcmahoney.pigsty.model.Roommate;

@Service
@Transactional
@Configuration
@ComponentScan("com.marcmahoney.pigsty.dao")
public class HomeServiceImpl implements HomeService{

	@Autowired
	HomeDAO homeDAO;

	public void addHome(Home home) {
		homeDAO.addHome(home);
	}

	public void updateHome(Home home) {
		homeDAO.updateHome(home);
	}

	public Home getHome(int id) {
		return homeDAO.getHome(id);
	}

	public void deleteHome(int id) {
		homeDAO.deleteHome(id);
	}

	public List<Home> getHomes() {
		return homeDAO.getHomes();
	}
	
	public List<Roommate> getRoommates(String address){
		return homeDAO.getRoommates(address);
	}
}
