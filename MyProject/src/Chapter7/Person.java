package Chapter7;

//1. Person 이라는 클래스를 정의해봅시다. 
//① 이름을 저장하는 변수, 주민등록번호를 저장하는 변수를 정의해봅시다.
//② 인사하는 메소드를 정의해봅시다.
//- “안녕하세요. 저는 OOO입니다. 00살 입니다.”라는 문자열이 출력하도록 정의합시다
//
//2. Person 클래스를 상속해서 확장하는 새로운 클래스 Male 클래스와 Female 클래스를 정의 해봅시다. 
//① 각 클래스는 상속 받은 멤버 외에 추가적인 변수와 메소드를 추가해서 새로운 클래스를 정의해봅시다.
//② 각 클래스는 상속 받은 멤버 외에 추가적인 변수와 메소드를 추가해서 새로운 클래스를 정의해봅시다.
//③ Person 클래스에서 정의된 인사하는 메소드를 오버라이딩 해봅시다.
//④ Person 클래스에 생성자를 정의해서 인스턴스 변수들을 초기화 해봅시다.
//
//3. main()메소드를 정의해봅시다. 
//① Person 클래스를 상속받은 Male클래스와 Female클래스를 이용해서 인스턴스를 생성해 봅시다.
//② 생성된 인스턴스들을 이용해서 메소드를 호출해봅시다

public class Person {

	private static final int CURRENT_YEAR = 2023;
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
		System.out.print("안녕하세요 저는 " + name + " 이고 " + calAge() + "살 입니다. ");
	}

	// 나이를 구하는 메솓,
	private int calAge() {

		// 주민번호 앞에2자리 추출
		String registCheck1 = registrationNum.substring(0, 2);

		// 주빈번호 앞에 2자리 int형으로 변환
		int registCheck2 = Integer.valueOf(registCheck1);

		// 주민번호 8번째 자리가 1또는2일때 +1900, 3또는4일때 +2000
		char yearCheck = registrationNum.charAt(7);

		if ((yearCheck == '1') || (yearCheck == '2')) {
			int birth = registCheck2 + 1900;
			return CURRENT_YEAR - birth;
		} else if ((yearCheck == '3') || (yearCheck == '4')) {
			int birth = registCheck2 + 2000;
			return CURRENT_YEAR - birth;
		} else
			return 0;
	}
}
