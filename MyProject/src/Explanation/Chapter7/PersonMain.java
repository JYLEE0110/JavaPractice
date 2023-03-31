package Explanation.Chapter7;

public class PersonMain {

	public static void main(String[] args) {
		
		Male m1 = new Male("이주용","980110-15XXXXX","수강생입니다.");
		m1.printGreeting();
		
		Person p1 = (Person)m1;
		p1.printGreeting();
		
		Person p2 = new Female("이주용2", "020517-4000000");
		p2.printGreeting();
	}

}
