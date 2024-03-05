package nested_class;

public class ArithmeticOperations {
	
	private double operand1;
	private double operand2;
	
	
	public ArithmeticOperations(double operand1, double operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}

	public class Addition {

		public double add(double op1, double op2) {
			return op1+op2;
		}
		
		public double add(double op1, double op2, double op3) {
			return op1+op2+op3;
		}
		
		public String add(String s1, String s2) {
			return s1+" "+s2;
		}
	}
	
	class Subtraction {
		
		double sub() {
			return operand1 - operand2;
		}
	}
	
	class Multiply {
		static int staticVar = 10000;
		private int multiplier;
		
		static void description() {
			System.out.println("Blueprint for multiplying");
		}
		
		public Multiply() {}
		
		public Multiply(int multiplier) {
			super();
			this.multiplier = multiplier;
		}

		double mul() {
			return operand1*operand2;
		}
		
		double multiplier() {
			return (operand1 + operand2) * multiplier;
		}
	}
}
