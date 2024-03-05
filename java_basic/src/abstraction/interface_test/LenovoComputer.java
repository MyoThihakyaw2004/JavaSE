package abstraction.interface_test;

public class LenovoComputer implements PowerSystem, Circuit {

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("LenovoComputer is poweringOn");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("LenovoComputer is poweringOff");
	}

	@Override
	public void restart() {
		// TODO Auto-generated method stub
		System.out.println("LenovoComputer is restarting");
	}

	@Override
	public void Control() {
		// TODO Auto-generated method stub
		System.out.println("Circuit is controlling Lenovo Computer");
	}

	@Override
	public void hibernate() {
		// TODO Auto-generated method stub
		PowerSystem.super.hibernate();
		System.out.println("Lenovo Computer is hibernating");
	}
}
