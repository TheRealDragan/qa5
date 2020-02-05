package com.comtrade.domain;

public abstract class AbstractAnimal {
	
	private String name;
	
	public String sayYourName() {
		return "My name is" + name;
	}
	
	public abstract String reactToHuman();

}
