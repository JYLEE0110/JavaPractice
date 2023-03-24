package Chapter4;

import java.util.Scanner;

//while 문을 이용해서 1부터 99까지의 합을 구하는 프로그램을 작성.

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		int i = 1;
		int sum = 0;

		Scanner scan = new Scanner(System.in);

		System.out.print("Input number : ");
		num = scan.nextInt();

		System.out.println();

		while (i <= num) {
			sum += i;
			i++;
		}
		System.out.printf("1부터 %d까지의 합은 %d입니다.", num, sum);
		
		scan.close();
	}

}
