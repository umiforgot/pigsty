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
import com.marcmahoney.pigsty.model.Roommate;

public interface HomeDAO {
	
	public void addHome(Home home);
	public void updateHome(Home home);
	public Home getHome(int id);
	public void deleteHome(int id);
	public List<Home> getHomes();
	public List<Roommate> getRoommates(String address);
}
