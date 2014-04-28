/**
 * pigsty
 * ChoreServiceImpl.java
 *
 * 
 *
 * @author Marc Mahoney
 * @version Apr 27, 2014
 */
package com.marcmahoney.pigsty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.marcmahoney.pigsty.dao.ChoreDAO;
import com.marcmahoney.pigsty.model.Chore;

public class ChoreServiceImpl implements ChoreService {

	@Autowired
	ChoreDAO choreDAO;
	
	public void addChore(Chore chore) {
		choreDAO.addChore(chore);
	}

	public Chore getChore(int choreId) {
		return choreDAO.getChore(choreId);
	}

	public void deleteChore(int choreId) {
		choreDAO.deleteChore(choreId);
	}

	public List<Chore> getChores(int roommateId) {
		return choreDAO.getChores(roommateId);
	}

}
