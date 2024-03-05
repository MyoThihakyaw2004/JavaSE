package exception;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class FileClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileServer fileServer = new FileServer();
		Scanner userInput = new Scanner(System.in);
		
		while (true) {
			System.out.println("1.upload, 2.download");
			int operation = userInput.nextInt();
			System.out.println("Input file : ");
			String file = userInput.next();
			
			switch (operation) {
			case 1 -> {
				System.out.println("Connect Internet : ");
				boolean internet = userInput.nextBoolean();
				System.out.println("Index : ");
				int index = userInput.nextInt();
				
				try {
					if (fileServer.upload(internet, file, operation)) {
						System.out.println("File upload complete");
					} else {
						System.out.println("File upload failed");
					}
				} catch (FileAlreadyExistsException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					continue;
				}
			}
			
			case 2 -> {
				try {
					if (file != null && !file.isBlank()) {
						if (fileServer.download(file) ) {
							System.out.println("File is downloaded");
						} else {
							System.out.println("File is failed to download");
						}
					} else {
						System.out.println("File is invalid");
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			default ->
			throw new IllegalArgumentException("Unexpected value: " + operation);
			}
			
			System.out.println("Continue? yes-y or no-n");
			char decision = userInput.next().charAt(0);
			
			if (decision == 'n') break;
			
		}
		
		userInput.close();
		System.out.println("Program is terminated");
	}

}
