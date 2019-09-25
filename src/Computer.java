import java.util.Scanner;

public class Computer {
	
	
	private String comName;
	private int winningTimes;
	public void inputName() {
		Scanner input = new Scanner(System.in);
		String name = input.next();
		this.comName = name;
	}

	
	public int myFist() {
		return (int)(Math.random()*3)+1;
	}


	public String getComName() {
		return comName;
	}


	public void setComName(String comName) {
		this.comName = comName;
	}


	public int getWinningTimes() {
		return winningTimes;
	}


	public void setWinningTimes(int winningTimes) {
		this.winningTimes = winningTimes;
	}
}