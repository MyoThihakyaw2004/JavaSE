package enumeration;


public class DayProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DayOfWeek dayOfWeek = DayOfWeek.SUNDAY;
		
		String result = switch (dayOfWeek) {
		case MONDAY -> "Hello Monday";
		case TUESDAY -> "Hello Tuesday";
		case WEDNESDAY -> "Hello Wednesday";
		case THURSDAY -> "Hello Thursday";
		case FRIDAY -> "Hello Friday";
		case SATURDAY -> "Hello Saturday";
		case SUNDAY -> "Hello Sunday";
		
		default -> "Invalid Data";
		};
		
		System.out.println(result);
	}

}
