package Chapter4;

public class Ex16 {

	public static void main(String[] args) {

//////////// for
		int sum = 0;
		for(int i = 1; i<=99; i++) {
			sum+=i;
		}
		System.out.println(sum);
		
///////////// while		
		int cnt = 1;
		int sum2 = 0;
		
		while(cnt<=99) {
			sum2+=cnt;
			cnt++;
		}
		System.out.println(sum2);
		
////////////do while
		
		int cnt2 = 1;
		int sum3 = 0;
		
		do {
			sum3 += cnt2;
			cnt2++;
		}while(cnt2 <= 99);
		System.out.println(sum3);
	}
}
