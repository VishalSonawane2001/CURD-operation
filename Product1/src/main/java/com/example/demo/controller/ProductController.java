package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ProductModel;
import com.example.demo.services.ProductServices;

@CrossOrigin("*")
@RestController
@SpringBootApplication
public class ProductController {

	@Autowired
	public ProductServices productServices;
	
	@GetMapping("/prod")
	public List<ProductModel> getallprod(){
		System.out.println("2nd");
		return productServices.getAllProductModels();		
	}
	
	@GetMapping("/prod/{pid}")
	public ProductModel getprodById(@PathVariable int pid) {
		System.out.println("3rd");
		return productServices.getProductModelById(pid);
	}
	
	@PostMapping("/prod")
	public ProductModel getProduct(@RequestBody ProductModel productModel) {
		System.out.println("4th");
		return productServices.addProductModel(productModel);
	}
	
	@PutMapping("/prod/{pid}")
	public ProductModel update(@RequestBody ProductModel productModel, @PathVariable int pid) {
		System.out.println("5th");
		return productServices.updateProductModel(productModel, pid);
	}
	
	@DeleteMapping("/prod/{pid}")
	public void deleteprod(@PathVariable int pid) {
		productServices.deleteProductModel(pid);
	}

}
