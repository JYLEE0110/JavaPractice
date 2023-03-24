package Chapter4;

import java.util.Scanner;

// Switch 문으로 작성
//num < 0 이라면 “0 미만” 출력
//
//0 ≤ num <100 이라면 “0이상 100 미만“ 출력
//
//100 ≤ num < 200 이라면 “100이상 200 미만“ 출력
//
//200 ≤ num < 300 이라면 “200이상 300 미만“ 출력
//
//300 ≤ num 이라면 “300이상 “ 출력

//num < 0 이라면 “0 미만” 출력 부분은 if문을 사용하고 나머지 조건에 대해 변경하세요.

class RangeSwitch {
	int num;

	RangeSwitch() {
	}

	RangeSwitch(int num) {
		this.num = num;
	}

	void displaySwitch() {

		if (num < 0) {
			System.out.println("0미만");
		} else {

			switch (num / 100) {
			case 0:
				System.out.println(num + "(은/는) 0이상 100미만");
				break;
			case 1:
				System.out.println(num + "(은/는) 100이상 200미만");
				break;
			case 2:
				System.out.println(num + "(은/는) 200이상 300미만");
				break;
			default:
				System.out.println(num + "(은/는) 300이상");

			}
		}
	}
}

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;

		Scanner scan = new Scanner(System.in);

		System.out.print("Input number : ");
		num = scan.nextInt();

		System.out.println();

		RangeSwitch num1 = new RangeSwitch(num);
		num1.displaySwitch();

		scan.close();
	}

}
