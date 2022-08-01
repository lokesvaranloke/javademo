package FileHandlingPractice;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\Javafd\\temp\\input.txt");
		FileWriter fw = new FileWriter("C:\\Javafd\\temp\\Filewritertest");
		
		int ch;
		while((ch=fr.read())!=-1) {
			fw.write(ch);
		}
		fr.close();
		fw.close();
	}
}
