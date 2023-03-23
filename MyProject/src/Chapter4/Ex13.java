package Chapter4;

//구구단의 짝수 단(2,4,8)만 출력하는 프로그램 작성.
//단, 2단은 2x2까지, 4단은 4x4까지, 8단은 8x8 까지 출력

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		for(int i = 1; i<=9; i++) {
			if(((i%2 == 0) && (!(i%6==0)))) {
				for(int j = 1; j<=9; j++) {
					if(i>=j)
						System.out.printf("%d*%d=%d\t",i,j,i*j);
				}
				System.out.println();
			}

		}
	}

}
