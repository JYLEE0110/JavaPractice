package Contact;

import java.util.*;

public class ContactMain2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("나이를 입력하시오 > ");
		String strAge = in.nextLine();
		
		int age = Integer.parseInt(strAge);
		
		if(age>19) {
			System.out.println("성인");
		}else {
			System.out.println("미성년");
		}
		
		System.out.print(age);
	}

}
