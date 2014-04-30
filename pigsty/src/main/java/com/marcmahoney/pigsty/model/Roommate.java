/**
 * pigsty
 * Roommate.java
 *
 * 
 *
 * @author Marc Mahoney
 * @version Apr 23, 2014
 */
package com.marcmahoney.pigsty.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roommates")
public class Roommate implements Serializable{

	
	private static final long serialVersionUID = 5058971458490407739L;

	@Id
	@GeneratedValue
	private int id, homeId;
	
	private String lastName, firstName;
	
	public int getId(){
		return id;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setLastName(String last){
		lastName = last;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public void setFirstName(String first){
		firstName = first;
	}
	
	public int getHomeId(){
		return homeId;
	}
	
	public void setHomeId(int newId){
		homeId = newId;
	}
}
