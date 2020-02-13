package tucker6;

import java.util.Scanner;

public class Tucker62 {
	//Mitchell Tucker SPC ID #2429488
	//This program has one main method and 2 other methods that perform calculations on a rectangle
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the length and width of the rectangle: ");
		
		double length = input.nextDouble(); //declare length
		double width = input.nextDouble(); //declare width
		double perim = perimeter(length, width); //call method perimeter
		double areaTotal = area(length, width); //call method area
		
		System.out.printf("The area of the rectangle is: %.4f", areaTotal); //print area 4 decimal places

	
	}
	
	public static double perimeter(double lgth, double wdth) { //method perimeter
		double total = (lgth * 2) + (wdth * 2);
		System.out.printf("The perimeter of the rectangle is: %.4f \n", total); //returns the formatted line with
																				//a new line before area
		return total;
		
	}
	
	public static double area(double length1, double length2) { //method area
		return (length1 * length2); //returns area
	}

}