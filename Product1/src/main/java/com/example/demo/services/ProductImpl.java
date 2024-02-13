package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.model.ProductModel;

import com.example.demo.repository.ProductRepo;


@Service
public class ProductImpl implements ProductServices {
	
	@Autowired
	public ProductRepo productRepo;

	@Override
	public List<ProductModel> getAllProductModels() {
		return productRepo.findAll();
	}

	@Override
	public ProductModel getProductModelById(int id) {
		ProductModel productModel=null;
		productModel=productRepo.findById(id);
		return productModel;
	}

	@Override
	public ProductModel addProductModel(ProductModel productModel) {
		
		ProductModel productModel2=productRepo.save(productModel);
		return productModel2;
	}

	@Override
	public ProductModel updateProductModel(ProductModel productModel, int id) {
		productModel.setPid(id);
		return productRepo.save(productModel);
	}

	@Override
	public void deleteProductModel(int id) {
		productRepo.deleteById(id);
	}
	

}
