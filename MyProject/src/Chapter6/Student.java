package Chapter6;

public class Student {

	private String name;
	private int korScore;
	private int engScore;
	private int mathScore;

	public Student() {

	}

	public Student(String name, int korScore, int engScore, int mathScore) {
		super();
		this.name = name;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorScore() {
		return korScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	@Override
	public String toString() {
		return result();
	}

	// 총 합을 구하는 메소드
	private int sumScore() {
		int totalScore = korScore + engScore + mathScore;

		return totalScore;
	}

	// 평균을 구하는 메소드 소수점 아래2번째 까지 출력하기 위하여 String으로 반환(StringFormat 함수쓰기 위하여)
	private float avgScore() {
		int totalScore = sumScore();
		 float avg = Float.parseFloat(String.format("%.2f", totalScore / (float) 3));
		
		return avg;
	}

	public String result() {
		return name+"\t"+ korScore + "\t" + engScore + "\t" + mathScore + "\t" + sumScore() + "\t" + avgScore();
	}

}
