package com.comtrade.recapitulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import com.comtrade.domain.Human;

public class ExceptionExample {	

	public static void main(String[] args) {			
		attemptToGetFirstAndLastNameForHuman();
		try {
		sumOfNumbersLesserThanN(null);
		} catch (Exception e) {
			System.out.println("GRESKA!");
		}
	}

	private static void attemptToGetFirstAndLastNameForHuman() {
		Human human = null;		
		try {
			human.getFirstAndLastName();
			System.out.println(human.getFirstAndLastName());
		} catch (Exception e) {
			System.out.println("Doslo je do greske");
		} finally {
			System.out.println("Kod definisan u okviru"
					+ "finally se uvek izvrsava, cak i ako"
					+ "ima return ispred");
		}
	}	
	
	private static int sumOfNumbersLesserThanN(Integer n) {
		int sum = 0;	
//	try 
		//{
         for (int i=1; i<n; i++) {
    	   sum = sum + i;
       } 
//         } catch (Exception e) {
//        	 return sum;
//         }
		
       return sum;
	}	
	private static void checkedExceptionExample() throws ParseException {
		SimpleDateFormat SDFormat 
        = new SimpleDateFormat("MM/ dd/ yy"); 
		 Calendar cal = Calendar.getInstance(); 
		  
         // Use of .parse() method to parse 
         // Date From String 
         String dt = "10/ 27/ 16"; 
         System.out.println("The unparsed"
                            + " string is: " + dt); 

         cal.setTime(SDFormat.parse(dt)); 
         System.out.println("Time parsed: "
                            + cal.getTime()); 
	}
	
	// Dobra praksa je za kolekcije - liste, skupove
	// mape itd proveriti da li su null na pocetku
	//metode
	private void doSomething(List<String> inputList) {
		if (inputList==null) {
			return;
		}
		inputList.add("Prvi");
	}

}
