
import java.util.Scanner;

public class Computer extends Player{
	@Override
	public void inputName() {
		Scanner input = new Scanner(System.in);
		String name = input.next();
		setPlayerName(name);
	}

	@Override
	public int myFist() {
		return (int)(Math.random()*3)+1;
	}
}
