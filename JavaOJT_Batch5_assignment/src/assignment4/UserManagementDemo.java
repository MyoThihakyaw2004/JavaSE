package assignment4;

import java.util.Scanner;

public class UserManagementDemo {
	 public static void main(String[] args) {
		 		 
	        User customer = new User("johnDoe", "password123", "CUSTOMER");
	        if (customer.authenticate("password123")) {
	            System.out.println("Authentication successful!");
	        } else {
	            System.out.println("Authentication failed!");
	        }

	        UserProfile profile = customer.getProfile();
	        profile.setFirstName("John");
	        profile.setLastName("Doe");
	        profile.setEmail("john.doe@example.com");
	        profile.setAddress("123 Main St, Anytown");

	        System.out.println("User's full name: " + profile.getFirstName() + " " + profile.getLastName());
	    }
}
