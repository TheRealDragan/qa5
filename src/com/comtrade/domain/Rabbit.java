package com.comtrade.domain;

public class Rabbit extends Animal implements Movable{
	
	public Rabbit() {
		System.out.println("Ovo je konstruktor za zeca");
	}
	
	public Rabbit(String name) {
		super(name);
		this.setName(name);
	}

	@Override
	public String move() {
		// TODO Auto-generated method stub
		return null;
	}

}
