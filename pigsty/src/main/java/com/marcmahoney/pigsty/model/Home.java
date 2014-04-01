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
import javax.persistence.Table;

@Entity
@Table(name = "HOME")
public class Home {

	@Column(name="ADDRESS", nullable=false)
	private String address;
	
	public Home(){
	}
	
	public String getAddress(){
		return address;
	}
}
