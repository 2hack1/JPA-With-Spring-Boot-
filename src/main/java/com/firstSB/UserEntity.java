package com.firstSB;

import org.hibernate.generator.values.GeneratedValues;
import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserEntity {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int roll;
	private String fName;
	
	public UserEntity(int id, String name, int roll, String fName) {
		super();
		this.id = id;
		this.name = name;
		this.roll = roll;
		this.fName = fName;
	}
	public UserEntity() {
		super();
	}
	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", name=" + name + ", roll=" + roll + ", fName=" + fName + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	
	
}
