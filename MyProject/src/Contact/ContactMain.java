package Contact;

public class ContactMain {

	public static void main(String[] args) {

		Contact c = new Contact(
				"손흥민",
				"010-5420-7546",
				"son@gmail",
				"런던",
				"1991",
				"친구");
		
		System.out.println("이름 : " + c.getName());
		System.out.println("전화번호 : " + c.getPhoneNum());
		System.out.println("이메일 : " + c.getEmail());
		System.out.println("주소 : " + c.getAddress());
		System.out.println("생년월일 : " + c.getBirth());
		System.out.println("그룹 : " + c.getGroup());
		
		System.out.println();
		
		c.printData();
		
		c.setPhoneNum("010-9999-8888");
		c.setEmail("JYLEE@naver.com");
		c.setAddress("분당");
		c.setBirth("1990.03.01");
		
		System.out.println();
		c.printData();
	}

}
