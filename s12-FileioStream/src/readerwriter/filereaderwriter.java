package readerwriter;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filereaderwriter {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\Javafd\\New folder\\test.txt");
		FileWriter fw = new FileWriter("C:\\Javafd\\New folder\\testwriter.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		int ch;
		while((ch=fr.read())!=-1) {
			fw.write(ch);
		}
		fr.close();
		fw.close();
	}
}
