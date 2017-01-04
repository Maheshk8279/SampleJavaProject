package com;


public class Order {
	
	private int id;
	private String productName;
	private int quantity;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(int id, String productName, int quantity) {		
		this.id = id;
		this.productName = productName;
		this.quantity = quantity;
	}

	//getter method
	public int getId() {
		return id;
	}

	//setter method
	public void setId(int id) {
		if(id > 0 ){
			this.id = id;
		}else{
			System.out.println("Invalid id");
		}
	}

	//getter method
	public String getProductName() {
		return productName;
	}

	//setter method
	public void setProductName(String productName) {
		this.productName = productName;
	}

	//getter method
	public int getQuantity() {
		return quantity;
	}
	
	//setter method
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
