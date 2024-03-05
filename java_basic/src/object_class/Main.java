package object_class;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Student s1 = new Student(1L, "MgMg", "Civil", 24);
		Student s2 = new Student(1L, "MgMg", "Civil", 24);
		Student s3 = s1;
		Student s4 = new Student(2L, "KyawKyaw", "Archi", 22);
		
		Student s5 = new Student();
		Student s6 = new Student();
		
		System.out.println(s1);// s1.toString()
		System.out.println("s1's hashcode = "+ s1.hashCode());
		System.out.println("s2's hashcode = "+ s2.hashCode());
		System.out.println("s4's hashcode = "+ s4.hashCode());
		
//		System.out.println(s1.toString());
//		System.out.println(s1.getClass().getName());
//		System.out.println(s1.hashCode());
//		
		System.out.println("s1 == s2 : " + s1.equals(s2));
		System.out.println("s1 == s4 : " + s1.equals(s4));
		System.out.println("s5 == s6 : " + s5.equals(s6));
		
		Student s1Cloned = (Student) s1.clone();
		System.out.println(s1Cloned.toString());
		System.out.println("s1 == s1Cloned : " + s1.equals(s1Cloned));
	}

}
