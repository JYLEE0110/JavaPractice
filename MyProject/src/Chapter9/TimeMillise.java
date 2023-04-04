package Chapter9;

//2. 1~100,000,000까지 더하기하는 연산의 실행 시간을 측정하는 프로그램을 만들어봅시다. 

public class TimeMillise {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		
		int sum = 0;
		
		for(int i = 1; i<= 100000000;i++) {
			sum+=i;
		}
		
		long endTime = System.currentTimeMillis();
		
		long time = endTime - startTime;
		
		System.out.println("총 연산 시간은 : " + time + " ms");
	}

}
