package com.oracle.restapidemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oracle.restapidemo.entity.Product;
import com.oracle.restapidemo.repository.ProductRepository;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	 @Autowired
     private ProductRepository productRepository;
	 
	 @PostMapping("/insert")
	 public Product insertProduct(@RequestBody Product product) {
		 return this.productRepository.save(product);
	 }
	 
	 @GetMapping("/getAll")
	 public List<Product> getAllProducts(){
		 List<Product> products = this.productRepository.findAll();
		 return products;
	 }
	 
	 @GetMapping("/getProductById/{pid}")
	 public Product getProductById(@PathVariable int pid) {
		 Product product = this.productRepository.findById(pid).get();
		 return product;
	 }
	 
	 @PutMapping("/update")
	 public Product updateProduct(@RequestBody Product product) {
		 return this.productRepository.save(product);
	 }
	 
	 @DeleteMapping("/delete/{pid}")
	 public String deleteProduct(@PathVariable int pid) {
		 Product product = this.productRepository.findById(pid).get();
		 this.productRepository.delete(product);
		 return "Successfully deleted ...";
	 }
	 
}
