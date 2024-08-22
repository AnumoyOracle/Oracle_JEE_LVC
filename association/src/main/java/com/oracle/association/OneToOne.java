package com.oracle.association;

import javax.persistence.EntityManager;

import com.oracle.association.util.Util;

public class OneToOne {

	public static void main(String[] args) {
		
		EntityManager entityManager = Util.getEntityManager();
		entityManager.getTransaction().begin();
		
//		Student student1 = new Student();
//		Student student2 = new Student();
//		
//		Address address1 = new Address();
//		Address address2 = new Address();
//		
//		student1.setId(1);
//		student1.setName("Anumoy Nandy");
//		
//		student2.setId(2);
//		student2.setName("Mohit Tyagi");
//		
//		address1.setId(1);
//		address1.setCity("Kolkata");
//		address1.setState("West Bengal");
//		
//		address2.setId(2);
//		address2.setCity("Patna");
//		address2.setState("Bihar");
//		
//		student1.setAddress(address1);
//		student2.setAddress(address2);
//		
//		entityManager.persist(student1);
//		entityManager.persist(student2);
		
//		Student student = entityManager.find(Student.class, 1);
//		System.out.println(student.getName());
//		System.out.println(student.getAddress().getCity());
//		System.out.println(student.getAddress().getState());
		
//		Student student = entityManager.find(Student.class, 2);
//		student.getAddress().setCity("Vagalpur");
//		student.setName("Rohit Tyagi");
//		entityManager.persist(student);
		
//		Student student = entityManager.find(Student.class, 2);
//		entityManager.remove(student);
		
		entityManager.getTransaction().commit();
		
	}

}
