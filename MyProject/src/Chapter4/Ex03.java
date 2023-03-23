package Chapter4;


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

class ConOp{
	int num1;
	int num2;
	
	ConOp(){}
	
	ConOp(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	
	void displayBig() {
		if(num1>num2) {
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}
	}
	
	void displayDiff() {
		if(num1>num2) {
			System.out.println(num1-num2);
		}else {
			System.out.println(num2-num1);
		}
	}
}

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConOp num = new ConOp(50,200);
		
		num.displayBig();
		num.displayDiff();
		

	}

}
