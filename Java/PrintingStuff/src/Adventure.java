import java.util.Scanner;
import java.util.Random;
public class Adventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randomGenerator = new Random();
		int playerLevel = 1;
		String playerName = "MILLIFICENT";
				double playerHealth = 10.0;
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is your character's name?");
		playerName = userInput.nextLine();
		System.out.println("Welcome " + playerName + "!");
		System.out.println("Before you is a large cave. Darkness is falling. Dare you enter the magical cave of unicorns?");
		System.out.println("1. Enter the Cave of Unicorns");
		System.out.println("2. Run away to the land of majestic penguins");
		int playerChoice;
		playerChoice = userInput.nextInt();
		if(playerChoice == 1){
			System.out.println("You enter the cave, already frightened of what awaits you, but determined to press on.");
			playerLevel--;	
			System.out.println("You travel forward into the bright tunnel of light. You feel something furry press against your leg...");
			System.out.println("You think it's a dog and reach down to pet it, but you hadn't realized that it was a snarling wolf. Then the wolf growls and others from its pack appear, gearing up to attack you.");
			int wolfDamage;
			wolfDamage = randomGenerator.nextInt(3);
			playerHealth -= wolfDamage;
			System.out.println("The wolves attack and frighten you for " + wolfDamage + " HP.");
			System.out.println("You have " + playerHealth + " health remaining.");
			
			System.out.println("You pick yourself up from the cave floor, grateful th wolves left for other prey and did not bite you.");
			System.out.println("As the cave narrows and you manage to squeeze through the an opening into a very large majestic cavern.");
			System.out.println("Before you is a majestic unicorn and a large treasure chest.");
		
			boolean hasSword = false;
			System.out.println("1. Pet the unicorn.");
			System.out.println("2. Ignore the unicorn and instead opening the treasure chest.");
			playerChoice = userInput.nextInt();
			
			if(playerChoice == 1) {
				System.out.println("You pet the unicorn wanting it to soothe your frightened nerves.");
				System.out.println("The unicorn nickers and tells you that because you petted it, then you can open the treasure chest. ");
				System.out.println("Inside the chest you find a magical fluffy llama stuffed animal. The unicorn says that it will protect you from any future dangers. ");
				 hasSword = true;
				 
				 System.out.println("You leave the cavern, cuddling with your new fluffy llama stuffed animal.");
				 System.out.println("Suddenly you find youself rounding a corner into another large cavern.");
				 System.out.println("Then you see not a majestic unicorn, but a large, sleeping, dragon.");
				 System.out.println("As you turn to leave your foot accidentally kicks a rock and the dragon abruptly wakes up.");
				 System.out.println("1. Befriend the dragon");
				 System.out.println("2. Run for your life");
				 if (playerChoice == 1) {
					 if (hasSword) {
					System.out.println("You throw the llama in front of you.");
					 System.out.println("Before you ask the dragon how they are doing and they say that they were doing very well before you came and woke them up.");
					 System.out.println("You tell the dragon that you are sorry and that you'll be taking your leave.");
					 System.out.println("The dragon tells you that before you leave, that you should take the object in the corner. ");
					 System.out.println("As you inspect it you realize it is the smallest treasure chest you've ever seen and that it contains a little potion");
				 }
					 else {
						 System.out.println("The dragon falls back asleep before you can approach it, clearly thinking it's a dream");
					 }
				 }
				 else {
					System.out.println("You run away, finding a team of unicorns awaiting you. They kidnap you, for ignoring the unicorn from before.");
					
					 
				 }
				 
			}
			
		}
		
		else  {
            // The player runs home
            System.out.println(playerName + " runs home and goes to sleep.");
            System.exit(0);
        }
		
	}

}
