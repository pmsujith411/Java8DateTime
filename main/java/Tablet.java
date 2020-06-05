package main.java;

import java.time.LocalDate;

public class Tablet {

	String name;
	String manufacturer;
	LocalDate manufactureDate;
	LocalDate expiryDate;
	
	public Tablet(String name, String manufacturer, LocalDate manufactureDate, LocalDate expiryDate) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.manufactureDate = manufactureDate;
		this.expiryDate = expiryDate;
	}
	public String getName() {
		return name;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public LocalDate getManufactureDate() {
		return manufactureDate;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", manufacturer=" + manufacturer + ", manufactureDate=" + manufactureDate
				+ ", expiryDate=" + expiryDate + "]";
	}
	
}
