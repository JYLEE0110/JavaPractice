package Chapter9;

import java.util.Scanner;

//사용자에게 이름을(영문) 입력 받아 입력 받은 문자열을 정상적인 문자열의 이름으로 표현하는지 판별하고, 
//공백으로 입력되었는지도 판별하는 프로그램을 만들어봅시다.

public class StringPersonName {

	public static void main(String[] args) {
		
		String name;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름입력 >");
		name = scan.nextLine();
		
		if(name.trim().isEmpty()) {
			System.out.println("공백입력은 허용하지 않습니다.");
		} else {
			if(checkName(name))
			{
				System.out.println(name);				
			}else {
				System.out.println("영문자가 아닙니다.");
			}
		}
	
		
//		for(int i=0; i<name.length();i++) {
//		
//			if( ('a' <= name.charAt(i) && name.charAt(i) <= 'z') || ('A' <= name.charAt(i) && name.charAt(i) <= 'Z')) {
//				count++;
//			}
//		}
//		if(count==0) {
//			System.out.println("영문만 혀용됩니다.");
//		}
	}
	
	public static boolean checkName(String name) {
		
		boolean result = true;
		
		for(int i=0; i<name.length();i++) {
		
			if( !(('a' <= name.charAt(i) && name.charAt(i) <= 'z') || ('A' <= name.charAt(i) && name.charAt(i) <= 'Z'))) {
				result = false;
				break;
			}
		}
		return result;
	}
}
