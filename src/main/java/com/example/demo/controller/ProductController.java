package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.ProductBean;
import com.example.demo.service.ProductServiceImpl;

@RestController
@RequestMapping(path = "/apm/v1/product")

public class ProductController {
	
	
	@Autowired
	ProductServiceImpl productsServiceImpl;
	
	@GetMapping
	public List<ProductBean> getAllProducts(){
		return productsServiceImpl.getAllProducts();
	}
	
@PostMapping
public ProductBean addProduct(@RequestBody ProductBean productBean) {
	
	return productsServiceImpl.addProduct(productBean);
	
}
}
