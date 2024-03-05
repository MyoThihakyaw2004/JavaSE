package lambda;

public class SimpleLambda {
	
	static void generateKey(int key, Randomizer random) {
		System.out.println("Key = " + (key * random.random()));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculatable add = (n1, n2) -> n1+n2;
		double result1 = add.calculate(20.0, 30.0);
		System.out.println("result1 = "+result1);
		
		Randomizer ran1000 = () -> (int)(Math.random() * 1000);
		System.out.println("Ran1000 : " + ran1000.random());
		
		generateKey(31, ran1000);
	}

}
