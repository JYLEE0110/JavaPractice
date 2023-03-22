package Chapter1;

class MemberInfo{
	String name;
	int age;
	double height;
	boolean hasBook;
	
	MemberInfo(){}
	
	MemberInfo(String name, int age, double height, boolean hasBook){
		this.name = name;
		this.age = age;
		this.height = height;
		this.hasBook = hasBook;
	}
	
	public void displayInfo() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("height : " + height);
		System.out.println("hasBook : " + hasBook);
	}
}

public class Member {

	public static void main(String[] args) {
		MemberInfo student1 = new MemberInfo("JY LEE", 26, 189.9, true);
		student1.displayInfo();
	}

}
