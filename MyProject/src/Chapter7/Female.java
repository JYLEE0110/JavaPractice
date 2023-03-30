package Chapter7;

public class Female extends Person {

	private String female;

	public Female() {
		super();
	}

	public Female(String name, String registrationNum, String female) {
		super(name, registrationNum);
		this.female = female;
	}

	public String getFemale() {
		return female;
	}

	public void setFemale(String female) {
		this.female = female;
	}

	// 자식클래스에만 있는 메소드
	private void printHair() {
		System.out.println("머리가 깁니다.");
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("성별은 " + female + "입니다.");
		printHair(); // 자식클래스에만 있는 메소드 호출
	}
}
