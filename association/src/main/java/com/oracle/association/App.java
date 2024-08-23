package com.oracle.association;

import javax.persistence.EntityManager;

import com.oracle.association.util.Util;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        EntityManager entityManager = Util.getEntityManager();
        entityManager.getTransaction().begin();
        
//        Product elecProduct = new Product();
//        elecProduct.setId(1);
//        elecProduct.setName("LED TV");
//        elecProduct.setPrice(45000);
//        
//        Product beautyProduct = new Product();
//		beautyProduct.setId(2);
//		beautyProduct.setName("Face Wash");
//		beautyProduct.setPrice(80);
//
//		Product babyProduct = new Product();
//		babyProduct.setId(3);
//		babyProduct.setName("Pampers");
//		babyProduct.setPrice(15);
//		
//		Order firstOrder = new Order();
//		firstOrder.setId(1);
//		firstOrder.setPurchaseDate(new Date());
//		firstOrder.addProduct(elecProduct);
//		firstOrder.addProduct(beautyProduct);
//		firstOrder.addProduct(babyProduct);
//		
//		Order secondOrder = new Order();
//		secondOrder.setId(2);
//		secondOrder.setPurchaseDate(new Date());
//		secondOrder.addProduct(elecProduct);
//		secondOrder.addProduct(babyProduct);
//		secondOrder.addProduct(beautyProduct);
//		
//		entityManager.persist(firstOrder);
//		entityManager.persist(secondOrder);
        
//        Order order = entityManager.find(Order.class, 2);
//        System.out.println(order.getId() + " " + order.getPurchaseDate());
//        for(Product product : order.getProducts()) {
//        	System.out.println(product.getId() + " " + product.getName() + " " + product.getPrice() + " ");
//        }
        
        entityManager.getTransaction().commit();
        
    }
}
