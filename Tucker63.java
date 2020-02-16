package tucker6;

import java.util.Scanner;

public class Tucker63 {
	//Mitchell Tucker #SPC ID 2429488
	//This script has a method that holds items in a grocery list and 
	//Calculates the total bill
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int quantity; //declare quantity
		int amtItems; //declare amount of items user is purchasing
		double price; //declare price
		double total = 0; //declare total and initialize it
		boolean taxable; //declare a boolean if item is taxable
		System.out.println("How many items are being purchased? "); //user inputs how many items they have
		amtItems = input.nextInt();
		
		
		for (int items = 1; amtItems >= items ; items++) { //loops for unit price, quantity, taxable
			//has a tracker for each item price and stops when it equals the amount of items the user inputs
				
			System.out.println("Enter the price of item number " + items + ": ");
			price = input.nextDouble(); //price is initialized
			System.out.println("What is the quantity of this item?: ");
			quantity = input.nextInt(); //quantity is initialized
			System.out.println("Is the item taxable true/false ?");
			taxable = input.nextBoolean(); //taxable is initialized
			
			
			total = total + item(quantity, price, taxable); //invokes the method item and outputs the arguments with their calculations
			//and it keeps a tracker of the grand total and displays it at the end.
		}

		System.out.printf("Grand total is: $%.2f\n", total); //displays grand total
		
	}
	
	public static double item(int q, double p, boolean taxable) { //method that returns the total of the items the user is purchasing whether its taxable
		//or not
		double subtotal = (q * p);
		double tax = subtotal * 0.07;
		double total = subtotal + tax;
		if (taxable == true) {
		System.out.printf("Subtotal: $%.2f\n", subtotal);
		System.out.printf("Sales tax: $%.2f\n", tax);
		System.out.printf("Total: $%.2f\n", total);
		}
		if (taxable == false) {
			tax = 0.00;
			total = subtotal;
			System.out.printf("Subtotal: $%.2f\n", subtotal); //prints subtotal with currency/2 decimals
			System.out.printf("Sales tax: $%.2f\n", tax); //prints sales tax as currency/2 decimals
			System.out.printf("Total: $%.2f\n", subtotal); //prints the total of the items as currency/2 decimals
			
		}
		return total;
	}
	
}
