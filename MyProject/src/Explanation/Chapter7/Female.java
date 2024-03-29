package Explanation.Chapter7;

public class Female extends Person {

	private String msg;
	
	Female(String name, String personNum){
		super(name, personNum);
		this.msg = "안녕!";
	}

	public Female(String name, String personNum, String msg) {
		super(name, personNum);
		this.msg = msg;
	}

	@Override
	public void printGreeting() {
		super.printGreeting();
		System.out.println(msg);
		System.out.println();
	}
}
