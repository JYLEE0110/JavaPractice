package Chapter1;

import java.util.*;

//① 숫자 두 개를 매개변수의 인자로 전달받아 더하기 메소드를 추가합시다.
//② 숫자 두 개를 매개변수의 인자로 전달받아 빼기 메소드를 추가합시다.
//③ 숫자 두 개를 매개변수의 인자로 전달받아 곱하기 메소드를 추가합시다.
//④ 숫자 두 개를 매개변수의 인자로 전달받아 나누기 메소드를 추가합시다.
//⑤ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 둘레를 구해 반환하는 메소드를 반환하는 메소드를 정의
//⑥ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 넓이를 구해 반환하는 메소드를 반환하는 메소드를 정의
//원의 둘레 : 2 x π x r , 월의 넓이 : π x r x r
//⑦ main() 메소드를 정의하고 각각의 메소드를 호출해서 결과를 콘솔에 출력해봅시다.
//⑧ 콘솔에서 사용자에게 데이터를 받아 메소드를 호출할 때 사용자에게 받은 데이터를 메소드의 매개변수의 인자로 전달하는 코드를 main() 메소드
//에 추가해봅시다

class Calculator {

	static long addNum(long num1, long num2) {
		return num1 + num2;
	}

	static long subNum(long num1, long num2) {
		return num1 - num2;
	}

	static long mulNum(long num1, long num2) {
		return num1 * num2;
	}

	static float divNum(float num1, float num2) {
		return num1 / num2;
	}

	static double calCircumference(int r) {
		return 2 * Math.PI * r;
	}

	static double calCirArea(int r) {
		return Math.PI * Math.pow(r, 2);
	}
}

public class CalculatorPractice {

	public static void main(String[] args) {

		long num1;
		long num2;
		int r;

		Scanner scan = new Scanner(System.in);

		System.out.print("Input num1 : ");
		num1 = scan.nextLong();

		System.out.print("Input num2 : ");
		num2 = scan.nextLong();

		System.out.println();

		System.out.printf("%d + %d = %d\n", num1, num2, Calculator.addNum(num1, num2));
		System.out.printf("%d - %d = %d\n", num1, num2, Calculator.subNum(num1, num2));
		System.out.printf("%d * %d = %d\n", num1, num2, Calculator.mulNum(num1, num2));
		System.out.printf("%d / %d = %f\n", num1, num2, Calculator.divNum(num1, num2));

		System.out.println();

		System.out.print("Input radius : ");
		r = scan.nextInt();

		System.out.printf("반지름이 %d인 원의 둘레는 %.2f\n", num1, Calculator.calCircumference(r));
		System.out.printf("반지름이 %d인 원의 넒이는 %.2f\n", num1, Calculator.calCirArea(r));
	}

}
