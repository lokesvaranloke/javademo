package FileHandlingPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fosdemo {

	public static void main(String[] args) {

		File f = new File("C:\\Javafd\\temp\\Filetest-out.txt");
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(f);
			System.out.println("File opened");
			String data = "Hello World";
			fos.write(data.getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("file closed");
		}

	}
}
