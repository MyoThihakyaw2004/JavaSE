package prevent_polymorphism;

public class PasswordGenerator {

	public final String generate(int strength) {
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < strength; i++) {
			int index = (int)(chars.length() * Math.random());
			sb.append(chars.charAt(index));
		}
		
		return sb.toString();
		
		// My old version
		//String chars = "" ;
//		for (int i = 0; i < strength; i++) {
//			chars += Character.toString(2);
//		}
//		
//		return chars;
	}
}
