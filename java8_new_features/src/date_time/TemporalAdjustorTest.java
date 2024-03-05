package date_time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		System.out.println("Today : "+today);
		
		LocalDate nextWed = today.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
		System.out.println("Next Wednesday : "+nextWed);
		
		LocalDate previousMon = today.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
		System.out.println("previousMon : "+previousMon);
		
		LocalDate nextORSameSat = today.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY));
		System.out.println("NextOrSameSat : "+nextORSameSat);
		
		LocalDate next2WeekTue = today.plus(1, ChronoUnit.WEEKS).with(TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY));
		System.out.println("Next2WeekTue : "+next2WeekTue);
		
		LocalDate firstDayOfYear = today.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("FirstDayOfYear : "+firstDayOfYear);
		
		LocalDate firstDayOfMonth = today.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("FirstDayOfMonth : "+firstDayOfMonth);
	}

}
