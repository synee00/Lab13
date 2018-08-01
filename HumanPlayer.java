import java.util.*;
/*Jasmine S. Allen
* July 31, 2018
* Program: Plays rock, paper, scissors with user.
*/
public class HumanPlayer extends Player {

	private Scanner scan;

	
	public HumanPlayer(String name, Scanner scan) {
		super(name);
		this.scan = scan;
	}

	@Override
	public Roshambo generateRoshambo() {
		//get input from user
		String choice = Validator.getStringMatchingRegex(scan, 
				"Please enter your move (ROCK, PAPER, or SCISSORS): ", 
				"rock|paper|scissors|ROCK|PAPER|SCISSORS|Rock|Paper|Scissors" );
		
		switch(choice.toUpperCase())
		{
			case "ROCK":  return Roshambo.ROCK;
			case "PAPER":  return Roshambo.PAPER;
			case "SCISSORS":  return Roshambo.SCISSORS;
		}
		return null;
		
	}

}
