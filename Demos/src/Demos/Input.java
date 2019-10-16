package Demos;

import java.util.Scanner;

public class Input {
		 
		
		public static void main(String[] args) {
			
	
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
	
		System.out.print("What is your name?: ");
			String name = in.next();
			
		System.out.print("What is your age?: ");
			int age = in.nextInt();
			
		
		System.out.print("Hi " + name + " Your age is: " + age + " Years old.");
		
				
		}
}			
