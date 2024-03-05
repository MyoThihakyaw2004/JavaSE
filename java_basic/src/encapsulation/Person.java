package encapsulation;

public class Person {

	private String name;
	private String nrc;
	private Integer age;
	
	public Person () {};
	
	public Person(String name, String nrc, Integer age) {
		setName(name);
		setNrc(nrc);
		setAge(age);
	}



	public String getName() {
		return name;
	}
	public void setName(String name) { 
		if (!name.isBlank()) this.name = name;
		else this.name = "blank Name";
	}
	public String getNrc() {
		return nrc;
	}
	public void setNrc(String nrc) {
		if (!nrc.isBlank()) this.nrc = nrc;
		else this.name = "blank NRC";
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		if (age > 0) this.age = age;
		else this.age = 1;
	}
	
	
	
	// Bad practice
//	public String retrieveName() {
//		return name;
//	}
//	
//	public void addName(String name) {
//		this.name = name;
//	}
}
