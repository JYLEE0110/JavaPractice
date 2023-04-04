package Chapter9;


//class Person {
//	 String name;
//	 String personNumber;
//	}
//
//1. 위 Person 클래스의 equals() 메소드를 오버라이딩해서 주민등록번호가 같으면 인스턴스로 판별하는 프로그램을 만들어봅시다. 

public class Person {
	String name;
	String personNumber;

	Person() {

	}

	Person(String name, String personNumber) {
		this.name = name;
		this.personNumber = personNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPersonNumber() {
		return personNumber;
	}

	public void setPersonNumber(String personNumber) {
		this.personNumber = personNumber;
	}

	// Object 클래스 equals 메소드 오버라이딩
	@Override
	public boolean equals(Object obj) {

		// 반환값 false로 초기화
		boolean result = false;

		// 분기문 안에 ture일때만 동작하게  
		if ((obj != null) && (obj instanceof Person p)) {
			// 형 변환
			p = (Person) obj;
			result = personNumber.equals(p.personNumber);
		}
		// if문을 안거치면 false, 거치면 true
		return result;
	}
}
