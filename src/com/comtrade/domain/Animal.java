package com.comtrade.domain;

public class Animal {
	
	public Animal() {
		System.out.println("Pravimo zivotinju");
	}
	
	public Animal(String name) {
		System.out.println("Usao sam ovde");
	}
	
	private String name;
	private String subSpecies;
	private int numberOfLegs;
	
	public String reactToHuman() {
		return "Run";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubSpecies() {
		return subSpecies;
	}

	public void setSubSpecies(String subSpecies) {
		this.subSpecies = subSpecies;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

}
