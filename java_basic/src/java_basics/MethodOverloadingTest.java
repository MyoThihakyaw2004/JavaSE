package java_basics;

public class MethodOverloadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaxFInder maxFinder = new MaxFInder();
		System.out.println("max of 20, 30 = "+maxFinder.max(20,30));
	
		MaxFInder maxFinder2 = new MaxFInder();
		System.out.println("max of 23.44, 34.55, 15.88 = "+ maxFinder2.max(23.44, 34.55, 15.88));
		
		MaxFInder maxFinder3 = new MaxFInder();
		System.out.println("max of apple, banana = "+maxFinder3.max("apple", "banana"));
		System.out.println("Max of 10, 11, 20, 12, 16 = " + maxFinder3.max(new int[] {10, 11, 20, 12, 16}));
		
		MaxFInder.max();
	}

}
