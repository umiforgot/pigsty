/**
 * pigsty
 * ChoreDAO.java
 *
 * 
 *
 * @author Marc Mahoney
 * @version Apr 27, 2014
 */
package com.marcmahoney.pigsty.dao;

import java.util.List;

import com.marcmahoney.pigsty.model.Chore;

public interface ChoreDAO {
	public void addChore(Chore chore);
	public Chore getChore(int choreId);
	public void deleteChore(int choreId);
	public List<Chore> getChores(int roommateId);
}
