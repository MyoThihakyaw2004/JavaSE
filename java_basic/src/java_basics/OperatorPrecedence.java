package java_basics;

public class OperatorPrecedence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 20+30-40/4*10;
		int result2 = (20+30)-(40/(4*10));
		int result3 = 20+((30-40)/4*10);
		int result4 = (20+30-40)/4*10;
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}
}
