/*Jasmine S. Allen
* July 31, 2018
* Program: Plays rock, paper, scissors with user.
*/
public class RandomPlayer extends Player {

	public RandomPlayer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Roshambo generateRoshambo() {
	
		int randomNum = (int) Math.random() * (3 - 1) + 1;
		
		switch(randomNum)
		{
			case 1:  return Roshambo.ROCK;
			case 2:  return Roshambo.PAPER;
			case 3:  return Roshambo.SCISSORS;
		}

		return null;
	}

}
