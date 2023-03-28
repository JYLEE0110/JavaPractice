package Contact;

import java.util.Scanner;

public class ContactMain3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("전화번호 정보 입력을 시작 합니다.");
		
		System.out.print("이름 > ");
		String name = in.nextLine();
		
		System.out.print("전화번호 > ");
		String phoneNum = in.nextLine();
		
		System.out.print("이메일 > ");
		String email = in.nextLine();
		
		System.out.print("주소 > ");
		String address = in.nextLine();
		
		System.out.print("생년월일 > ");
		String birth = in.nextLine();
		
		System.out.print("그룹 > ");
		String group = in.nextLine();
		
		Contact contact = new Contact(
				name,
				phoneNum,
				email,
				address,
				birth,
				group);
		
		System.out.println("입력결과 ==========");
		contact.printsimpleData();
		
		System.out.println();
		
		contact.printData();
		
		in.close();
	}

}
