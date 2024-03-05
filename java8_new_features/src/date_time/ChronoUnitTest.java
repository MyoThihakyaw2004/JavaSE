package date_time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("CurrentTime : "+currentTime);
		
		LocalTime plus40Seconds = currentTime.plus(40, ChronoUnit.SECONDS);
		System.out.println("Plus40Seconds : "+plus40Seconds);
		
		LocalTime minus18Minutes = currentTime.minus(18, ChronoUnit.MINUTES);
		System.out.println("minus18Minutes : "+minus18Minutes);
		
		LocalTime plus8Hours = currentTime.plus(8, ChronoUnit.HOURS);
		System.out.println("plus8Hours : "+plus8Hours);
		
//		LocalDate today = LocalDate.now();
//		System.out.println("Today : "+today);
//		
//		LocalDate next4Day = today.plus(4, ChronoUnit.DAYS);
//		System.out.println("Next4Day : "+next4Day);
//		
//		LocalDate minus2Week = today.minus(2, ChronoUnit.WEEKS);
//		System.out.println("Minus2Weeks : "+minus2Week );
//		
//		LocalDate plus7Month = today.plus(7, ChronoUnit.MONTHS);
//		System.out.println("Plus7Month : "+plus7Month);
//		
//		LocalDate minus4Yar = today.minus(4, ChronoUnit.YEARS);
//		System.out.println("Minus4Year : "+minus4Yar);
//		
//		LocalDate plus3Decade = today.plus(3, ChronoUnit.DECADES);
//		System.out.println("Plus3Decades : "+plus3Decade);
//		
//		LocalDate minus4Centuries = today.minus(4, ChronoUnit.CENTURIES);
//		System.out.println("Minus4Centuries : "+minus4Centuries);
		
	}
	

}
