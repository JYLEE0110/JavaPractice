package Chapter1;

//① String 타입의 이름을 저장할 수 있는 변수 name을 정의해봅시다.
//② int 타입의 나이를 저장할 수 있는 변수 age를 정의해봅시다.
//③ double 타입의 키를 저장할 수 있는 변수 height를 정의해봅시다.
//④ boolean 타입의 JAVA책의 보유 여부를 저장할 수 있는 변수 hasBook를 정의해봅시다.
//⑤ 이름과 나이, 키, 책의 보유 여부를 출력해봅시다.

class MemberInfo {
	static int currentYear = 2023;
	
	int birthYear;
	String name;
	int age;
	double height;
	boolean hasBook;

	MemberInfo() {
		this.age = currentYear-this.birthYear;
	}

	MemberInfo(String name,int birthYear, double height, boolean hasBook) {
		this.name = name;
		this.birthYear = birthYear;
		this.height = height;
		this.hasBook = hasBook;
	}
	
	void calAge() {// 현재연도와 태어난 연도로 age를 구한 뒤 인스턴스 변수에 대입
		int age = currentYear-birthYear+1; // 지역변수 age
		this.age = age;
	}
	
	void printCheckFreeVaccine() {
		
		if(age<15 || age>=65) {
			System.out.println(age + "세이므로 15세미만 또는 65세이상입니다. 백신무료접종이 가능합니다.");
		}else {
			System.out.println(age + "세이므로 15세이상 65세미만입니다. 백신무료접종 대상이 아닙니다.");
		}
	}
	
	void printCheckHealth() {
//		currentYear%2 == birthYear%2
		if(age>=20 && (currentYear+birthYear)%2==0) {
			System.out.println("건강검진 무료 대상입니다.");
		}else {
			System.out.println("건강검진 무료 대상이아닙니다.");
		}
		if(age>=40) {
			System.out.println("무료 암 검진 대상자입니다.");
		}else {
			System.out.println("무료 암 검진 대상자가 아닙니다.");
			
		}
	}

	public void displayInfo() {
		System.out.println("name : " + name);
		System.out.println("birth Of year : " + birthYear);
		System.out.println("age : " + age);
		System.out.println("height : " + height);
		System.out.println("hasBook : " + hasBook);
	}
}

public class Member {

	public static void main(String[] args) {
		
		MemberInfo student1 = new MemberInfo("JY LEE", 1998, 189.9, true);
		student1.calAge(); //현재연도와 태어난 연도로 age를 구한 뒤 인스턴스 변수에 대입하는 메소드
		student1.displayInfo();
		student1.printCheckFreeVaccine();
		student1.printCheckHealth();
		
		System.out.println("-----------------------------------------------");
		
		MemberInfo student2 = new MemberInfo("KP LEE", 1957, 199.9, false);
		student2.calAge();
		student2.displayInfo();
		student2.printCheckFreeVaccine();
		student2.printCheckHealth();
	}

}
