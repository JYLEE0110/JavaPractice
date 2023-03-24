package Chapter4;

import java.util.Scanner;

//ContinueBasic.java의 내부에 존재하는 while 문을 for 문으로 변경하여 작성
//﻿class ContinueBasic {
//
//    public static void main(String[] args) {
//        int num=0;
//        int count=0;
//        while((num++)<100){
//            if(num%5!=0 || num%7!=0)
//            continue;
//            count++;
//            System.out.println(num);
//        }
//        System.out.println("count: " + count);
//    }
//}

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int count = 0;

		Scanner scan = new Scanner(System.in);

		System.out.print("Input number : ");
		num = scan.nextInt();

		System.out.println();

		System.out.printf("%d미만의 숫자 중 5의 배수면서 7의 배수인 값은\n", num);

		for (int i = 1; i < num; i++) {
			if ((i % 5 != 0) || (i % 7 != 0)) {
				continue;
			}
			System.out.print("[" + i + "]");
			count++;

//			if ((i % 5 == 0) && (i % 7 == 0)) {
//				System.out.print("[" + i + "]");
//				count++;
//			}
		}
		System.out.println();
		System.out.println("total : " + count + "개 입니다.");
	}

}
