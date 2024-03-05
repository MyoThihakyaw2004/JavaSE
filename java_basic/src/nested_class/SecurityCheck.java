package nested_class;

public class SecurityCheck {

	private String password;
	
	public SecurityCheck(String password) {
		super();
		this.password = password;
	}
	
	public class Check {
		
		public String checkPassword() {
			int point = 0;
			
			for (int i = 0; i < password.length(); i++) {
				if (Character.isLetter(password.charAt(i))) {
					point++;
					break;
				}
				
			}
				
			for (int i = 0; i < password.length(); i++) {
				if (Character.isDigit(password.charAt(i))) {
					point++;
					break;
				}
				
			}
			
			for (int i = 0; i < password.length(); i++) {
				char checkChar = password.charAt(i);
				if (Character.isDigit(checkChar) || Character.isLetter(checkChar)) {
					point++;
					break;
				}
			}
				
			String result = "";
			if (password.length() >= 8) {
				if (point <= 1) {
					result = "Password is weak";
				} else if (point == 2) {
					result = "Password is average";
				} else {
					result = "Password is strong";
				}
			} else {
				result = "Password is weak";
			}
			
			return result;
		}
		
		public String checkPassword1() {
			Check check = new Check();
			return check.checkPassword();
		}
	}
}
