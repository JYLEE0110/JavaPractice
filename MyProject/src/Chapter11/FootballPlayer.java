package Chapter11;

public class FootballPlayer implements Comparable<FootballPlayer> {

	private String name;
	private int number;
	private String team;
	private int age;

	public FootballPlayer() {

	}

	public FootballPlayer(String name, int number, String team, int age) {
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return name + "\t" + number + "번\t" + team + "\t" + age + "세";
	}

	@Override
	public int hashCode() {
		// 이름의 마지막문자 유니코드
		return name.charAt(2);
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;

		if (obj != null && obj instanceof FootballPlayer p) {
			p = (FootballPlayer) obj;
			result = (name.equals(p.getName()) && age == p.getAge()) && team.equals(p.getTeam());
		}
		return result;
	}

	@Override
	public int compareTo(FootballPlayer o) {
		int compare = team.compareTo(o.getTeam());

		if (compare == 0) {
			compare = name.compareTo(o.getName());
			if (compare == 0) {
				compare = number - o.getNumber();
			}
		}
		return compare;
	}

}
