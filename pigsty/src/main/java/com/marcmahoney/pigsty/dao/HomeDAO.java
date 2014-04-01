/**
 * pigsty
 * HomeDAO.java
 *
 * 
 *
 * @author Marc Mahoney
 * @version Mar 17, 2014
 */
package com.marcmahoney.pigsty.dao;

import java.util.List;

import com.marcmahoney.pigsty.model.Home;

public interface HomeDAO {
	
	public void addHome(Home home);
	public void updateHome(Home home);
	public Home getHome(String address);
	public void deleteHome(String address);
	public List<Home> getHomes();
}
