package Chapter7;

public class Person {

	private int currentYear = 2023;
	private String name;
	private String registrationNum;

	public Person() {

	}

	public Person(String name, String resistrationNum) {
		this.name = name;
		this.registrationNum = resistrationNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegistrationNum() {
		return registrationNum;
	}

	public void setRegistrationNum(String registrationNum) {
		this.registrationNum = registrationNum;
	}

	public void printInfo() {
		System.out.print("안녕하세요 저는 " + getName() + " 이고 " + calAge() + "살 입니다. ");
	}

	// 나이를 구하는 메솓,
	private int calAge() {

		// 주민번호 앞에2자리 추출
		String registCheck1 = getRegistrationNum().substring(0, 2);

		// 주빈번호 앞에 2자리 int형으로 변환
		int registCheck2 = Integer.valueOf(registCheck1);

		// 주민번호 8번째 자리가 1또는2일때 +1900, 3또는4일때 +2000
		char yearCheck = getRegistrationNum().charAt(7);

		if ((yearCheck == '1') || (yearCheck == '2')) {
			int birth = registCheck2 + 1900;
			return currentYear - birth;
		} else if ((yearCheck == '3') || (yearCheck == '4')) {
			int birth = registCheck2 + 2000;
			return currentYear - birth;
		} else
			return 0;
	}
}
