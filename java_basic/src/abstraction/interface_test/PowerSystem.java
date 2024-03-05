package abstraction.interface_test;

public interface PowerSystem extends Fuse {
	
	static final String TYPE = "Digital";

	void powerOn();
	void powerOff();
	void restart();
	
	// Virtual extension
	default void hibernate() {
		System.out.println("Hibernate Function");
	}
	
	static void description() {
		System.out.println("This interface is for classes that has PowerSystem");
	}
	
	@Override
	default void powerCutOff() {
		// TODO Auto-generated method stub
		System.out.println("Fuse method overwritten");
	}
}
