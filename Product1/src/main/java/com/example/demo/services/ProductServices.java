package com.example.demo.services;

import java.util.List;

import com.example.demo.model.ProductModel;

public interface ProductServices {
	 public List<ProductModel> getAllProductModels();
	 
	 public ProductModel getProductModelById(int id);
	 
	 public ProductModel addProductModel(ProductModel productModel);
	 
	 public ProductModel updateProductModel(ProductModel productModel, int id);
	 
	 public void deleteProductModel(int id);

}
