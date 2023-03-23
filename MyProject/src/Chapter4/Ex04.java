package Chapter4;

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

class SwitchBreak{
	int n;
	
	SwitchBreak(){}
	
	SwitchBreak(int n){
		this.n = n;
	}
	
	void displaySwitchToIf(){
		if(n==1) {
			System.out.println("Simple Java");
		}
		else if(n==2) {
			System.out.println("Funny Java");
		}
		else if(n==3) {
			System.out.println("Fantastic Java");
		}else {
			System.out.println("The best programming language");
		}
		System.out.println("Do you like coffe?");
	}
}

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwitchBreak menu = new SwitchBreak(3);
		menu.displaySwitchToIf();
		
	}

}
