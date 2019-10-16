package Demos;

public class weatherWarningMessage {

	public static void main(String[] args) {
		// convert from C to F = (degreesC * 9/5) + 32
		
			double degreesC = -120;
			double degreesF = (degreesC * 9/5) + 32;
			
		//print temperature in F
			System.out.println(degreesC + "C");
			System.out.println(degreesF + "F");
		//test the temperature to print the correct warning message
		// degressF >> less than 32 = Freezing message
		// degressF >> greater than 105 = Heat message
		
			if (degreesF <= 32 ) {
				System.out.println("Warning Freezing Temperature");
				
			}
			else if (degreesF > 105) {
				System.out.println("Warning Extreme Heat Temperature");
			}
			else {
				System.out.println("Weatrher is pleasant");
			}
	}

}
