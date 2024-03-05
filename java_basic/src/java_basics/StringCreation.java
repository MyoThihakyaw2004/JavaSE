package java_basics;

public class StringCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "hello"; // interning -> search if hello already exist in string pool
							 // create one and return reference
							
		s1 = "orange";
		String s2 = "hello"; // interning -> reference of existing hello object.
		String s3 = s2;
		System.out.println(s1); // go to s1's address -> object -> state
		System.out.println("s1 == 2 " + (s1 == s2)); // concatenation
		System.out.println("s1 == 3 " + (s1 == s3));
		System.out.println("s2 == 2 " + (s2 == s2));
		
		String s4 = new String("hello"); // Heap -> hello
		String s5 = new String("hello"); // heap -> another hello
		
		System.out.println("s4 == s5 " + (s4 == s5));
		System.out.println("s2 == s4 " + (s2 == s4));
		System.out.println("s2 == s5 " + (s2 == s5));
		System.out.println("value of s1 = " + s1);
		System.out.println("value of s2 = " + s2);
		System.out.println("value of s3 = " + s3);
		
		
		System.out.println("s2.equals(s4)? " + s2.equals(s4));
		
	}

}
