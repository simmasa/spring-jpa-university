package com.jana60.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="degrees")
public class Degrees {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer degreeId;
	
	private String name;
	private String level;
	private String address;
	private String email;
	private String website;
	
	@ManyToOne
	@JoinColumn(name="department_id")
	private Departments depa;

	
	//getter-setter
	public Integer getId() {
		return degreeId;
	}

	public void setId(Integer id) {
		this.degreeId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Departments getDepa() {
		return depa;
	}

	public void setDepa(Departments depa) {
		this.depa = depa;
	}

	
	
	
	
}
