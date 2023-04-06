package Chapter11;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {

		Set<FootballPlayer> list = new TreeSet<FootballPlayer>();
		
		list.add(new FootballPlayer("이주용", 7, "가", 21));
		list.add(new FootballPlayer("이주용2", 8, "차", 29));
		list.add(new FootballPlayer("이주용3", 9, "하", 28));
		list.add(new FootballPlayer("이주용", 10, "가", 28));
		list.add(new FootballPlayer("이주용", 11, "가", 2));
		
		list.stream().forEach(System.out::println);
	}

}
