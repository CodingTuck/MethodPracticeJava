package tucker6;

import java.util.Scanner;

public class Tucker64 {
	//Mitchell Tucker SPC ID#2429488
	//This is a creative project that demonstrates my knowledge of method overloading.
	//This program is russian roulette.. but rather than ammo, the user picks between 1 and 6 and if they pick the "Lucky number" then they 
	//are no longer... dun dun dun.
	
	//Overloaded methods can be invoked even if the methods return the same data type, but the parameters of the method must be different.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int luckyNumber = 0; //declare and initialize luckyNumber
		int luckyNumber2 = 0; //declare and initialize luckyNumber2
		int luckyNumber3 = 0; //declare and initialize luckyNumber3
		int gameResult; //This will hold the method call

		for (int level = 1; luckyNumber != 2 && luckyNumber2 != 2 && luckyNumber3 != 2 && level < 4; level++) { // declare level of game, parameters for game to run
			//and increase level after each successful attempt
			if (level <= 1) { //runs automatically since level is initialized with 1
				System.out.println("Thanks for playing russian roulette. You are on level " + level);
				System.out.println("Please enter an number between 1 and 6: ");
				luckyNumber = input.nextInt(); //reinitializes luckyNumber with user input
				gameResult = alive(luckyNumber); //calls method alive and invokes overload method 1 holding 1 int argument
			}
			if (level > 1 && level < 3) { 
				System.out.println("Thanks for playing russian roulette. You are on level " + level);
				System.out.println("Please enter two numbers between 1 and 6: ");
				luckyNumber = input.nextInt(); //holds new variable 
				luckyNumber2 = input.nextInt();//holds a second variable
				gameResult = alive(luckyNumber, luckyNumber2); //calls method alive and invokes overload method 2 holding 2 int arguments
			}
			if (level > 2 && level < 4) {
				System.out.println("Thanks for playing russian roulette. You are on level " + level);
				System.out.println("Please enter 3 numbers between 1 and 6: ");
				luckyNumber = input.nextInt(); //holds new variable
				luckyNumber2 = input.nextInt();// holds new variable
				luckyNumber3 = input.nextInt();//holds new variable
				gameResult = alive(luckyNumber, luckyNumber2, luckyNumber3);//calls method alive and invokes overload method 3 holding 3 int arguments
			}
		}
	}
	public static int alive(int lucky1) { //overload method one which returns if int gameResult above has one user input 
		if (lucky1 != 2) {
			System.out.println("You chose number " + lucky1 + ": You have stayed alive!");
		}
		else {
			System.out.println("You have died.");
		}
		return lucky1; //returns above statements
	}

	public static int alive(int lucky1, int lucky2) { //overload method two which returns if int gameResult above has 2 user inputs
		
		if (lucky1 != 2 && lucky2 != 2) {
			System.out.println("You chose number " + lucky1 + " and " + lucky2 + ": You have stayed alive!");
		}
		else {
			System.out.println("You have died.");

			
		}

		return lucky1; //returns above statements

	}

	public static int alive(int lucky1, int lucky2, int lucky3) { //overload method three which returns if int gameResult above has 3 user inputs
		if (lucky1 != 2 && lucky2 != 2 && lucky3 != 2) {
			System.out.println("You chose number " + lucky1 + ", " + lucky2 + " and " + lucky3 + ": You have won and stayed alive!");
		}
		else {
			System.out.println("You have died.");

		}

		return lucky1;

	}

}
