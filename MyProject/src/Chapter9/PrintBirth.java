package Chapter9;

//자신의 생일을 기준으로 오늘까지 몇 일을 살았는지 출력하는 프로그램을 만들어봅시다.

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PrintBirth {

	public static void main(String[] args) {

		LocalDate birthday = LocalDate.of(1998, 1, 10);
		LocalDate now = LocalDate.now();
		
		System.out.println("오늘 : " + now);
		System.out.println("생일 : " + birthday);


		long days = ChronoUnit.DAYS.between(birthday, now); // now와 birth의 며칠 차이인지 계산
		
		System.out.println(days + "일 생존");
		
		System.out.println();
		
		LocalDate cDay = LocalDate.parse("2023-12-25");
		System.out.println("오늘 : " + now);
		System.out.println("크리스마스 : " + cDay);
		long days2=ChronoUnit.DAYS.between(now, cDay);
	
		System.out.println(days2 + "일 남음");
	}

}
