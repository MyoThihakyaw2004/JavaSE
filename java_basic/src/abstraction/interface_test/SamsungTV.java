package abstraction.interface_test;

public class SamsungTV extends TV implements PowerSystem{

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("MITV is poweringOn");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("MITV is poweringOff");
	}

	@Override
	public void restart() {
		// TODO Auto-generated method stub
		System.out.println("MITV is restarting");
	}

	@Override
	void renderMedia() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV is showing media");
	}
	
	
}
