public class Judger {
	private int total;
	
	private Person person = new Person();
	private Computer computer = new Computer();

	public void startGame() {
		
		System.out.println("******�q���C��*******");
		
		System.out.println("1���Y 2�ŤM 3��");
	}

	public void askName() {
		
		System.out.println("�п�J�q���m�W:");
		computer.inputName();
		
		System.out.println("�п�J���a�m�W:");
		person.inputName();
		System.out.println(computer.getPlayerName() + "VS" + person.getPlayerName());
	}

	public void playGame() {
		String ret = null;
		do {
			System.out.println("��" + person.getPlayerName() + "�X��");
			int personNum = person.myFist();
			System.out.println("��" + computer.getPlayerName() + "�X��");
			int computerNum = computer.myFist();
			
			if(personNum == computerNum){
				System.out.println("����");
			}else if(personNum == 1 && computerNum == 2 || personNum == 2 && computerNum == 3 || personNum == 3 && computerNum == 1){
				System.out.println(person.getPlayerName() + "���");
				person.setWinningTimes(person.getWinningTimes()+1);
			}else{
				System.out.println(computer.getPlayerName()+ "���");
				computer.setWinningTimes(computer.getWinningTimes()+1);
			}
			total++;
			System.out.println("�O�_�~��?(y/n)");
			ret = person.askContinu();
		} while (ret.equals("y"));
	}

	public void finalResult() {
		System.out.println("�@�@���F" + total+"��");
		System.out.println(computer.getPlayerName()+":"+computer.getWinningTimes() + "VS" +person.getPlayerName()+":"+ person.getWinningTimes());
		
	}
	public static void main(String[] args) {
		Judger j = new Judger();
		j.startGame();
		j.askName();
		j.playGame();
		j.finalResult();
	}
}