import java.util.*;
/*Jasmine S. Allen
* July 31, 2018
* Program: Plays rock, paper, scissors with user.
*/
public class RoshamboApp {
	
	/*public static final int ROCK = 1;
	public static final int PAPER = 2;
	public static final int SCISSORS = 3;
*/
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		RockPlayer dwayne = new RockPlayer("Dwayne");
		RandomPlayer rando = new RandomPlayer("Lando");
		
		//Roshambo playerChoice = dwayne.generateRoshambo();
		//System.out.println(playerChoice);
		
		System.out.println("Let's play a game.");
		System.out.println();
		 String[] arra = new String[5];

		  arra[0] = "\t +\"\"\"\"\"+ ";
		  arra[1] = "\t[| T T |]";
		  arra[2] = "\t |  n  |";
		  arra[3] = "\t |  U  |";
		  arra[4] = "\t +-----+";

		  for (int i = 0; i < 5; i++) {
		   System.out.println(arra[i]);
		  }
		  
		  System.out.println();
		  
		  String choice = "yes";
		  String username = "";
		  String opponent = "";
		  Roshambo computerMove;
		  Roshambo userMove;
		  int userWins = 0;
		  int userLoses = 0;
		  int userTies = 0;
		  
		  //get user info
		  username = Validator.getString(scan, "Please enter your name: ");
		  HumanPlayer human = new HumanPlayer(username, scan);
	  
		  while(choice.matches("[yY].*"))
		  {
			 //opponent select
			 opponent = Validator.getStringMatchingRegex(scan, "Choose your opponent! "
			 							+ "Dwayne or Roxi?\n", "DWayne|Roxi|dwayne|roxi");
			 //play round & display winner
			 
			 if(opponent.matches("Roxi|roxi"))
			 {
				computerMove = rando.generateRoshambo();
				userMove = human.generateRoshambo();
				
				System.out.println("You have chosen: " + userMove);
				System.out.println(opponent + " has chosen: " + computerMove);

				
				if(userMove == computerMove)
				{
					System.out.println("\nYou have TIED.");
					userTies++;
				}
				else if(userMove == Roshambo.PAPER)
				{
					if(computerMove == Roshambo.ROCK)
					{
						System.out.println("\nYou WON!");
						userWins++;
					}
					else
					{
						System.out.println("\nYou LOSE!");
						userLoses++;
					}
					
					
				}
				else if(userMove == Roshambo.SCISSORS)
				{
					if(computerMove == Roshambo.PAPER)
					{
						System.out.println("\nYou WON!");
						userWins++;
					}
					else
					{
						System.out.println("\nYou LOSE!");
						userLoses++;
					}
				}
			 }
			 else
			 {
				 	computerMove = dwayne.generateRoshambo();
					userMove = human.generateRoshambo();
					
					System.out.println("You have chosen: " + userMove);
					System.out.println(opponent + " has chosen: " + computerMove);

					if(userMove == computerMove)
					{
						System.out.println("\nYou have TIED.");
						userTies++;
					}
					else if(userMove == Roshambo.PAPER)
					{
						System.out.println("\nYou WON!");
						userWins++;
					}
					else if(userMove == Roshambo.SCISSORS)
					{
						System.out.println("\nYou LOSE!");
						userLoses++;
					}
			 }
				 
			 
			 
			 //record score
			 
			 System.out.println("\nScore ");
			 System.out.println("=====");
			 System.out.println("Wins: "+ userWins);
			 System.out.println("Loses: "+ userLoses);
			 System.out.println("Ties: "+ userTies);


			  
			  //ask for another round
			  choice = Validator.getStringMatchingRegex(scan, "Play again? ", "[yY].*");
		  }
		  
		  System.out.println("Thanks for playing!");
		
	}

}
