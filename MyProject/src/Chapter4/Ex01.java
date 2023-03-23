package Chapter4;

class IfReit{
	int num;
	
	IfReit(){}
	
	IfReit(int num){
		this.num = num;
	}
	
	void displayPosEven() {
		if((num>0) && (num%2 == 0)) {
			System.out.println("양수이면서 짝수");
		}
	}
}

public class Ex01 {

	public static void main(String[] args) {
		
		IfReit num1 = new IfReit(120);
		num1.displayPosEven();
	}

}
