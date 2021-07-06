package dmdev.level2.pack24dateandtime.datetime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeDemo {
	
	public static void main(String[] args) {
		ZonedDateTime now = ZonedDateTime.now();
		System.out.println(now);
		
		long toEpochMilli = now.toInstant().toEpochMilli();
		//милисекунд с 01.01.1970
		System.out.println(toEpochMilli);
		
		ZonedDateTime plus = now.plus(1L, ChronoUnit.DAYS);
//		сдвинул дату на 1 день
//		можно как прибавлять день, месяц, и т.д. так и вычитать
		System.out.println(plus);
		
		ZonedDateTime zonedDateTime = now.truncatedTo(ChronoUnit.DAYS);
//		обнулил дату до начала дня
		System.out.println(zonedDateTime);
		
//		now.format() - для строкового представления времени/даты
		
//		LocalDateTime.now ...
//		LocalDateTime.of() ...
//		LocalDateTime.ofInstant() ...
		
		LocalDateTime localDateTime = LocalDateTime.now(ZoneOffset.UTC);
		System.out.println(localDateTime);
		
		LocalTime now1 = LocalTime.now();
		System.out.println(now1);
		
	}
}
