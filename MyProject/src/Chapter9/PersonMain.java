package Chapter9;

public class PersonMain extends Person {

	public static void main(String[] args) {

		Person[] person = new Person[2];

		person[0] = new Person("이주용1", "980110-1XXXXXX");
		person[1] = new Person("이주용2", "980110-1XXXXXX");

		checkPersonNum(person);

	}

	public static void checkPersonNum(Person[] person) {
		if (person[0].equals(person[1])) {
			System.out.println("주민등록번호가 같습니다.");
		} else {
			System.out.println("주민등록번호가 다릅니다.");
		}
	}

}
