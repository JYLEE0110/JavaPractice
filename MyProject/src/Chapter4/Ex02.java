package Chapter4;

import java.util.Scanner;

//다음과 같이 출력이 이루어지도록 작성해보자.
//
//num < 0 이라면 “0 미만” 출력
//
//0 ≤ num <100 이라면 “0이상 100 미만“ 출력
//
//100 ≤ num < 200 이라면 “100이상 200 미만“ 출력
//
//200 ≤ num < 300 이라면 “200이상 300 미만“ 출력
//
//300 ≤ num 이라면 “300이상 “ 출력

class Range {
	int num;

	Range() {
	}

	Range(int num) {
		this.num = num;
	}

	void displayRange() {
		if (num < 0) {
			System.out.printf("%d(은/는) 0미만", num);
		} else if (num < 100) {
			System.out.printf("%d(은/는) 0이상 100미만", num);
		} else if (num < 200) {
			System.out.printf("%d(은/는) 100이상 200미만", num);
		} else if (num < 300) {
			System.out.printf("%d(은/는) 200이상 300미만", num);
		} else {
			System.out.printf("%d(은/는) 300이상", num);
		}
	}
}

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.print("Input number : ");
		int num = scan.nextInt();

		Range num1 = new Range(num);
		num1.displayRange();
		
		scan.close();
	}

}
