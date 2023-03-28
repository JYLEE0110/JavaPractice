package Chapter5;

public class ContactMain {

	public static void main(String[] args) {
		
		Contact student1 = new Contact();
		
		student1.inputData();//scanner로 데이터 입력하는 메소드
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
		
		System.out.println();
		
		//setter로 데이터 수정
		student1.setName("이주용");
		student1.setPhoneNum("010-5420-XXXX");
		student1.setEmail("wndyd@gmail.com");
		student1.setAddress("성남시 분당구");
		student1.setBirth("980110");
		student1.setGroup("1501호");
		
		student1.printData(); //수정된 데이터 출력
	
	}

}
