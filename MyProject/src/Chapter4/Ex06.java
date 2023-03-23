package Chapter4;

//while 문을 이용해서 1부터 99까지의 합을 구하는 프로그램을 작성.

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 1;
		int sum = 0;
		
		while(n<=99) {
			sum+=n;
			n++;
		}
		System.out.println(sum);
	}

}
