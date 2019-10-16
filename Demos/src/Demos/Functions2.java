package Demos;

import java.util.Scanner;


//import java.math.RoundingMode;
//import java.text.DecimalFormat;

public class Functions2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("What is the Sales amount: ");
		double salesAmount = in.nextDouble();
		System.out.print("What is the Tender amount: ");
		double cashTender = in.nextDouble();
		double changeOut = cashTender - salesAmount;
		if (changeOut < 1.00)
			System.out.println("Cash Tender " + cashTender);
			System.out.println("Sales Amount " + salesAmount);
			System.out.println("Change Amount " + changeOut);
			returnChange(changeOut);
		//else
			//System.out.println("Cannot make change for $1.00 or more:");
		
	}
	
		public static void returnChange(double changeAmount) {			
		double qtrValue = .25;
		double dimValue = .10;
		double nicValue = .05;
		double penValue = .01;
		//double beginingChangeAmount = Math.round(changeAmount);
		double beginingChangeAmount = changeAmount;
		int counterHold = 0;
						
		for (int qtrCnt = 1; beginingChangeAmount >= qtrValue; qtrCnt ++) {
			
			beginingChangeAmount = beginingChangeAmount - qtrValue;
			counterHold = qtrCnt;
		}
		if (counterHold == 0)
			counterHold = 0;
		else
			System.out.println("Quater Count " + counterHold);
			counterHold = 0;
		
		
		for (int dimCtr = 1; beginingChangeAmount >= dimValue; dimCtr ++) {
		
			beginingChangeAmount = beginingChangeAmount - dimValue;
			counterHold = dimCtr;
		}
		if (counterHold == 0)
			counterHold = 0;
		else
			System.out.println("Dime Count " + counterHold);
			counterHold = 0;
		
		for (int nicCnt = 1; beginingChangeAmount >= nicValue; nicCnt ++) {
			
			beginingChangeAmount = beginingChangeAmount - nicValue;
			counterHold = nicCnt;
		}
		if (counterHold == 0)
			counterHold = 0;
		else
			System.out.println("Nickel Count " + counterHold);
			counterHold = 0;
			
		for (int penCtr = 1; beginingChangeAmount >= penValue; penCtr ++) {
			beginingChangeAmount = beginingChangeAmount - penValue;
			counterHold = penCtr;
		}
		if (counterHold == 0)
			counterHold = 0;
		else
			System.out.println("Penney Count " + counterHold);
			counterHold = 0;
		
		}
	}
		

		

