package access_modifier_other;

import access_modifier.GameCharactor;

public class AccessModifierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GameCharactor noobmaster99 = new GameCharactor("noobmaster99", 2000, 500, 170);
		GameCharactor chouProlay = new GameCharactor("chouProLay", 1500, 200, 130);
		
		noobmaster99.getStatus();
		chouProlay.getStatus();
		
		noobmaster99.attack(chouProlay);

		System.out.println("After attacked : ");
		chouProlay.getStatus();
		
		chouProlay.fillHp(200);
		System.out.println("After hp fill: ");
		chouProlay.getStatus();
	}

}
