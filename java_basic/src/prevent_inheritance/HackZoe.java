package prevent_inheritance;

public class HackZoe {

	private String bankAccount;
	
	public void hijeck() {
		
		for(Email email : EmailServer.readEmail()) {
			if (email == null) {
				continue;
			}
			
//			email.setFrom("?????");
//			email.setAttachment("trojan.exe");
//			email.setSubject("Transfer Money to get back your emails : "+ bankAccount);
		}
		
	}

	public HackZoe(String bankAccount) {
		super();
		this.bankAccount = bankAccount;
	}
	
}
