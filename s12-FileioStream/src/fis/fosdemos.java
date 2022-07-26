package fis;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fosdemos {

	public static void main(String[] args) {
		
		File f = new File("C:\\Javafd\\New folder\\Filetest2.txt");
		FileOutputStream fos = null;
		
		try {
			fos=new FileOutputStream(f);
			System.out.println("Opened successfully");
			String s= "Hello World";
			fos.write(s.getBytes());
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
			System.out.println("File closed");
		}
		
		
	}
}
