package com.comtrade.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Human implements Comparable<Human> {
	private Integer height;
	private int heightInInches;
	private String name;
	private String lastName;

	private static final String country = "Srbija";

	public Human() {
	}

	public Human(Integer height, int heightInInches, String name, String lastName) {
		super();
		this.height = height;
		this.heightInInches = heightInInches;
		this.name = name;
		this.lastName = lastName;
	}

//	public Human(String name, String lastName) {
//		this.name = name;
//		this.lastName = lastName;
//	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Integer getHeightInInches() {
		return heightInInches;
	}

	public void setHeightInInches(int heightInInches) {
		this.heightInInches = heightInInches;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public static void sayHi() {
		System.out.println("Hi");
	}

	public String getFirstAndLastName() {
		return name + " " + lastName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((height == null) ? 0 : height.hashCode());
		result = prime * result + heightInInches;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Human other = (Human) obj;
		if (height == null) {
			if (other.height != null)
				return false;
		} else if (!height.equals(other.height))
			return false;
		if (heightInInches != other.heightInInches)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Visina = " + height + ", Visina  u incima = " + heightInInches + ", Ime " + name + ", Prezime "
				+ lastName;
	}

	@Override
	public int compareTo(Human h) {
		int compareHeight = ((Human) h).getHeight();
		return this.height - compareHeight;

	}

}
