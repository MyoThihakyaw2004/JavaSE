package final_modifier;

class Authentication {
	String username;
	String password;
	final boolean premium;
	
	public Authentication(String username, String password, boolean premium) {
		this.username = username;
		this.password = password;
		this.premium = premium;
	}
}
