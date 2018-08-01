/*Jasmine S. Allen
* July 31, 2018
* Program: Plays rock, paper, scissors with user.
*/
public class RockPlayer extends Player {

	public RockPlayer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}

}
