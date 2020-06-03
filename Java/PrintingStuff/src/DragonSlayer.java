
public class DragonSlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int playersStrength = 12;
		int dragonsHP = 20;
		boolean hasSword = true;
		if (playersStrength > dragonsHP) {
            System.out.println("You befriended the penguin!");
        }
		else if (hasSword) {
			System.out.println("You're not strong enough to defeat the mighty penguin. However, you must remember your magical object and use it to befriend the beast.");
		}
		else {
			System.out.println("The great and mighty penguin  did not want to be your friend, sorry.");
		}
		
		
	}

}
