package com.xworkz.collectionapp;

public class SanitizerDTO {
	private int id;
	 private String brand;
	 private int price;
	 private String colour;
	 
	 public SanitizerDTO() {
		 
	 }

	public SanitizerDTO(int id, String brand, int price, String colour) {
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "SanitizerDTO [id=" + id + ", brand=" + brand + ", price=" + price + ", colour=" + colour + "]";
	}

	public int getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	public int getPrice() {
		return price;
	}

	public String getColour() {
		return colour;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
	
	 
}
