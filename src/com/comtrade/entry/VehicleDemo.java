package com.comtrade.entry;

import com.comtrade.domain.Bike;
import com.comtrade.domain.Car;

public class VehicleDemo {

	public static void main(String[] args) {

		Car machine = new Car();
		System.out.println(machine.itsDriverReactToManiacsOnTheRoad());
		Bike threeWheeler = new Bike();
		System.out.println(threeWheeler.itsDriverReactToManiacsOnTheRoad());
		
		machine.setBrand("Citroen");
        machine.setColor("Gray");
		machine.setNumberOfWheels(4);
		
		threeWheeler.setBrand("Shimano");
		threeWheeler.setColor("Red");
		threeWheeler.setNumberOfWheels(3);
        
		if (machine.getColor().equals(threeWheeler.getColor())) {
		     System.out.println("Volim sivu boju"); }
		     else { System.out.println("Sve mi boje dobro stoje");
	}
	}

}
