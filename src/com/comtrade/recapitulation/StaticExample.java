package com.comtrade.recapitulation;

import com.comtrade.domain.Student;

public class StaticExample {
	public static void main(String[] args) {
		Student firstStudent = new Student();
		firstStudent.setUniversity("Oxford");
		Student secondStudent = new Student();
		System.out.println(secondStudent.getUniversity());
		secondStudent.setUniversity("Cambridge");
		System.out.println(firstStudent.getUniversity());
		Student thirdStudent = new Student();
		System.out.println(thirdStudent.getUniversity());
	}
}
