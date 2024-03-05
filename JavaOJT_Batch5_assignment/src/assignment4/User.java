package assignment4;

public class User {

	 private static int userCounter = 0; // static state for generating unique user IDs
	    private int userId;
	    private String username;
	    private String password;
	    private String role; // "CUSTOMER", "EMPLOYEE", "ADMIN"
	    private UserProfile profile;

	    // Constructor
	    public User(String username, String password, String role) {
	        this.userId = ++userCounter;
	        this.username = username;
	        this.password = password; // In a real-world scenario, you'd hash and salt this
	        this.role = role;
	        this.profile = new UserProfile();
	    }

	    // Authentication method
	    public boolean authenticate(String inputPassword) {
	        return this.password.equals(inputPassword); // In a real-world scenario, you'd compare hashed values
	    }

	    // Role-based access check
	    public boolean hasRole(String role) {
	        return this.role.equals(role);
	    }

	    // Profile management
	    public UserProfile getProfile() {
	        return profile;
	    }

	    public void updateProfile(UserProfile updatedProfile) {
	        this.profile = updatedProfile;
	    }
	}

	// UserProfile class to manage user details
	class UserProfile {
	    private String firstName;
	    private String lastName;
	    private String email;
	    private String address;

	    // Constructor (can be expanded with more fields)
	    public UserProfile() {
	        // This can be left empty if no specific initialization is needed
	    }

	    // Getters and setters for profile details
	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }
	}

