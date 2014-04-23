/**
 * pigsty
 * RoommateDAO.java
 *
 * 
 *
 * @author Marc Mahoney
 * @version Apr 23, 2014
 */
package com.marcmahoney.pigsty.dao;

import java.util.List;

import com.marcmahoney.pigsty.model.Roommate;

public interface RoommateDAO {
	
	public void addRoommate(Roommate roommate);
	public void updateRoommate(Roommate roommate);
	public Roommate getRoommate(int id);
	public void deleteRoommate(int id);
	public List<Roommate> getRoommates();
}
