package com.comtrade.domain;

public class Vehicle {
	 
	public Vehicle() { 
		System.out.println("Ica Sumaherica");
	 
}

     private String brand;
     private String color;
     private int numberOfWheels;
     
     public String itsDriverReactToManiacsOnTheRoad() {
    	 return "Honk and curse" ;
    	 
     }

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
     

}
