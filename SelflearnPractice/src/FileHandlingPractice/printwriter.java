package FileHandlingPractice;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class printwriter {

	public static void main(String[] args) {
		
		FileWriter fw= null;
		PrintWriter pw =null;
		try {
			fw = new FileWriter("C:\\Javafd\\temp\\input.txt", true);
			pw = new PrintWriter(fw);
			
			pw.println(" Adding new test is done");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw.close();
		}
		
	}
}
