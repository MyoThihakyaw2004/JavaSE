package object_class;

import java.util.Objects;

public class Student implements Cloneable {

	private Long id;
	private String name;
	private String major;
	private Integer age;
	
	public Student() {}

	public Student(Long id, String name, String major, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.major = major;
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", major=" + major + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, id, major, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(age, other.age) && Objects.equals(id, other.id) && Objects.equals(major, other.major)
				&& Objects.equals(name, other.name);
	};
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "[id="+id+",name="+name+",major="+major+",age="+age+"]";
//	}
//	
//	private int getStringValue(String str) {
//		int result = 0;
//		
//		for (int i = 0; i < str.length(); i++) {
//			result += str.charAt(i);
//		}
//		
//		return result;
//	}
//	
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return id.intValue() * (getStringValue(name)+getStringValue(major)) * age;
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		return this.hashCode() == obj.hashCode();
//	}
	
}
