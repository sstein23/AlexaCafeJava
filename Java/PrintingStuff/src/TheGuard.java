import java.util.Scanner;
public class TheGuard {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		System.out.println("Choose a class: a) Warrior, b) Fairy, c) Mage ");
		int playerClass = userInput.nextInt();
		System.out.println("There is a guard in your way. What do you do? a) Fight him, b) Magically persuade the guard to leave his post, c) Throw an iceball at him to freeze him");
		int playerChoice = userInput.nextInt();
		if(playerClass == 1 && playerChoice == 1) {
			System.out.println("You easily overpowered the guard and you can now enter the building");	
			
		}
		else if (playerClass == 2 && playerChoice == 2) {
			System.out.println("You persuaded the guard a little too much and now he is following you around everywhere.");
			
		}
		else if(playerClass == 3 && playerChoice == 3) {
			System.out.println("The iceball was a little to big and destroyed the building that you wanted to go into");
		}
		userInput.close();
		
		
	}

}
