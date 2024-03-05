package final_modifier;

public class FinalModifierTest {

	static final double PI = 3.142;
	static final int NO_DAY_WEEK = 7;
	// Static final can only be used in class level
	
	final int stateConstant;
	
	public FinalModifierTest(int stateConstant) {
		this.stateConstant = stateConstant;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalModifierTest test = new FinalModifierTest(2000);
		System.out.println("stateConstant = "+test.stateConstant);
		
		//test.stateConstant = 5000;
		
		final int localConstant = 6000;
		System.out.println("LocalConstant : "+localConstant);
		
		System.out.println("PI : "+PI);
		System.out.println("No of Day of Week : "+NO_DAY_WEEK);
	}

}
