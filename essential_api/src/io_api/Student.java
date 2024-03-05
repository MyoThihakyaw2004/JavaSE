package io_api;

import java.io.Serializable;

public class Student implements Serializable {
	
	
	
	/**
	 * 
	 */
//	private static final long serialVersionUID = 12345L;
	private static final long serialVersionUID = -7701791174880734941L;
	
	static Integer studyHour;
	private long id;
	private String name;
	private String major;
	private transient Integer age;
	
	public Student() {}
	
	public Student(long id, String name, String major, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.major = major;
		this.age = age;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
		return "Student [id=" + id + ", name=" + name + ", major=" + major + ", age=" +age +" studyHour=" + studyHour + "]";
	}
	
	
	
	
}
