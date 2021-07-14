package ru.sectorsj.learning.videoblogers.dmdev.java.level2.pack24dateandtime.practice;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 6. Даны два объекта LocalDate из предыдущего задания.
 * Подсчитать количество секунд между полуночью первой
 * даты и полуночью второй даты.
 */

public class Task6 {
	
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate prevDate = LocalDate.of(2018, 7, 7);
		
//		LocalDateTime.of(LocalTime.MIDNIGHT);
		LocalDateTime localDateTimeNow = now.atStartOfDay();
		LocalDateTime localDateTimePrev = prevDate.atStartOfDay();
		
		Duration duration = Duration.between(localDateTimePrev, localDateTimeNow);
		System.out.println(duration.getSeconds());
	}
}
