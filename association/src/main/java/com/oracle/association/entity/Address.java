package com.oracle.association.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "addresses")
public class Address implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "address_id")
	private int id;
	private String city;
	private String state;
	@OneToOne(mappedBy = "address")
	private Student student;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [ id=" + id + ", city=" + city + ", state=" + state + " ]";
	}
	
}
