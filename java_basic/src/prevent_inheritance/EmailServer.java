package prevent_inheritance;

public class EmailServer {

	private static final Email[] EMAILS = new Email[20];
	
	public static void addEmail(Email email, int index) {
		EMAILS[index] = email;
	}
	
	public static Email[] readEmail() {
		return EMAILS;
	}
	
	private EmailServer() {};
}
