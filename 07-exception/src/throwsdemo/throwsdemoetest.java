package throwsdemo;
import java.io.*;
public class throwsdemoetest {

		public static void main(String[] args) {
			
			throwsdemoetest t = new throwsdemoetest();
			try {
				t.readFromFile();
			} catch (FileNotFoundException e) {
				System.out.println("Hello");
			}
			
		}

		void readFromFile() throws FileNotFoundException{
			FileInputStream fis = new FileInputStream("C:\\java\\hello.txt");
		}
	}


