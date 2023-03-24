package Chapter4;

import java.util.Scanner;

//for 문을 이용하여 1부터 10까지를 곱해서 그 결과를 출력하는 프로그램을 작성

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = 1;

		int num;

		Scanner scan = new Scanner(System.in);

		System.out.print("Input number : ");
		num = scan.nextInt();

		System.out.println();

		for (int i = 1; i <= num; i++) {
			result *= i;
		}
		System.out.printf("1부터 %d까지의 곱은 %d입니다.", num, result);
	}

}
