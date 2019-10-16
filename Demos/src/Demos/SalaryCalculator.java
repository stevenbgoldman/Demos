package Demos;

public class SalaryCalculator {

	
	public static void main(String[] args) {
		// Annual Gross Salary = hourlyRate x hoursInWeek x weeksInYear
		@SuppressWarnings("unused")
		Double hourlyRate = 50.00;
		@SuppressWarnings("unused")
		int hoursInWeek = 40;
		int vacationInWeeks = 0;
		int weeksInYear = 52;
		
		double grossIncome = hourlyRate * hoursInWeek * (weeksInYear - vacationInWeeks);
		
		System.out.print("$" + grossIncome);
		
	}

}
