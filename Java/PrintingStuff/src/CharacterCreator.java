import java.util.Scanner;
public class CharacterCreator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner playerInput;
		playerInput = new Scanner(System.in);
		String playerName;
		double playerHealth;
		System.out.println("What is your characters name?");
		playerName = playerInput.nextLine();
		System.out.println("How much health does " + playerName + " have?");
		playerHealth = playerInput.nextDouble();
		System.out.println("Welcome " + playerName + " you have" + playerHealth + " health.");
	}

}
