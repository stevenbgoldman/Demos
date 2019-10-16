package Demos;

public class WelcomeMessage {
	
	public static void main(String[] args) {
		
		System.out.println("Starting Welcome message");
		
	// Declaring the Variable
				String name;
				
	// Define the variable
				name = "Shawn";
				
	// Declare and Define the variable
				String date = "Friday, 2:12pm.";
				double transactionAmount = 32.58;
				char sign = '+';		
		
	// Use the variable
				System.out.println(name);
				System.out.println(date);
				System.out.println(transactionAmount);
				System.out.println("High " + name  + " welcome back! Your last login was " + date + " Your last transaction was for " + sign 
						+ "$" + transactionAmount); 
									
	// "High Shawn, welcome back! Your last login was Friday, 2:12pm. 
	//			Your last transaction was for +$32.58	
	}

}
