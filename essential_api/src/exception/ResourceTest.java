package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ResourceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\exceptiontest\\test1.txt");
		Scanner fileScanner = null;
		try {
			fileScanner = new Scanner(file);
			
			while (fileScanner.hasNextLine()) {
				System.out.println(fileScanner.nextLine());
			}
			
			fileScanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fileScanner != null) {
				fileScanner.close();
			}
		}
	}

}
