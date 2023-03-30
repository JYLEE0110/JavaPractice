package Chapter7;

public class PsersonMain {

	public static void main(String[] args) {

		Person[] persons = new Person[5];

		persons[0] = new Male("이주용1", "980110-1xxxxxx", "남성");
		persons[1] = new Female("이주용2", "970110-2xxxxxx", "여성");
		persons[2] = new Male("이주용3", "960110-1xxxxxx", "남성");
		persons[3] = new Male("이주용4", "000110-3xxxxxx", "남성");
		persons[4] = new Female("이주용5", "011110-4xxxxxx", "여성");

		for (Person person : persons) {
			person.printInfo();
			System.out.println("================================================");
		}
	}

}
