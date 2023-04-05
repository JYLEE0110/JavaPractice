package Chapter11;

import java.util.*;

public class FootballPlayerMain {

	public static void main(String[] args) {

//		FootballPlayer player1 = new FootballPlayer("이주용1",7,"1501호",26);
//		FootballPlayer player2 = new FootballPlayer("이주용2",8,"1502호",27);
//		FootballPlayer player3 = new FootballPlayer("이주용3",9,"1503호",28);
		
//		list.add(player1);
//		list.add(player2);
//		list.add(player3);

//		list.add(new FootballPlayer("이주용1", 7, "1501호", 26));
//		list.add(new FootballPlayer("이주용2", 8, "1502호", 27));
//		list.add(new FootballPlayer("이주용2", 8, "1503호", 28));

		String name;
		int number;
		String team;
		int age;

		Scanner scan = new Scanner(System.in);


		List<FootballPlayer> list = new ArrayList<FootballPlayer>();

		System.out.println("3명의 선수 이름의 정보를 입력해 주세요.\n");
		for (int i = 0; i < 3; i++) {
			System.out.print("name > ");
			name = scan.nextLine();
			
			System.out.print("number > ");
			number = scan.nextInt();
			
			scan.nextLine();
			
			System.out.print("team > ");
			team = scan.nextLine();
			
			System.out.print("age > ");
			age = scan.nextInt();
			
			scan.nextLine();
			
			list.add(new FootballPlayer(name, number, team, age));
			System.out.println("-------------");
		}

		System.out.println();
		System.out.println("name\tnum\tteam\tage");
		System.out.println("----------------------------");
		for (FootballPlayer player : list) {
			System.out.println(player);
		}

	
		
	}

}
