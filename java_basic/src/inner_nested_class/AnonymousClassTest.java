package inner_nested_class;

public class AnonymousClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine machine1 = new Machine() {
			
			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("Machine 1 is starting");
			}
		};
		
		machine1.start();
		
		Machine machine2 = new Machine() {
			
			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("Machine 2 is starting");
			}
		};
		
		machine2.start();
		
		Person person1 = new Person() {
			
			public void eat() {
				System.out.println("Person is eating");
			}
		};
		
		//person1.eat();
		person1.walk();
	}

}
