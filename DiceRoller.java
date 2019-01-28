import java.util.Random;
import java.util.Scanner;

public class DiceRoller {

	public static void main(String[] args) {
		//defines the input scanner and informs the user of the program's function.
		Scanner input = new Scanner (System.in);
		System.out.println("This program will roll some digital dice based on some parameters set by the user.");
		System.out.println();
		
		//boolean variable that will determine when the program will stop running.
		boolean finished = false;
		
		while(finished == false) {
			//asks the user for how many dice to roll and what sided dice are they.
			System.out.print("Please enter in how many dice you would like to roll: ");
			int diceNum = input.nextInt();
			System.out.print("Now, please enter in what sided dice are being rolled: ");
			int diceSide = input.nextInt();
			
			//Rolls the dice in a separate class. Afterwards, the result is displayed to the user.
			System.out.println("The value created from the dice rolls = " +rollDice(diceNum,diceSide));
			
			//asks user if they would like to run the program again.
			System.out.print("Would you like to run the program again? (y for yes | n for no): ");
			char c = input.next().charAt(0);
			
			//if else statement that determines if the program will run again.
			if (c == 'y' || c == 'Y') {
				System.out.println("Restarting Program.");
			} else if (c == 'n' || c == 'N') {
				finished = true;
			} else {
				System.out.println("ERROR: Invalid Response: Restarting Program.");
			}
			System.out.println();
		}
		//ending statement
		System.out.println("This concludes the program. Have a great day!");
	}
	
	public static int rollDice(int diceNum, int diceSide) {
		
		//declares the random method that will allow the program to generate a random integer
		Random rand = new Random();
		
		//declarations of variables needed for the class.
		int result = 0; //stores the total of the dice values being rolled
		int x = 0; //counter variable for this class.
		
		//rolls a value for each dice and stores the total into the result variable
		while (x < diceNum) {
			
			//generates a random integer value between 1 and the greatest value on the dice.
			int n = rand.nextInt(diceSide) + 1;
			// prints N to show what the dice landed at.
			System.out.println("Dice roll #"+(x+1)+" Lands on "+n);
			// adds dice roll value to result
			result += n;
			// adds one to the counter variable
			x++;
		}
		//returns the result to the main function.
		return result;
	}
	
}
