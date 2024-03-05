package date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("Datetime : " +currentDateTime);
		
		LocalDateTime customDateTime = LocalDateTime.of(2020, 8, 16, 8, 23, 14, 123412532);
		System.out.println("Custom DateTime: "+customDateTime);
		
		boolean result1 = currentDateTime.isBefore(customDateTime);
		System.out.println("result1 = "+result1);
		
		boolean result2 = currentDateTime.isAfter(customDateTime);
		System.out.println("result2 = "+result2);
		
		boolean result3 = currentDateTime.isEqual(customDateTime);
		System.out.println("result3 = "+result3);
		
		// Operations
		System.out.println("Day of Week: "+currentDateTime.getDayOfWeek());
		System.out.println("Day of Month: "+currentDateTime.getDayOfMonth());
		System.out.println("Day Of Year: "+currentDateTime.getDayOfYear());
		
		System.out.println("Month Name : "+currentDateTime.getMonth());
		System.out.println("Month Value : "+currentDateTime.getMonthValue());
		System.out.println("Year : "+currentDateTime.getYear());
		
		System.out.println("Hour : "+currentDateTime.getHour());
		System.out.println("Minute : "+currentDateTime.getMinute());
		System.out.println("Second : "+currentDateTime.getSecond());
		System.out.println("Nano : "+currentDateTime.getNano());
		
//		ZoneId tokyo = ZoneId.of("Asia/Tokyo");
//		LocalDateTime tokyoDateTime = LocalDateTime.now(tokyo);
//		System.out.println("japan datetime : " + tokyoDateTime);
		
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss:nnnnnnnnn");
//		String formattedDate = formatter.format(currentDateTime);
//		System.out.println("Formated Date : "+formattedDate);
		
//		LocalDate currentDate = LocalDate.now();
//		System.out.println("Date : "+currentDate);
//		
//		LocalTime currentTime = LocalTime.now();
//		System.out.println("Time : " + currentTime);
	}

}
