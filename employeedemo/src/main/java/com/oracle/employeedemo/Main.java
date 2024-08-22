package com.oracle.employeedemo;

import java.util.List;

import javax.persistence.EntityManager;

import com.oracle.employeedemo.entity.Employee;
import com.oracle.employeedemo.util.JPAUtil;

public class Main {

	public static void main(String[] args) {
		
		EntityManager entityManager = JPAUtil.getEntityManager();
		
		
		// Single Result
//		TypedQuery<Employee> query = entityManager.createQuery("select e from Employee e where e.ename = 'Manav' ", Employee.class);
//		Employee employee = query.getSingleResult();
//		System.out.println(employee);
		
		
		// Multiple Result
//		TypedQuery<Employee> queryAll = entityManager.createQuery("select e from Employee e", Employee.class);
//		List<Employee> employees = queryAll.getResultList();
//		for(Employee e : employees) {
//			System.out.println(e);
//		}
		
		// executeUpdate
//		entityManager.getTransaction().begin();
//		Query query2 = entityManager.createQuery("delete from Employee e where e.eid > 2");
//		int deleteCount = query2.executeUpdate();
//		System.out.println("Rows deleted : " + deleteCount);
//		entityManager.getTransaction().commit();
		
		
		// NamedQueries
		List<Employee> employees = getAllEmployees();
		for(Employee employee : employees) {
			System.out.println(employee);
		}
		
	}
	
	public static List<Employee> getAllEmployees(){
		List<Employee> employees = JPAUtil.getEntityManager().createNamedQuery("getAllEmployees", Employee.class).getResultList();
		return employees;
	}

}
