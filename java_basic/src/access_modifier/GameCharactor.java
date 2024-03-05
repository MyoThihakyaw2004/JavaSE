package access_modifier;

public class GameCharactor {

	public static int baseDamage = 200;
	
	public String name;
	public int hp;
	public int mp;
	public int damage;
	
	
	
	public GameCharactor(String name, int hp, int mp, int damage) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.damage = damage;
	}

	public void attack(GameCharactor otherCharactor) {
		System.out.println(name+" attack "+otherCharactor.name);
		int effectDamage = baseDamage+damage;
		System.out.println("Your Damage is "+effectDamage);
		otherCharactor.hp -= effectDamage;
	}
	
	public void fillHp(int hp) {
		this.hp += hp;
	}
	
	public void fillMp(int mp) {
		this.mp += mp;
	}
	
	public void getStatus() {
		System.out.println(name+" status : ");
		System.out.println("Hp : "+hp);
		System.out.println("Mp : "+mp);
		System.out.println("damage : "+damage);
	}

}
