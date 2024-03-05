package io_api;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamIO {
	
	static String inputPath = "src/io_api_origin/bird.jpg";
	static String outputPath = "src/io_api_destination/bird_copy.jpg";
	
	static void copyImageWithBuffer() throws IOException {
		System.out.println("Inside copyImageWithoutBuffer");
		File inputFile = new File(inputPath);
		System.out.println("File Bytes : " + inputFile.length());
		File outputFile = new File(outputPath);
		
		BufferedInputStream inputStream = new BufferedInputStream(
				new FileInputStream(inputFile)
					);
		BufferedOutputStream outputStream = new BufferedOutputStream(
				new FileOutputStream(outputFile)
					);
		
		byte[] buffer = new byte[4096];
		
		long start = System.currentTimeMillis();
		while (inputStream.read(buffer, 0, buffer.length) != -1) {
			outputStream.write(buffer, 0, buffer.length);
		}
		
		long ellpased = System.currentTimeMillis() - start;
		System.out.println("Ellapsed time : " + ellpased);
		
		System.out.println("Image is copied");
		inputStream.close();
		outputStream.close();
	}
	
	static void copyImageWIthoutBuffer() throws IOException {
		System.out.println("Inside copyImageWithoutBuffer");
		File inputFile = new File(inputPath);
		System.out.println("File Bytes : " + inputFile.length());
		
		File outputFile = new File(outputPath);
		
		FileInputStream inputStream = new FileInputStream(inputFile);
		FileOutputStream outputStream = new FileOutputStream(outputFile);
	
		int readByte = 0;
		long start = System.currentTimeMillis();
		while ((readByte = inputStream.read()) != -1) {
			outputStream.write(readByte);
		}
		long ellapsed = System.currentTimeMillis() - start;
		System.out.println("Ellapsed time : " + ellapsed);
		
		System.out.println("Image is copied");
		inputStream.close();
		outputStream.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			copyImageWithBuffer();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
