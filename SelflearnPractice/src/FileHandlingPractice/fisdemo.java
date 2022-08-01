package FileHandlingPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fisdemo {

	public static void main(String[] args) {
		
		File f = new File("C:\\Javafd\\temp\\input.txt");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(f);
			System.out.println("File opened");
			int i;
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("file closed");
		}
		
	}
}
