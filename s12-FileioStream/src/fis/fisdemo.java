package fis;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fisdemo {

	public static void main(String[] args) {
		
		File f = new File("C:\\Javafd\\New folder\\FileTest.txt");
		FileInputStream fis = null;
		
		try {
			fis=new FileInputStream(f);
			System.out.println("Opened successfully");
			int i;
			while((i=fis.read())!= -1) {
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
			System.out.println("File closed");
		}
		
		
	}
}
