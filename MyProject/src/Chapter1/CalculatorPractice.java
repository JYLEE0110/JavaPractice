package Chapter1;

class Calculator{
	
	static int add(int num1, int num2) {
		return num1+num2;
	}
	
	static int sub(int num1, int num2) {
		return num1-num2;
	}
	
	static int mul(int num1, int num2) {
		return num1*num2;
	}
	
	static int div(int num1, int num2) {
		return num1/num2;
	}
	
}

public class CalculatorPractice {

	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 3;
		
		System.out.printf("%d + %d = %d\n",num1,num2, Calculator.add(num1, num2));
		System.out.printf("%d - %d = %d\n",num1,num2, Calculator.sub(num1, num2));
		System.out.printf("%d * %d = %d\n",num1,num2, Calculator.mul(num1, num2));
		System.out.printf("%d / %d = %d\n",num1,num2, Calculator.div(num1, num2));
	}

}
