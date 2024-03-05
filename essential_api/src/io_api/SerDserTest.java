package io_api;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerDserTest {
	
	static void serialized() throws IOException{
		System.out.println("Inside serialized");
		Student student = new Student(1001L, "MgMg", "English", 16);
		student.studyHour = 6;
		System.out.println("Before Deserialized : ");
		System.out.println(student);
		File outputFile = new File("src/io_api/serialized/student_"+student.getId()+".ser");
		ObjectOutputStream outputStream = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(outputFile))
				); 
		outputStream.writeObject(student);
		System.out.println("Student object is serialized");
		outputStream.close();
	}
	
	static void deserialized() throws IOException, ClassNotFoundException {
		System.out.println("Inside Deserialized");
		File outputFile = new File("src/io_api/serialized/student_1001.ser");
		ObjectInputStream inputStream = new ObjectInputStream(new BufferedInputStream(
				new FileInputStream(outputFile))
				);
		Student student = (Student) inputStream.readObject();
		System.out.println("After Deserialization");
		System.out.println(student);
		inputStream.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			deserialized();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		try {
//			serialized();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
