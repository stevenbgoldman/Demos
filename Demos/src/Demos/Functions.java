package Demos;

import javax.swing.Spring;
//import java.math.RoundingMode;
//import java.text.DecimalFormat;

public class Functions {

	public static void main(String[] args) {

		sayHi();
		printName("Steve", "Goldman");
		String fullName = combineName("Steve", "Goldman");
		System.out.println(fullName);
		futureValue();	
		tipCalculation(33.57, "Great");
		returnChange();
		
		
	}

	public static void printName(String firstName, String lastName) {
		
		System.out.println("First name is:  " + firstName);
		System.out.println("Last  name is:  " + lastName);
		
	}
	
	
	public static void sayHi() {
		System.out.println("Hi ! ");
		
	}
	

	public static String combineName(String firstName, String lastName) {
		String combineName = firstName + " " + lastName;
		return combineName;
				
	}
	
	public static void futureValue() {
		double pv = 2000;
		int time = 15;
		double rate = 4.5;
		double fva = (char) (pv * (1 + ((rate / 100) * time)));
		System.out.println("FVA = " + fva);
		
	}	
	
	public static <If> void tipCalculation(double tab, String quality) {
		
		if (quality == "Poor"  ) {
			double tip = 0.16;
			double totalTip = (tab * tip);
			System.out.println("Tip is: " + totalTip);		
		}
		else if (quality == "Good") {
			double tip = 0.22;
			double totalTip = (tab * tip);
			System.out.println("Tip is: " + totalTip);		
		}
		else if (quality == "Great") {
			double tip = 0.26;
			double totalTip = (tab * tip);
			System.out.println("Tip is: " + totalTip);
		}
		else {
			System.out.println("Bad Input");
		}
	}
		
		//for (int i = 0; i < 3; i++) {}
		public static void returnChange() {
						
		double cashTender = 18.00;
		double salesAmount = 17.18;
		double changeAmount = (cashTender - salesAmount);
		double qtrValue = .25;
		double dimValue = .10;
		double nicValue = .05;
		double penValue = .01;
		double beginingChangeAmount = changeAmount;
		int counterHold = 0;
		System.out.println("Cash Tender " + cashTender);
		System.out.println("Sales Amount " + salesAmount);
		System.out.println("Change Amount" + changeAmount);
		System.out.println("Begining Change Amount" + beginingChangeAmount);		
		
		//for (int i = 0; i < 5; i++) {
	//		  System.out.println(i);
	//		}
		
		for (int counter = 1; beginingChangeAmount >= qtrValue; counter ++) {
			System.out.println("Begining Change Amount" + beginingChangeAmount);
			beginingChangeAmount = beginingChangeAmount - qtrValue;
			System.out.println("Begining Change Amount: " + beginingChangeAmount);
			System.out.println("Quater Count " + counter);
			counterHold = counter;
		
		}
				
		
		
		
		
		System.out.println("Begining Change Amount" + beginingChangeAmount);
		System.out.println("Counter Hold " + counterHold);
		
		
		}
		int counterHold = 0;
		for (int counter = 1; beginingChangeAmount >= dimValue; counter ++) {
			System.out.println("Begining Change Amount" + beginingChangeAmount);
			beginingChangeAmount = beginingChangeAmount - dimValue;
			System.out.println("Begining Change Amount: " + beginingChangeAmount);
			System.out.println("Dime Count " + counter);
			counterHold = counter;
		
		}
		System.out.println("Begining Change Amount" + beginingChangeAmount);
		System.out.println("Counter Hold " + counterHold);
		
		
		
		
		
		
	/*	int counter = 0;
		do {
			beginingChangeAmount = beginingChangeAmount - qtrValue;
			System.out.println("Begining Change Amount" + beginingChangeAmount);
			counter ++;
			System.out.println(counter);
		}
		while (beginingChangeAmount >= qtrValue);	
		
		}*/
		
		
		
		
	
		}
	
	
	

