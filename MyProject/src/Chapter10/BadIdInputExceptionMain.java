package Chapter10;

import java.util.Scanner;

public class BadIdInputExceptionMain {

	public static void main(String[] args) {
		
		String name;
		char ch;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름 >");
		name = scan.nextLine();
		
		try {
			for(int i = 0;i<name.length();i++) {
				ch = name.charAt(i);
				if(!((ch >= 'a'&& ch<='z') || ((ch >= 'A'&& ch<='Z')) || ((ch >='0')&&(ch<='9')))) {
					BadIdInputException e = new BadIdInputException();
					throw e;
				}
			}
			System.out.println("영문자와 숫자로만 이루어져있습니다.");
		}catch(BadIdInputException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}

}
