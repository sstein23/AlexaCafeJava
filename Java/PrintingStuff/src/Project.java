import java.util.Scanner;
public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		System.out.println("What animal do you want to be 1) a Bornean orangutan, 2) an Ili Pika, 3) a giant otter, or 4) a Pangolin");
		int playerClass = userInput.nextInt();
		
		
		if(playerClass == 1) {
			System.out.println("You are a Bornean orangutan and you live in lowland rainforests and tropical, swamp and mountain forests ");	
			System.out.println("Today you are going to find yourself a tree to build your nest in.");
			System.out.println("As you hunt around for a tree to build a nest in, you see strange, big, very loud, things in the distance. They look like they are doing something to the trees  because all of the trees around them are falling. ");
			System.out.println("Should you: 1) Forage for food, or 2) Move on to find a tree");
			int playerChoice = userInput.nextInt();
			if(playerChoice == 1) {
				System.out.println("You climb over to the Durian tree that is nearby and find a juicy piece of fruit. ");
				System.out.println("The only problem is that it is out of reach. So you do what most orangutans do, and break off a nearby branch to use it as a tool to get the fruit.");
				System.out.println("With a full stomach you make your self a nest in a tree that you have found.");
				System.out.println("You go to sleep for the night, curling up in your nest. Then suddenly after a few hours, you are awakened by a roaring, thundering sound.");
				System.out.println("It is the strange machine from before, except this time it is coming towards you.");
				System.out.println("In your fear, you climb away from the machine with great haste, but not before calling out to the other orangutans in the area alerting them of the danger.");
				System.out.println("Then after you are safely out of danger, you make yourself another nest and go to sleep.");
			}
			else if(playerChoice == 2) {
				System.out.println("You make your self a nest in a tree that you have found and take a short nap. ");
				System.out.println("When you awaken from your nap, you are hungry, so you climb over to the Durian tree that is nearby and find a juicy piece of fruit that is very scrumptious.");
				System.out.println("Then when you are about to settle in to sleep for the night you hear a roaring, thundering sound.");
				System.out.println("When you look you see the strange machine from before, except this time it is coming towards you.");
				System.out.println("In your fear, you climb away from the machine with great haste, but not before calling out to the other orangutans in the area alerting them of the danger.");
				System.out.println("Then after you are safely out of danger, you make yourself another nest and go to sleep.");
			}
			System.out.println("Background");
			System.out.println("• Orangutans play a critical role in seed dispersal, keeping forests healthy. Over 500 plant species have been recorded in their diet.Orangutans play a critical role in seed dispersal, keeping forests healthy. Over 500 plant species have been recorded in their diet.");
			System.out.println("• Orangutans have an extremely low reproductive rate because they have a long interbirth interval, single offspring, and take a long time to reach sexual maturity.");
			System.out.println("• The Bornean orangutan differs in appearance from the Sumatran orangutan, with a broader face and shorter beard and also slightly darker in color. Three subspecies are recognized, each localized to different parts of the island. ");
			System.out.println("• Three subspecies are recognized, each localized to different parts of the island ");
			System.out.println("• Northwest Bornean orangutans are the most threatened subspecies.");
			
		}
		else if (playerClass == 2) {
			System.out.println("You are a Pika and you live at high elevations—between 9,200 and 13,450 feet.");
			System.out.println("Today, you are just exploring the mountains in Xang, China.");
			System.out.println("Suddenly you see some weird animals down below.");
			System.out.println("Curious, you go down to take a closer look, and they are making foreign sounds to each other. ");
			System.out.println("Then one of them looks up at you with some sort of a machine in their hands that makes sounds and flashes bright lights at you.");
			System.out.println("Should you: 1) wander away from them and go and find food or 2) stay with them and observe them more.");
			int playerChoice = userInput.nextInt();
			if (playerChoice == 1) {
			System.out.println("You decide to wander off to search for food and go to your burrow to eat some hay that you have stockpiled for these cold winter months.");
			System.out.println("Then after you are no longer hungry, you go to the strange creatures again, observing them quietly from a perch on the rocks.");
			System.out.println("Once you are bored of the strange creatures and their flashing things, you go back to your burrow and go to sleep.");
			
			}
			else if(playerChoice == 2) {
				System.out.println("Once you are bored of watching the strange animals, their weird flashing things, and their odd behavior, you go to your burrow.");
				System.out.println("In your burrow, you eat the hay that you had stockpiled for these cold winter months.");
				System.out.println("And after eating your hay, you go to to sleep..");
			}
		System.out.print("Background");	
		System.out.println("• First discovered in 1983, no Ili pikas had been seen in over 20 years before they were rediscovered late in 2014 by a group of scientists in China. ");
		System.out.println("• They are only found in a few areas of western China and it is estimated that there are only about 1,000 left in the wild, with the numbers dropping.");
		System.out.println("•The Ili pika (Ochotona iliensis), is a type of tiny, mountain-dwelling mammal with a teddy bear face. ");
		
		}
		else if(playerClass == 3) {
			System.out.println("You are a giant otter and you live in  rivers and streams that hold freshwater in South America.");
			System.out.println("Today, you are wandering around your stream with the other otters. ");
			System.out.println("All of you are chittering and chattering about the best food and other things, and the big machiness are still going around the river.");
			System.out.println("Do you want to: 1) stay here, or 2) go and find food.");
			int playerChoice = userInput.nextInt();
			if (playerChoice == 1) {
				System.out.println("You have decided that you want to stay here. Suddenly you see an otter getting to close to one of those human machines. ");
				System.out.println("Oh No! The otter got caught in the net that was going along with the machine. Luckily a group of otters are able to rescue their friend.");
				System.out.println("Now you are hungry from all the excitement, and you swim around, hunting for food, before you find a juicy fish to eat");
				System.out.println("then you go back to the group of otters.");
			}
			else if(playerChoice == 2) {
				System.out.println("You've decided that you want to go find food. You swim around, hunting for food, before you find a juicy fish to eat");
				System.out.println("Then when you go back to where you were before with the other otters. Suddenly you see an otter getting to close to one of those human machines.");
				System.out.println("Oh No! The otter got caught in the net that was going along with the machine. Luckily a group of otters are able to rescue their friend.");
				System.out.println("Then you go back to the group of otters.");
			}
			
			System.out.println("You are tired so you go to your den, as the sun goes down, and go to sleep.");
			System.out.println("Background");
			System.out.println("• Giant otters do not store food. When they catch a prey, they will find a peaceful place (\"picnic spot\") to eat it.");
			System.out.println("• Giant otters are very loud animals. They produce around 9 different types of sounds, such as quick barks, explosive snorts, wavering screams or low growls, to inform other otters about potential danger (alarm sound) or to send aggressive warning.");
			System.out.println("• Giant otters live 12 years in the wild and up to 21 years in captivity.");
			System.out.println("• They use their whiskers to detect the prey in the water by identifying changes in the water pressure and current.");
			}
		else if(playerClass == 4) {
			System.out.println("You are a pangolin and you live in Africa south of the Sahara Desert or in Asia.");
			System.out.println("Tonight, you are exploring and hunting for food to eat.");
			System.out.println("First, you go and use your keen sense of smell to find termite or ant nests. Once you find one, you go over to it and use your long tongue to eat the ants from their nest.");
			System.out.println("Suddenly, you see a friend of yours going toward an enclosed cage, without seeing it, before you could warn your friend, they are captured.");
			System.out.println("You are sad with your lost friend, but you need to go back to your burrow, so you head back to your burrow and go to sleep.");
			System.out.println("Side note: The  friend was found later got released back into the wild without harm.");
			System.out.println("Background");
			System.out.println("When a mother pangolin feels threatened, she will roll up around her baby, which will also roll into a ball.");
			System.out.println("A baby pangolin is known as a pangopup.");
			System.out.println("Pangolins do not fight with their sharp claws, but they can spray a foul smelling liquid, just as a skunk does.");
			System.out.println("The word ‘pangolin’ comes from the Malay word ‘penggulung’, which means ‘one that rolls up’.");
			System.out.println("The mammal can consume up to 20,000 ants a day. That’s about 73 million ants a year!");
		}
		userInput.close();
	}

}
