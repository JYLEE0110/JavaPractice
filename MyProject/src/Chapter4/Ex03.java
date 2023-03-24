package Chapter4;

import java.util.Scanner;

//CondOp.java를 조건연산자(3항 연산자)를 사용하지 않고,
//
//if~else를 사용하는 형태로 변경해 보자.

//﻿class CondOp {
//    public static void main(String[] args) {
//        int num1=50, num2=100;
//        int big, diff;
//        big = (num1>num2)? num1:num2;
//        System.out.println(big);
//        diff = (num1>num2)? num1-num2: num2-num1;
//        System.out.println(diff);
//    }
//}

class ConOp {
	private int num1;
	private int num2;

	ConOp() {
	}

//	ConOp(int num1, int num2) {
//		this.num1 = num1;
//		this.num2 = num2;
//	}

	void displayBig() {
		if (num1 > num2) {
			System.out.printf("%d과 %d 중에 더 큰 숫자는 %d\n", num1, num2, num1);
		} else {
			System.out.printf("%d과 %d 중에 더 큰 숫자는 %d\n", num1, num2, num2);
		}
	}

	Scanner scan() {
		Scanner scan = new Scanner(System.in);
		return scan;
	}

	int setNum1() {

		System.out.print("Input number1 : ");
		num1 = scan().nextInt(); // Scanner 타입을 번환값으로 하는 scan()함수 호출 => return값은 scan(객체의 주소 값)

		return num1;
	}

	int setNum2() {

		System.out.print("Input number2 : ");
		num2 = scan().nextInt();

		return num2;
	}

	void displayDiff() {
		if (num1 > num2) {
			System.out.println("두수의 차이는 " + num1 + "-" + num2 + "=" + (num1 - num2));
		} else {
			System.out.println("두수의 차이는 " + num2 + "-" + num1 + "=" + (num2 - num1));
		}
	}
}

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConOp num = new ConOp();

		num.setNum1();
		num.setNum2();

		System.out.println();

		num.displayBig();
		num.displayDiff();

		num.scan().close();
	}

}
