package Zool;

import java.awt.List;
import java.util.Scanner;

public class Navigate extends Map {

	///////////////// Attributes

	public int react; 
	
	public String onTheMove;
	
	/////////////// Constructors
	public Navigate() {
		//react = onTheMove.stream().filter(lon -> lon.intOr ).map();
		onTheMove = gameInput();
		}

	////////////// Methods
	
	/*public int gameReaction() {
		if(onTheMove)
	}*/

	private boolean intOrChar(String onTheMove) {
		String[] converted = onTheMove.split("");
		for(int i=0 ; i<converted.length;i++) {
			if(i > 0 && i<10) {
				return true;
			}
		} return false;
		
	}
	
	private String gameInput() {
		Scanner userInput = new Scanner(System.in);

		System.out.println("How many tiles will you travel?");

		boolean isANumber = userInput.hasNextInt(); // checks to see if integer is entered

		if (isANumber) {
			int numberOfTiles = userInput.nextInt();

			userInput.nextLine();// give you chance to put another value in

			System.out.println("Enter your direction: ");
			String direction = userInput.nextLine();

			userInput.close();

			String onTheMove = direction + " past " + (int) numberOfTiles + " boulders";
			return onTheMove; //this will be used in the above code to create the int of React
		} else {
			userInput.close();
			return "Error: Please enter a valid number";
		}

	}
}
