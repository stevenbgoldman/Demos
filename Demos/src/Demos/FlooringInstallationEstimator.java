package Demos;

public class FlooringInstallationEstimator {

	public static void main(String[] args) {
		int squareFeet = 2645;
		String floorType = "hardwood";
		double quote = getQuote(squareFeet, floorType);
		System.out.println("Your quote is: $" + quote);
	}
	private static double getQuote(int squareFeet, String floorType) {
		System.out.println("Quote Function");
		System.out.println("Square Feet: " + squareFeet );
		System.out.println("Flooring Type: " + floorType);
		
		double baseRate = 3;
		double carpetRate = .50;
		double hardwoodRate = 1.5;
		double hardwoodHardwareFee = 100;
		double totalRate = 0;
		double totalCost = 0;
		
		if (floorType == "Carpet") {
				totalRate = carpetRate + baseRate;
		}
		
		else if (floorType == "hardwood"){
				totalRate = hardwoodRate + baseRate;
				totalCost = totalCost + hardwoodHardwareFee;
				
		}
		else {
			System.out.println(" Wrong Floor Type was used");
		}
		
			System.out.println("Total Rate: " + totalRate);
			totalCost = (totalCost + totalRate) * squareFeet;
			System.out.println("Total Cost is: " + totalCost);
			
			if (squareFeet >= 1500) {
			double discount = totalCost * .1;
			totalCost = totalCost - discount;
			System.out.println("Discount is: " + discount);
			System.out.println("Total Cost is: " + totalCost);
		}
		else { System.out.println("No discount was applied");
			
		}
		return totalCost;			
	}
	
	
	
	
	
	
	
	
	
}
