package FileHandlingPractice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class trywithresources {

	public static void main(String[] args) {
		int count=0;
		try(FileReader fr = new FileReader("C:\\Javafd\\temp\\input.txt");
				BufferedReader br = new BufferedReader(fr)) {		
			String line;
			while((line=br.readLine())!=null) {
				StringTokenizer st = new StringTokenizer(line);
				count+=st.countTokens();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		System.out.println("count = "+count);
	}
	
}
