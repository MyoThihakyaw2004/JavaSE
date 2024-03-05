package prevent_inheritance;

public class EmailClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sender mgmg = new Sender("mgmg@gmail.com");
		mgmg.sendEmail("masapal@gmail.com", "Just Greeting", "greet.txt", 0);
		
		Sender kyawkyaw = new Sender("kk@gmail.com");
		kyawkyaw.sendEmail("masapal@gmail.com", "Meeting Schedule", "Schedule.txt", 1);
		
		HackZoe hackzoe = new HackZoe("1000 808 8012");
		hackzoe.hijeck();
		
		Recipient masapal = new Recipient("masapal@gmail.com");
		masapal.readEmail();
	}

}
