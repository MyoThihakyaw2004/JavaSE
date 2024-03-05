package io_api;

import java.io.File;
import java.io.IOException;

public class FileClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File folder2 = new File("src/io_api/new/folder1/folder2");
		
		if (folder2.exists()) {
			boolean result =  folder2.delete();
			System.out.println("Is folder deleted? "+result);
		} else {
			System.out.println("folder is not found");
		}

//		if (!folder2.exists()) {
//			boolean result = folder2.mkdirs();
//			System.out.println(folder2.getName() + " is created ? " + result);
//		} else {
//			System.out.println(folder2.getName() + " already exists");
//		}
		
		//		if (!folder2.exists()) {
//			boolean result = folder2.mkdir();
//			System.out.println(folder2.getName() + " is created ? " + result);
//		} else {
//			System.out.println(folder2.getName() + " already exists");
//		}
		
//		File text6 = new File("src/io_api/text/text6.txt");
		
//		if (text6.exists()) {
//			boolean result = text6.delete();
//			System.out.println("Is file deleted? " + result);
//		} else {
//			System.out.println(text6.getName()+" is not found");
//		}
		
//		if (!text6.exists()) {
//			try {
//				boolean result = text6.createNewFile();
//				System.out.println("Is file created? "+ result);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		} else {
//			System.out.println("File already exists");
//		}
		
//		File text = new File("src/io_api/text");
//		
//		File[] files = text.listFiles();
//		for (final File file : files) {
//			System.out.println(file.getAbsolutePath());
//		}
//		
//		String[] fileNames = text.list();
//		
//		System.out.println("File, Folder List of text : ");
//		for(final String fileName : fileNames) {
//			System.out.println(fileName);
//		}
		
//		File text = new File("src/io_api/text");
//		System.out.println("Total Space : " + text.getTotalSpace()/Math.pow(1024, 3) + " GB");
//		System.out.println("Free Space : " + text.getFreeSpace()/Math.pow(1024, 3) + " GB");
//		System.out.println("Usable Space : " + text.getUsableSpace()/Math.pow(1024, 3) + " GB");
		/*
		System.out.println(text.getName()+ " can be read?" + text.canRead());
		System.out.println(text.getName()+ " can be written?" + text.canWrite());
		System.out.println(text.getName()+ " can be executed?" + text.canExecute());

		System.out.println(text.getName() + " isAbsolute?" + text.isAbsolute());
		System.out.println(text.getName() + " isDirectory?" + text.isDirectory());
		System.out.println(text.getName() + " isFile?" + text.isFile());
		System.out.println(text.getName() + " isHidden?" + text.isHidden());
		*/
		
		/*
		File text5 = new File("src/io_api/text/sample/../text5.txt");
		System.out.println(text5.getName()+ " can be read?" + text5.canRead());
		System.out.println(text5.getName()+ " can be written?" + text5.canWrite());
		System.out.println(text5.getName()+ " can be executed?" + text5.canExecute());

		System.out.println(text5.getName() + " isAbsolute?" + text5.isAbsolute());
		System.out.println(text5.getName() + " isDirectory?" + text5.isDirectory());
		System.out.println(text5.getName() + " isFile?" + text5.isFile());
		System.out.println(text5.getName() + " isHidden?" + text5.isHidden());
		*/

		/*if (text5.exists()) {
			System.out.println(text5.getName() + " exists");
			System.out.println(text5.getAbsolutePath());
			
			try {
				System.out.println(text5.getCanonicalPath());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println(text5.getName() + " does not exist");
		}*/
	}

}
