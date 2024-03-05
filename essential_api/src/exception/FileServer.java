package exception;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

public class FileServer {
	
	private String[] files = new String[20];
	
	public FileServer() {
		files[0] = "test.txt";
		files[1] = "image.jpg";
		files[3] = "sample.pdf";
		files[4] = "focus.exe";
		files[5] = "application.exe";
	}
	
	private boolean isExists(String file) {
		boolean exists = false;
		
		for (final String temp: files) {
			if (temp == null) {
				continue;
			}
			
			if(file.equals(temp)) {
				exists = true;
				break;
			}
		}
		return exists;
	}
	
	public boolean upload(boolean internetOk, String file, int index) throws InterruptedException, FileAlreadyExistsException {
		if (!internetOk) {
			throw new InterruptedException("Internet connection is interrupted");
		}
		
		if (isExists(file)) {
			throw new FileAlreadyExistsException("File already exists in server");
		}
		
		files[index] = file;
		return true;
	}
	
	public boolean download(String fileName) throws IllegalArgumentException, FileNotFoundException {
		if (fileName == null || fileName.isBlank()) {
			throw new IllegalArgumentException("filename is invalid");
		}
		
		if (!isExists(fileName)) {
			throw new FileNotFoundException();
		}
		
		return true;
	}
 }
