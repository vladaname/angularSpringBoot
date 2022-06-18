package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the angularuser database table.
 * 
 */
@Entity
@NamedQuery(name="Angularuser.findAll", query="SELECT a FROM Angularuser a")
public class Angularuser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAngularUser;

	private String domain;

	private String email;

	private int experiance;

	private String name;

	public Angularuser() {
	}

	public int getIdAngularUser() {
		return this.idAngularUser;
	}

	public void setIdAngularUser(int idAngularUser) {
		this.idAngularUser = idAngularUser;
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getExperiance() {
		return this.experiance;
	}

	public void setExperiance(int experiance) {
		this.experiance = experiance;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}