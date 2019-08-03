package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductDao;
import com.example.demo.domain.ProductBean;

@Service
public class ProductServiceImpl {

	@Autowired
	ProductDao productDao;
	
	
	public List<ProductBean> getAllProducts(){
		return productDao.findAll();
		
	}
}
