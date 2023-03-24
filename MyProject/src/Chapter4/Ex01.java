package Chapter4;

import java.util.*;

class IfReit {
	int num;

	IfReit() {
	}

	IfReit(int num) {
		this.num = num;
	}

	void displayPosEven() {
		if ((num > 0) && (num % 2 == 0)) {
			System.out.printf("%d(은/는) 양수이면서 짝수", num);
		}
	}
}

public class Ex01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Input number : ");
		int num = scan.nextInt();

		IfReit num1 = new IfReit(num);
		num1.displayPosEven();
		
		scan.close();
	}

}
