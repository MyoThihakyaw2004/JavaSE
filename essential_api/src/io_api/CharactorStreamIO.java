package io_api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CharactorStreamIO {
	
	static String filePath1 = "src/io_api/text/text1.txt";
	
	static void writeFileWithPrintWriter() throws IOException {
		System.out.println("Inside writeFileWithWriter");
		File file = new File("src/io_api/text/text5.txt");
		
		PrintWriter writer = new PrintWriter(file);
		writer.printf("%d. %s %f %n", 1, "MgMg", 3000.44);
		writer.printf("%d. %s %f %n", 2, "KyawKyaw", 2000.44);
		writer.printf("%d. %s %f %n", 3, "AungAung", 1500.44);
		writer.printf("%d. %s %f %n", 4, "MyaMya", 2000.44);
		writer.printf("%d. %s %f %n", 5, "ZawZaw", 3400.44);
		
		System.out.println("File is written");
		writer.close();
	}
	
	static void writeWithBuffer() throws IOException {
		System.out.println("Inside writeWithBuffer");
		File file = new File("src/io_api/text/text4.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		
		writer.append("This is just test 1\n");
		writer.append("This is just test 2\n");
		writer.append("This is just test 3\n");
		writer.append("This is just test 4\n");
		writer.write("This is just test 1");
		
		System.out.println("File is written");
		writer.close();

	}
	
	static void writeFileWithoutBuffer() throws IOException {
		System.out.println("Inside WriteFileWithoutBuffer");
		File file = new File("src/io_api/text/text3.txt");
		FileWriter writer = new FileWriter(file);
		writer.append('A');
		writer.append('p');
		writer.append('p');
		writer.append('l');
		writer.append('e');
		writer.write(new char[] {' ', 'O', 'r', 'a', 'n', 'g', 'e'});
		
		System.out.println("File is written 5 charactors");
		writer.close();
	}
	
	static void readFileWithScanner() throws IOException {
		System.out.println("Inside readFileWithScanner");
		//File inputFile = new File(filePath1);
		File inputFile = new File("src/io_api/text/text2.txt");
		System.out.println("File bytes : " + inputFile.length());
		
		Scanner scanner = new Scanner(inputFile);
		
		double result = 0.0;
		while (scanner.hasNextDouble()) {
			double value = scanner.nextDouble();
			result += value;
		}
		System.out.println("Total : " +  result);
		
		//while (scanner.hasNextLine()) {
		//	System.out.println(scanner.nextLine());
		//}
		
		System.out.println("File is read");
		scanner.close();
	}
	
	static void readFileWithBuffer() throws IOException {
		System.out.println("Inside readFileWithBuffer");
		File inputFile = new File(filePath1);
		System.out.println("File bytes : " + inputFile.length());
		
		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		
		String line = "";
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
		
		System.out.println("File is read");
		reader.close();
	}
	
	static void readFileWithoutBuffer() throws IOException {
		System.out.println("Inside readFileWithoutBuffer");
		File inputFile = new File(filePath1);
		System.out.println("File bytes : " + inputFile.length());
		
		FileReader reader = new FileReader(inputFile);
		
		int readByte = 0;
		
		while ((readByte = reader.read()) != -1) {
			System.out.print((char)readByte);
		}
		
		System.out.println();
		System.out.println("File is read");
		reader.close();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//readFileWithBuffer();
			//readFileWithScanner();
			//writeFileWithoutBuffer();
			//writeWithBuffer();
			writeFileWithPrintWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
