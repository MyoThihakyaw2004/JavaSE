package date_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class PeroidAndDuration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalTime time1 = LocalTime.of(8, 22);
		LocalTime time2 = LocalTime.of(14, 12);
		
		Duration duration = Duration.between(time1, time2);
		System.out.println("Duration : "+duration);
		System.out.println("Seconds : "+duration.getSeconds());
		System.out.println("Nano : "+duration.getNano());
		System.out.println("Total Hour : "+duration.toHours());
		System.out.println("Total Minute : "+duration.toMinutes());
		System.out.println("Total Seconds : "+duration.toSeconds());
		
		
//		LocalDate date1 = LocalDate.of(2020, 8, 14);
//		LocalDate date2 = LocalDate.of(2022, 12, 28);
//		
//		Period period = Period.between(date1, date2);
//		System.out.println("Peroid : "+period);
//		System.out.println("Year : "+period.getYears());
//		System.out.println("Month : "+period.getMonths());
//		System.out.println("Day : "+period.getDays());
//		System.out.println("Total Month : "+period.toTotalMonths());
	}

}
