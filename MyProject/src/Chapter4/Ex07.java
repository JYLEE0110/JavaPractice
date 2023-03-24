package Chapter4;

import java.util.Scanner;

//1부터 100까지 출력한 후, 다시 거꾸로 100부터 1까지 출력하는 프로그램을 작성. 
//while문과 do~while 문을 각각 한번씩 사용해서 작성

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cnt = 1;

		int num;

		Scanner scan = new Scanner(System.in);

		System.out.print("Input number : ");
		num = scan.nextInt();

		System.out.println();

		while (cnt <= num) {
			System.out.println(cnt);
			cnt++;
		}

		cnt--;

		System.out.println();

		do {
			cnt--;
			System.out.println(cnt);
		} while (cnt > 1);

	}

}
