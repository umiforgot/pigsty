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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.log4j.Logger;

@Entity
@Table(name = "homes")
public class Home {

	static final Logger logger = Logger.getLogger(Home.class);
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="address", nullable=false)
	private String address;
	
	public Home(){
	}
	
	public String getAddress(){
		return address;
	}
	
	public int getId(){
		return id;
	}
}
