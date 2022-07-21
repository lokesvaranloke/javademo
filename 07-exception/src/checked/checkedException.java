package checked;

import java.io.*;

public class checkedException {

	public static void main(String[] args) {
		
		try {
			FileInputStream f = new FileInputStream("C:\\java\\hello.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} finally {
			System.out.println("finally");
		}
	}
}
