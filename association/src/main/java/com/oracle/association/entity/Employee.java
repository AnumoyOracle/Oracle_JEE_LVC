package com.oracle.association.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee_master")
public class Employee implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "employee_id")
	private int id;
	@Column(name = "employee_name")
	private String name;
	@Column(name = "employee_salary")
	private double salary;
	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}

}
