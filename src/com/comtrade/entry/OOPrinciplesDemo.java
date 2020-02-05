package com.comtrade.entry;

import com.comtrade.domain.Rabbit;
import com.comtrade.domain.Rhino;

import java.util.Date;

import com.comtrade.domain.AbstractAnimal;
import com.comtrade.domain.Animal;


public class OOPrinciplesDemo {

	public static void main(String[] args) {
//		Rabbit bugs = new Rabbit();
//		System.out.println(bugs.reactToHuman());
//		Rhino rhino = new Rhino();
//		System.out.println(rhino.reactToHuman());
		Rabbit bugs = new Rabbit("bugs");
		
		Animal animal = new Animal();
		Animal bunny = new Rabbit();
		// Cesta greska - ovo ispod ne moze!!!
		//Rabbit bunnyAnimal = new Animal();4
		printAnimalsName(bugs);
	
	}
	
	private static void printAnimalsName(Animal animal) {
		System.out.println(animal.getName());
	}

}
