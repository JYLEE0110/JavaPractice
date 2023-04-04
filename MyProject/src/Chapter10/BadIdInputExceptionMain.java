package Chapter10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BadIdInputExceptionMain {

	public static void main(String[] args) {

		String name;

		Scanner scan = new Scanner(System.in);

		System.out.println("이름 >");
		name = scan.nextLine();

		try {
			Pattern pattern = Pattern.compile("^[a-zA-Z0-9]*$");
			Matcher matcher = pattern.matcher(name);
			if (!(matcher.find())) {
				BadIdInputException e = new BadIdInputException();
				scan.close();
				throw e;
			}
			System.out.println("영문자와 숫자로만 이루어져있습니다.");
		} catch (BadIdInputException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
		scan.close();
	}

}
