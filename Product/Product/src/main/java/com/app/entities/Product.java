package com.app.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;




@Entity
@Table(name="products")
public class Product extends BaseEntity{
	@Column(length=30,unique = true)
	private String name;
	@Column(nullable = false)
	private double price;
	@Column(nullable = false)
	private double version;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Product(String name, double price, double version) {
		super();
		this.name = name;
		this.price = price;
		this.version = version;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getVersion() {
		return version;
	}
	public void setVersion(double version) {
		this.version = version;
	}
	@Override
	public String toString() {
		return "Product [ Id=" + getId() + "name=" + name + ", price=" + price + ", version=" + version +  "]";
	}
	
	
	
	

}
