package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.ProductBean;
import com.example.demo.service.ProductServiceImpl;

@RestController
@RequestMapping(value = "/apm/v1/product")

public class ProductController {
	
	
	@Autowired
	ProductServiceImpl productServiceImpl;
	
	@GetMapping
	public List<ProductBean> getAllProducts(){
		return productServiceImpl.getAllProducts();
	}
	

}
