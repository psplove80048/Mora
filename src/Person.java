import java.util.Scanner;

public class Person {
	private String playerName;
	private int winningTimes;
	
	public void inputName() {
		Scanner input = new Scanner(System.in);
		String name = input.next();
		this.playerName = name;
	}

	
	public int myFist() {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		return number;
	}

	public String askContinu() {
		Scanner input = new Scanner(System.in);
		String ret = input.next();
		return ret;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}


	public int getWinningTimes() {
		return winningTimes;
	}


	public void setWinningTimes(int winningTimes) {
		this.winningTimes = winningTimes;
	}
}
