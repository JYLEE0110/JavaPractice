package Chapter10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionIntType {

	public static void main(String[] args) {

		int birth;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("태어난 년도를 입력 하세요 > ");
		
		try {
			birth = scan.nextInt();		
			 System.out.println("Int 타입으로 입력하셨습니다.");
		}catch(InputMismatchException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		scan.close();
		System.out.println("프로그램 종료");
	}

}
