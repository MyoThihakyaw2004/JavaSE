package predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FitterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<User> userList = Arrays.asList(
			new User(1001L, "MgMg", "user"),
			new User(1002L, "MaSapal", "user"),
			new User(1003L, "AungMyat", "admin"),
			new User(1004L, "ZawZaw", "user"),
			new User(1005L, "AyeAye", "user"),
			new User(1006L, "MgMg", "admin")
				);
		
		List<User> adminList = filterByRole(userList, ur -> ur.getRole().equals("admin"));
		System.out.println("Admin List : ");
		Consumer<User> printUser = ur -> System.out.println(ur);
		
		adminList.forEach(printUser);
		
		List<User> userRoleList = filterByRole(userList, ur -> ur.getRole().equals("user"));
		System.out.println("Role user List : ");
		userRoleList.forEach(printUser);
		
		
//		Consumer<User> printUser = ur -> System.out.println(ur);
//		
//		userList.forEach(printUser);
	}
	
	static List<User> filterByRole(List<User> userList, Predicate<User> filter) {
		List<User> filteredList = new ArrayList<User>();
		
		userList.forEach(ur -> {
			if (filter.test(ur)) {
				filteredList.add(ur);
			}
		});
		
		return filteredList;
	}

}
