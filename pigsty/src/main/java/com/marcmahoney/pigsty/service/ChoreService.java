/**
 * pigsty
 * ChoreService.java
 *
 * 
 *
 * @author Marc Mahoney
 * @version Apr 27, 2014
 */
package com.marcmahoney.pigsty.service;

import java.util.List;

import com.marcmahoney.pigsty.model.Chore;

public interface ChoreService {
	
	public void addChore(Chore chore);
	public Chore getChore(int choreId);
	public void deleteChore(int choreId);
	public List<Chore> getChores(int roommateId);
}
