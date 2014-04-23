/**
 * pigsty
 * HomeService.java
 *
 * 
 *
 * @author Marc Mahoney
 * @version Mar 17, 2014
 */
package com.marcmahoney.pigsty.service;

import java.util.List;

import com.marcmahoney.pigsty.model.Home;

public interface HomeService {
	
	public void addHome(Home home);
	public void updateHome(Home home);
	public Home getHome(int id);
	public void deleteHome(int id);
	public List<Home> getHomes();
}
