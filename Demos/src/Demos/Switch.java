package Demos;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

    	double salesAmount, tenderAmount;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Tender Amount:");

        /* We are using data type double so that user
         * can enter integer as well as floating point
         * value
         */
        salesAmount = scanner.nextDouble();
        System.out.print("Enter Sales Amount:");
        tenderAmount = scanner.nextDouble();

       // System.out.print("Enter an operator (+, -, *, /): ");
      //  char operator = scanner.next().charAt(0);

        scanner.close();
       // double output;

        switch(operator)
        {
            case '+':
            	output = tenderAmount + salesAmount ;
                break;

           
            
            default:
                System.out.printf("You have entered bad data");
                return;
        }

        System.out.println(salesAmount + " "+ operator + " "+ tenderAmount + ": " + output);
    }
}
