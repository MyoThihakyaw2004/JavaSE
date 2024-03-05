
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= 100; i++) {
			
			if (i % 3 != 0 && i % 5 != 0) {
				System.out.println(i);
				continue;
			}
			
			if (i % 3 == 0) {
				System.out.print("Fizz");
			}
			
			if (i % 5 == 0) {
				System.out.print("Buzz");
			}
			
			System.out.println();
		}
	}

}
