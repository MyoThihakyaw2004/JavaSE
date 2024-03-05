package prevent_inheritance;

// DTO data carrier
public class Email {

	private final String from;
	private final String to;
	private final String subject;
	private final String attachment;
	
	
	public Email(String from, String to, String subject, String attachment) {
		super();
		this.from = from;
		this.to = to;
		this.subject = subject;
		this.attachment = attachment;
	}


	public String getFrom() {
		return from;
	}


	public String getTo() {
		return to;
	}


	public String getSubject() {
		return subject;
	}


	public String getAttachment() {
		return attachment;
	}
	
	
}
