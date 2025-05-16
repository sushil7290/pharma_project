package com.example.pharma.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Medicine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	private String medName;
	
	private String category;
	
	private String manufacturer;
	
	private int quantity;
	
	private double price;
	
	private LocalDate expiryDate;

	public Medicine() {}

	public Medicine(String medName, String category, String manufacturer, int quantity, double price,
			LocalDate expiryDate) {
		super();
		this.medName = medName;
		this.category = category;
		this.manufacturer = manufacturer;
		this.quantity = quantity;
		this.price = price;
		this.expiryDate = expiryDate;
	}

	public Long getId() {
		return Id;
	}

	public String getMedName() {
		return medName;
	}

	public void setMedName(String medName) {
		this.medName = medName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
