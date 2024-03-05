package final_modifier;

public class FakeDatabase {

	static final Authentication[] database = {
			new Authentication("MgMg", "1234", true),
			new Authentication("MaSapal", "apple", false),
			new Authentication("KyawKyaw", "kyaw11", true),
			new Authentication("Aung", "2468", true),
			new Authentication("Kaung", "a123", false),
			new Authentication("HackZoe", "9999", false)
	};

	static Authentication authenticate(String username, String password) {
		for (final Authentication auth : database) {
			if (auth.username.equals(username) && auth.password.equals(password)) {
				return auth;
			}
		}
		return null;
	}
}

