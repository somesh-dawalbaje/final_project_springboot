package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class product {
	private int id;
	private String name;
	private float price;
	@Autowired
	private app APP;
	public app getAPP() {
		return APP;
	}
	public void setAPP(app aPP) {
		APP = aPP;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public product() {
		
	}
	@Override
	public String toString() {
		return "product [id=" + id + ", name=" + name + ", price=" + price + ", APP=" + APP + "]";
	}
	
	
	
	
}
