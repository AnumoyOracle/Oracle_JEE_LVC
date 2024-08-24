package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee_demo")
public class Employee implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "employee_id")
	private int eid;
	@Column(name = "employee_name")
	private String ename;
	@Column(name = "employee_salary")
	private double salary;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [ eid=" + eid + ", ename=" + ename + ", salary=" + salary + " ]";
	}



}
