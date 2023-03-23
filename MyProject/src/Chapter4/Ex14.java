package Chapter4;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int numA;
//		int numB;
		
		for(int i = 1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if((i+j)==9) {
					System.out.printf("%d , %d\n",i,j);
				}
			}
		}
	}

}
