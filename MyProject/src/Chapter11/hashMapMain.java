package Chapter11;

import java.util.HashMap;
import java.util.Map;

public class hashMapMain {

	public static void main(String[] args) {
		
		Map<Integer, FootballPlayer> list = new HashMap<Integer, FootballPlayer>();
		
		FootballPlayer player1 = new FootballPlayer("이주용1", 7, "토트넘", 30);
		FootballPlayer player2 = new FootballPlayer("이주용2", 8, "맨유", 31);
		FootballPlayer player3 = new FootballPlayer("이주용3", 9, "레알", 32);
		FootballPlayer player4 = new FootballPlayer("이주용4", 10, "바르샤", 33);
		
		list.put(player1.getNumber(), player1);
		list.put(player2.getNumber(), player2);
		list.put(player3.getNumber(), player3);
		list.put(player4.getNumber(), player4);
		
		System.out.println(list.get(player1.getNumber()));
		System.out.println(list.get(player2.getNumber()));
		System.out.println(list.get(player3.getNumber()));
		System.out.println(list.get(player4.getNumber()));
	}

}
