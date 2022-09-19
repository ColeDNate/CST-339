package com.gcu.model;

public class OrderModel {
	
	//variables?
	private long id;
	private String orderNo;
	private String productName;
	private float price;
	private int quantity;
	
	
	public OrderModel(long id, String orderNo, String productName, float price, int quantity) {
		setId(id);
		setOrderNo(orderNo);
		setProductName(productName);
		setPrice(price);
		setQuantity(quantity);
	}
	
	
	//id
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	//order no
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	//product name
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	//price
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	//quantity
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
