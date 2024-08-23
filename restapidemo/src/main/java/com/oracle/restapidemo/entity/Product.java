package com.oracle.restapidemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee_Info")
public class Product {
	
	@Id
	@Column(name = "product_id")
    private int pid;
	@Column(name = "product_name")
    private String pname;
	@Column(name = "product_price")
    private double price;
	
	public Product() {
		super();
	}
    
    public Product(int pid, String pname, double price) {
    	this.pid = pid;
    	this.pname = pname;
    	this.price = price;
    }

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
    
}
