package Explanation.Chapter7;

public class Male extends Person {

	private String msg;
	
	public Male(String name, String personNum, String msg) {
		super(name, personNum);
		this.msg = msg;
	}

	@Override
	public void printGreeting() {
		super.printGreeting();
		System.out.println(msg);
		System.out.println();
//		hello();
	}
	
	void hello() {
		System.out.println("안녕하세요");
	}
	
}
