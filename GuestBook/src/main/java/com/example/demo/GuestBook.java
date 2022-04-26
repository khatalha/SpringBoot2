package com.example.demo;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GuestBook {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String type;
	private LocalDateTime datetime;
	
	private String admin;
	private String customer;

	
	public GuestBook() {
		
	}


	public GuestBook(int id, String name, String type, LocalDateTime datetime, String admin, String customer) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.datetime = datetime;
		this.admin = admin;
		this.customer = customer;
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


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public LocalDateTime getDatetime() {
		return datetime;
	}


	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}


	public String getAdmin() {
		return admin;
	}


	public void setAdmin(String admin) {
		this.admin = admin;
	}


	public String getCustomer() {
		return customer;
	}


	public void setCustomer(String customer) {
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "GuestBook [id=" + id + ", name=" + name + ", type=" + type + ", datetime=" + datetime + ", admin="
				+ admin + ", customer=" + customer + "]";
	}
	
	
	
	
	

}
