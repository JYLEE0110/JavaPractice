package Chapter4;

import java.util.Scanner;

//SwitchBreak.java를 switch문이 아닌, if~else를 사용하는 형태로 변경해 보자.

//﻿class SwitchBreak {
//
//    public static void main(String[] args) {
//        int n=3;
//        switch(n) {
//            case 1:
//                System.out.println("Simple Java");
//                break;
//            case 2:
//                System.out.println("Funny Java");
//                break;
//            case 3:
//                System.out.println("Fantastic Java");
//                break;
//            default:
//                System.out.println("The best programming language");
//        }
//        System.out.println("Do you like coffee?");
//    }
//}

class SwitchBreak {
	int num;

	SwitchBreak() {
	}

	SwitchBreak(int num) {
		this.num = num;
	}

	void displaySwitchToIf() {
		if (num == 1) {
			System.out.println("메뉴 1번을 선택 하셨습니다.\nSimple Java\n");
		} else if (num == 2) {
			System.out.println("메뉴 2번을 선택 하셨습니다.\nFunny Java\n");
		} else if (num == 3) {
			System.out.println("메뉴 3번을 선택 하셨습니다.\nFantastic Java\n");
		} else {
			System.out.println("메뉴 1,2,3번 외에 다른숫자를 선택하셨습니다.\nThe best programming language\n");
		}
		System.out.println("Do you like coffe?");
	}
}

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;

		Scanner scan = new Scanner(System.in);

		System.out.print("Input number : ");
		num = scan.nextInt();

		System.out.println();

		SwitchBreak menu = new SwitchBreak(num);
		menu.displaySwitchToIf();
		
		scan.close();

	}

}
