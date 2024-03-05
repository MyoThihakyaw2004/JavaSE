package date_time;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZonedDateTime currentDateTime = ZonedDateTime.now();
		System.out.println(currentDateTime);
		
		ZoneId newyork = ZoneId.of("America/New_York");
		ZonedDateTime usDateTime = ZonedDateTime.now(newyork);
		System.out.println(usDateTime);
		
		ZoneId thailand = ZoneId.of("Asia/Bangkok");
		ZonedDateTime thaiDateTime = ZonedDateTime.now(thailand);
		System.out.println("ThaiDateTime : "+thaiDateTime);
		
		
	}

}
