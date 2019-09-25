public class Judger {
	private int total;
	
	private Person person = new Person();
	private Computer computer = new Computer();

	public void startGame() {
		
		System.out.println("******猜拳遊戲*******");
		
		System.out.println("1石頭 2剪刀 3布");
	}

	public void askName() {
		
		System.out.println("請輸入電腦姓名:");
		computer.inputName();
		
		System.out.println("請輸入玩家姓名:");
		person.inputName();
		System.out.println(computer.getPlayerName() + "VS" + person.getPlayerName());
	}

	public void playGame() {
		String ret = null;
		do {
			System.out.println("請" + person.getPlayerName() + "出拳");
			int personNum = person.myFist();
			System.out.println("請" + computer.getPlayerName() + "出拳");
			int computerNum = computer.myFist();
			
			if(personNum == computerNum){
				System.out.println("平手");
			}else if(personNum == 1 && computerNum == 2 || personNum == 2 && computerNum == 3 || personNum == 3 && computerNum == 1){
				System.out.println(person.getPlayerName() + "獲勝");
				person.setWinningTimes(person.getWinningTimes()+1);
			}else{
				System.out.println(computer.getPlayerName()+ "獲勝");
				computer.setWinningTimes(computer.getWinningTimes()+1);
			}
			total++;
			System.out.println("是否繼續?(y/n)");
			ret = person.askContinu();
		} while (ret.equals("y"));
	}

	public void finalResult() {
		System.out.println("一共玩了" + total+"次");
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