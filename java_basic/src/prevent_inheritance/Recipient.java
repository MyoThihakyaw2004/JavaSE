package prevent_inheritance;

public class Recipient {
	private String address;
	
	
	public Recipient(String address) {
		super();
		this.address = address;
	}


	public void readEmail() {
		for(final Email email : EmailServer.readEmail()) {
			if (email == null) {
				continue;
			}
			
			if (email.getTo().equals(this.address)) {
				System.out.println("Email Information : ");
				System.out.println("From : "+email.getFrom());
				System.out.println("To : " + email.getTo());
				System.out.println("Subject : " + email.getSubject());
				System.out.println("Attachments : "+email.getAttachment());
				System.out.println();
			}
		}
	}
}
