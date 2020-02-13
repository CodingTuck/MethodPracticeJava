package tucker6;

import java.util.Scanner;

public class Tucker61 {
	//Mitchell Tucker #SPC ID 2429488
	//This program contains a main method and another method that returns a positive int.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter two numbers to find out the difference: ");

		int num1 = input.nextInt(); //declare user variable
		int num2 = input.nextInt(); //declare user variable
		int diff = difference(num1, num2); //call the difference method

		if (num1 < num2) {
			diff = (num2 - num1); /*diff1 and diff2 values are assigned to num1 and num2 returning
			a positive int within the argument*/
		}
		System.out.println("Difference of " + num1 + " and " + num2 + " is: " + diff);

	}
	public static int difference(int diff1, int diff2) { //method difference containing arguments
		return diff1 - diff2; //return value
	}


}

