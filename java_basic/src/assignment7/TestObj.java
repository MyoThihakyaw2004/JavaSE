package assignment7;

public class TestObj {
	private String name;
	private int age;
	
	public TestObj(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "TestObj [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(!(obj instanceof TestObj)) {
			System.out.println("Different instance");
			return false;
		}
		
		TestObj testobj = (TestObj) obj;
		
		if (this == testobj) {
			System.out.println("Same object");
			return true;
		}
		
		if (this.name.equals(testobj.name) && (this.age == testobj.age)) {
			System.out.println("Same properties");
			return true;
		}
		
		return true;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}
