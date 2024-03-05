package abstraction.interface_test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PowerSystem ps = new PanasonicFan();
		ps.powerOn();
		ps.powerOff();
		ps.restart();
		
		ps = new MITV();
		ps.powerOn();
		ps.powerOff();
		ps.restart();
//		MITV mitv = (MITV)ps;
//		mitv.renderMedia();
	
		if (ps instanceof TV) {
			TV mitv = (TV)ps;
			mitv.renderMedia();
		}
		
		ps = new LenovoComputer();
		ps.powerOn();
		ps.powerOff();
		ps.restart();
		Circuit circuit = (Circuit)ps;
		circuit.Control();
		
		
	}

}
