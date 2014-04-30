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
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcmahoney.pigsty.dao.ChoreDAO;
import com.marcmahoney.pigsty.model.Chore;

@Service
@Transactional
@Configuration
@ComponentScan("com.marcmahoney.pigsty.dao")
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
