package Chapter2;

class Person {
	String name;
	String phoneNum;
	String registrationNum;

	Person(){}

	Person(String name, String phoneNum, String registrationNum){
		this.name = name;
		this.phoneNum = phoneNum;
		this.registrationNum =  registrationNum;
	}
	
	void displayInfo() {
		System.out.println("Infomation : " + name + " , " + phoneNum + " , " + registrationNum);
	}
}

public class PersonPractice {

	public static void main(String[] args) {

		Person student1 = new Person("JYLEE","010-5420-xxxx","980110-1xxxxxx");
		student1.displayInfo();
		
	}

}
