package assignment4;

public class UserManagement {
static int usercount=0;
int userId;
String username;
String password;
public UserManagement(int userId, String username, String password) {
	super();
	this.userId = userId;
	this.username = username;
	this.password = password;
}

public boolean authenticate(String inputpassword) {
	return this.password.equals(inputpassword);
}

}
