package dmdev.level2.pack24dateandtime.practice;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * 7. Создать объект Instant. Вывести его на консоль.
 * Затем создать объект ZonedDateTime на основании
 * предыдущего объекта с тайм зоной Africa/Cairo.
 */

public class Task7 {
	
	public static void main(String[] args) {
		Instant instant = Instant.now();
		System.out.println(instant);
		
//		либо так
		ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Africa/Cairo"));
		System.out.println(zonedDateTime);
		
//		либо так
		ZonedDateTime zonedDateTime1 = ZonedDateTime.ofInstant(instant, ZoneId.of("Africa/Cairo"));
		System.out.println(zonedDateTime1);
	}
}
