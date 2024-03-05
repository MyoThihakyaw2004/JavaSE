package abstraction.interface_test;

public class LuminousInventor implements PowerSystem {

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("LuminousInventor is powering on");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("LuminousInventor is powering off");
	}

	@Override
	public void restart() {
		// TODO Auto-generated method stub
		System.out.println("LuminousInventor is restarting");
	}
	
	@Override
	public void hibernate() {
		// TODO Auto-generated method stub
		PowerSystem.super.hibernate();
		System.out.println("LuminousInverter is hibernating");
	}

}
