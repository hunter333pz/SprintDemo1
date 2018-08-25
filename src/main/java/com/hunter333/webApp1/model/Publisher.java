package com.hunter333.webApp1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author Hunter333
 *
 */
@Entity
public class Publisher {
	@Getter
	@Setter
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Getter
	@Setter
	private String name;
	@Getter
	@Setter
	private String address;

	public Publisher(String name) {
		super();
		this.name = name;
	}

	public Publisher(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

}
