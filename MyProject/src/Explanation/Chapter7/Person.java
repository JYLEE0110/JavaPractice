package Explanation.Chapter7;

public class Person {
	//
	private String name;
	private String personNum;
	
	
	
	public Person(String name, String personNum) {
		super();
		this.name = name;
		this.personNum = personNum;
	}

	public void printGreeting() {
		System.out.println("안녕하세요, 저는" + name + "입니다 ." + getAge() + "살 입니다.");
	}
	
	//주민번호를 통해서 나이를 추출
	int getAge() {
		
		int age = 0;
		
		String year = personNum.substring(0,2);
		char gender = personNum.charAt(7);
				
		if(gender < '3') {
			//1900 + year
			age = 2023 - (1900 + Integer.valueOf(year)) + 1;
		}else {
			//2000 + year
			age = 2023 - 2000 - Integer.valueOf(year) + 1;
		}		
		return age;
	}
}
