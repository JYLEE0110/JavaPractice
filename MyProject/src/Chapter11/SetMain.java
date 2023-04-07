package Chapter11;

import java.util.HashSet;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {

		Set<FootballPlayer> list = new HashSet<FootballPlayer>();

		list.add(new FootballPlayer("김주용", 7, "1501호", 25));
		list.add(new FootballPlayer("하주용", 7, "1502호", 25));
		list.add(new FootballPlayer("이주용", 8, "1503호", 28));
		list.add(new FootballPlayer("이주용", 8, "1503호", 27));
		list.add(new FootballPlayer("이주용", 8, "1501호", 27));

		System.out.println("name\tnum\tteam\tage");
		System.out.println("----------------------------");
//		for (FootballPlayer player : list) {
//			System.out.println(player);
//		}
		
//		list.stream().forEach((FootballPlayer f) -> f.toString());
		list.stream().forEach(System.out::println);
	}

}
