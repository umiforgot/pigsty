/**
 * pigsty
 * Home.java
 *
 * 
 *
 * @author Marc Mahoney
 * @version Mar 17, 2014
 */
package com.marcmahoney.pigsty.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "homes")
public class Home {

	@Id
	@GeneratedValue
	private int id;
	
	private String address;
	
	public String getAddress(){
		return address;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public int getId(){
		return id;
	}
	

}
