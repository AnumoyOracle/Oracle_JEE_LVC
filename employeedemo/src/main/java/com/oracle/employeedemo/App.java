package com.oracle.employeedemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
        EntityManager em = factory.createEntityManager();
        
        em.getTransaction().begin();
        
          // Create .........
        
//        Employee employee = new Employee();
//        employee.setEid(4);
//        employee.setEname("Mukul");
//        employee.setSalary(80000.00);
//        em.persist(employee);
        
        
          // Read ...........
        
//        Employee employee1 = em.find(Employee.class, 2);
//        System.out.println(employee1);
//        
//        Employee employee2 = em.find(Employee.class, 3);
//        System.out.println(employee2);
        
        
          // Update .........
        
//        Employee employee = em.find(Employee.class, 4);
//        employee.setEname("Manav");
//        employee.setSalary(100000.00);
//        em.persist(employee);
        
          
          // Delete .........
        
//        Employee employee = em.find(Employee.class, 1);
//        em.remove(employee);
        
        em.getTransaction().commit();
        
    }
}
