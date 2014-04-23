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

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roommates")
public class Roommate {

	@Id
	@GeneratedValue
	private int id;
	
	private String lastName, firstName, homeAddress;
	
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
	
	public String getHomeAddress(){
		return homeAddress;
	}
	
	public void setHomeAddress(String newAddress){
		homeAddress = newAddress;
	}
}
