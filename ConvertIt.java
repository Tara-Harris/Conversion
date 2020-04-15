package taraharris.CoreJava.BasicJavaDataTypes;

import java.util.Scanner;

public class ConvertIt {

	public static void main(String[] args) {
	
		/*
		 * Write a Java program that reads a number in inches, converts it to meters.
		 * Note: One inch is 0.0254 meter.
		 * 
		 * Example: Input a value for inch: 1000 Expected Output: One inch is 25.4
		 * meters
		 */

		Scanner input = new Scanner(System.in);
		//request user to input value for inches
		System.out.print("Input a value for inches: ");
		double inch = input.nextDouble();
		double meters = inch * 0.0254;
		System.out.println(inch + " inch is " + meters + " meters");
		//close input
		input.close();
		
		
	
	} //main

}//class
