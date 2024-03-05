package encapsulation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person person = new Person();
//		person.setName("Kyaw Kyawnrc");
//		person.setNrc("12/blabla");
//		person.setAge(24);
		
		Person person = new Person("MaSapal", "8/blabla", 22);
		
		System.out.println("Name : " + person.getName());
		System.out.println("Name : " + person.getNrc());
		System.out.println("Name : " + person.getAge());
	}

}
