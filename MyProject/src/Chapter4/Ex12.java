package Chapter4;

//자연수 1부터 시작해서 모든 홀수와 3의 배수인 짝수를 더해 나간다. 그리고 그 합이 언제 (몇을 더했을 때) 1000이 넘어서는지, 
//
//그리고 1000이 넘어선 값은 얼마가 되는지 계산하여 출력하는 프로그램을 작성.
//
//프로그램 내부에 while문을 무한 루프로 구성하여 작성.

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int count = 0;
		
		while(true) {
			count++;
			
			if((count%2 ==1) || ((count%3 == 0) && (count%2==0))) {
				sum+=count;
			}
			if(sum>1000) {
				System.out.println(count);
				System.out.println(sum);
				break;
			}
		}
	}

}
