package com.oracle.association;

import javax.persistence.EntityManager;

import com.oracle.association.util.Util;

public class OneToMany {
    public static void main(String[] args) {
    	
    	EntityManager entityManager = Util.getEntityManager();
    	
    	entityManager.getTransaction().begin();
    	
//    	Employee employee1 = new Employee();
//    	Employee employee2 = new Employee();
//    	Employee employee3 = new Employee();
//    	
//    	employee1.setId(1);
//    	employee1.setName("Anumoy Nandy");
//    	employee1.setSalary(50000.00);
//    	
//    	employee2.setId(2);
//    	employee2.setName("Manjeet Chillar");
//    	employee2.setSalary(75000.25);
//    	
//    	employee3.setId(3);
//    	employee3.setName("Bhabesh Joshi");
//    	employee3.setSalary(25000.50);
//    	
//    	Department department1 = new Department();
//    	Department department2 = new Department();
//    	
//    	department1.setId(1);
//    	department1.setName("SAAS");
//    	department1.addEmployee(employee1);
//    	employee1.setDepartment(department1);
//    	department1.addEmployee(employee2);
//    	employee2.setDepartment(department1);
//    	
//    	department2.setId(2);
//    	department2.setName("OAL");
//    	department2.addEmployee(employee3);
//    	employee3.setDepartment(department2);
//    	
//    	entityManager.persist(department1);
//    	entityManager.persist(department2);
    	
    	entityManager.getTransaction().commit();
    }
}
