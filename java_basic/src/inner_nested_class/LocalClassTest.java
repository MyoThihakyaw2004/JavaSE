package inner_nested_class;

public class LocalClassTest {

	static void checkPhoneNo(String phNo1, String phNo2) {
		
		class PhoneNoChecker {
			long phNo1Length = phNo1.length();
			long phNo2Length = phNo2.length();
			
			boolean IsPhNo1Valid() {
				return (phNo1.startsWith("09") && phNo1Length == 11);
			}
			boolean IsPhNo2Valid() {
				return (phNo2.startsWith("09") && phNo2Length == 11);
			}
		}
		
		PhoneNoChecker phoneNoChecker = new PhoneNoChecker();
		
		if (phoneNoChecker.IsPhNo1Valid()) {
			System.out.println("Phone Number1 is valid");
		} else {
			System.out.println("Phone Number1 is not valid");
		}
		
		if (phoneNoChecker.IsPhNo2Valid()) {
			System.out.println("Phone Number2 is valid");
		} else {
			System.out.println("Phone Number2 is not valid");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkPhoneNo("09777888666", "0966677788");
	}

}
