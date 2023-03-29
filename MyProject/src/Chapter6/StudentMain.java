package Chapter6;

public class StudentMain {

	public static void main(String[] args) {
		
		Student[] students = new Student[10];
		
		students[0] = new Student("이주용1", 100, 99, 94);
		students[1] = new Student("이주용2", 100, 99, 33);
		students[2] = new Student("이주용3", 54, 24, 12);
		students[3] = new Student("이주용4", 100, 99, 65);
		students[4] = new Student("이주용5", 10, 89, 58);
		students[5] = new Student("이주용6", 45, 59, 38);
		students[6] = new Student("이주용7", 13, 59, 98);
		students[7] = new Student("이주용8", 70, 69, 78);
		students[8] = new Student("이주용9", 100, 95, 98);
		students[9] = new Student("이주용10", 10, 39, 58);
		
		System.out.printf("이름\t" + "국어점수\t" + "영어점수\t" + "수학점수\t"+ "총합\t"+ "평균\t");
		System.out.println();
		System.out.println("==============================================");
		for(Student student : students ) {
//			System.out.println(student);
//			System.out.println("총합은" + student.sumScore() + " 평균은" + student.avgScore());
//			System.out.println();
			
			System.out.print(student.getName() + "\t");
			System.out.print(student.getKorScore() + "\t");
			System.out.print(student.getEngScore() + "\t");
			System.out.print(student.getMathScore() + "\t");
			System.out.print(student.sumScore() + "\t");
			System.out.printf("%.2f",student.avgScore());
			System.out.println();
		}
	}

}
