/*Jasmine S. Allen
* July 31, 2018
* Program: Plays rock, paper, scissors with user.
*/
public abstract class Player {
	private String name;
	
	public Player(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract Roshambo generateRoshambo();

}
