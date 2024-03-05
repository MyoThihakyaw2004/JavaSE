package date_time;

import java.util.Calendar;
import java.util.Date;

public class OldDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today = new Date();
		System.out.println("today : " + today);
		
		Calendar cal = Calendar.getInstance();
		cal.set(2022, 6, 12,18, 27, 36);
		
		Date customDateTime = cal.getTime();
		System.out.println("customDateTime : " + customDateTime);
	}

}
