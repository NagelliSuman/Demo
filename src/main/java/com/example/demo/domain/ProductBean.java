package com.example.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ProductBean {
	
	@Id
	private String productId;
	
	private String  productName;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "ProductBean1 [productId=" + productId + ", productName=" + productName + "]";
	}

	public ProductBean(String productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}
	

}
