package Chapter4;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		int numA;
		//		int numB;

		for(int i = 1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				int num1=i*10+j;
				int num2=j*10+i;
				int sum = num1 + num2;
				
				if(num1+num2 == 99) {
					System.out.printf("%d + %d = %d\n",num1, num2, sum);
				}
			}
		}
	}

}
