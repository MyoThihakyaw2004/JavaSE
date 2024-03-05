package abstraction.interface_test;

public class PanasonicFan implements PowerSystem {

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("Panasonic fan is poweringON");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("Panasonic fan is poweringOFF");
	}

	@Override
	public void restart() {
		// TODO Auto-generated method stub
		System.out.println("Panasonic fan is restarting");
	}

}
