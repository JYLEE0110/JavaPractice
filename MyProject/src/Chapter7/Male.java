package Chapter7;

public class Male extends Person {

	private String male;

	public Male() {
		super();
	}

	public Male(String name, String registrationNum, String male) {
		super(name, registrationNum);
		this.male = male;
	}

	public String getMale() {
		return male;
	}

	public void setMale(String male) {
		this.male = male;
	}

	// 자식클래스에만 있는 메소드
	private void printHair() {
		System.out.println("머리가 짦습니다.");
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("성별은 " + male + "입니다.");
		printHair();// 자식클래스에만 있는 메소드 호출
	}
}
