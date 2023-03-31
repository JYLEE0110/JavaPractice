package Chapter8;

import java.util.*;

public class CalculatorMain {

	public static void main(String[] args) {

		long num1;
		long num2;

		Calculator cal = new CalculatorClass();

		Scanner scan = new Scanner(System.in);

		System.out.print("num1을 입력하시오 : ");
		num1 = scan.nextLong();

		System.out.print("num2를 입력하시오 : ");
		num2 = scan.nextLong();

		System.out.println();

		System.out.printf("%d + %d = %d\n", num1, num2, cal.add(num1, num2));
		System.out.printf("%d - %d = %d\n", num1, num2, cal.substract(num1, num2));
		System.out.printf("%d * %d = %d\n", num1, num2, cal.multiply(num1, num2));
		System.out.printf("%d / %d = %.2f", num1, num2, cal.divide(num1, num2));

		scan.close();
	}

}
