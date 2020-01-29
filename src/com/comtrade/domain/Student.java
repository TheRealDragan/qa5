package com.comtrade.domain;

public class Student {
	
	private String name;
	private String lastName;
	private String email;
	private String imageUrl;
	
	private static String university;
	
	public Student() {		
	}
	
	public Student(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	
	 	
	public static String getUniversity() {
		return university;
	}
	public static void setUniversity(String university) {
		Student.university = university;
	}
	@Override
	public String toString() {
		return "Buba Miranovic";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((imageUrl == null) ? 0 : imageUrl.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}



	

}
