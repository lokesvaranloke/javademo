package printwriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class printwriterdemo {

	public static void main(String[] args) {
		
		FileWriter fw=null;
		PrintWriter pw=null;
		try {
			fw = new FileWriter("C:\\Javafd\\New folder\\appendtest.txt",true);
			pw = new PrintWriter(fw);
			
			pw.println("Some new text is begin added");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw.close();
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
