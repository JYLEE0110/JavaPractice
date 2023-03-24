package Chapter4;

import java.util.Scanner;

//for 문을 이용하여 구구단 중 5단을 출력하는 프로그램 작성

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;

		Scanner scan = new Scanner(System.in);

		System.out.print("Input number : ");
		num = scan.nextInt();

		System.out.println();

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num * i);
		}
	}

}
