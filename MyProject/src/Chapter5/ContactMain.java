package Chapter5;

public class ContactMain {

	public static void main(String[] args) {
		
		Contact student1 = new Contact();
		
		student1.inputData();//scanner로 데이터 입력
		System.out.println();
		student1.printData();//전체 데이터 출력 메소드
		
		System.out.println();
		
		//getter로 출력
		System.out.println("이름 : " + student1.getName());
		System.out.println("전화번호 : " + student1.getPhoneNum());
		System.out.println("이메일 : " + student1.getEmail());
		System.out.println("주소 : " + student1.getAddress());
		System.out.println("생일 : " + student1.getBirth());
		System.out.println("그룹 : " + student1.getGroup());
		
	}

}
