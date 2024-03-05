package prevent_inheritance;

public class Sender {

	private String address;

	public Sender(String address) {
		super();
		this.address = address;
	}
	
	public void sendEmail (String to, String subject, String attachment, int index) {
		EmailServer.addEmail(new Email(this.address, to, subject, attachment), index);
	}
}
