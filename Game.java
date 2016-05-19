
public class Game 
{
	private int Score;
	private String PlayerName;
	private int NumberofLives;
	
	Game (String playername)
	{
		this.PlayerName=playername;
	}

	public int getScore() {
		return Score;
	}

	public void setScore(int score) {
		Score = score;
	}

	public String getPlayerName() {
		return PlayerName;
	}

	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}

	public int getNumberofLives() {
		return NumberofLives;
	}

	public void setNumberofLives(int numberofLives) {
		NumberofLives = numberofLives;
	}

}
