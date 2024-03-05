package java_basics;

public class ConstructorTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee yeye = new Employee(213L, "YeYe", "ye@gmail.com", "stuff", 2000);
		System.out.println("YeYe's Information");
		System.out.println("ID : " + yeye.id);
		System.out.println("Name : " + yeye.name);
		System.out.println("Email : " + yeye.email);
		System.out.println("Role : " + yeye.role);
		System.out.println("Salary : " + yeye.salary);
		
//		Employee mgmg = new Employee();
//		mgmg.id = 1001L;
//		mgmg.name = "MgMg";
//		mgmg.email = "m@gmail.com";
//		mgmg.role = "manager";
//		mgmg.salary = 3000.456;
//		
//		System.out.println("MgMg's Information");
//		System.out.println("ID : " + mgmg.id);
//		System.out.println("Name : " + mgmg.name);
//		System.out.println("Email : " + mgmg.email);
//		System.out.println("Role : " + mgmg.role);
//		System.out.println("Salary : " + mgmg.salary);
//		
//		mgmg.update(101L, "JustinMg", "j123@gmail.com", "GM", 9000.123);
//	
//		System.out.println("MgMg's Updated Information");
//		System.out.println("ID : " + mgmg.id);
//		System.out.println("Name : " + mgmg.name);
//		System.out.println("Email : " + mgmg.email);
//		System.out.println("Role : " + mgmg.role);
//		System.out.println("Salary : " + mgmg.salary);
	}

}
