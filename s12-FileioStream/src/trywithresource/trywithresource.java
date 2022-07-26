package trywithresource;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class trywithresource {

	public static void main(String[] args) {

		try (FileReader fr = new FileReader("C:\\Javafd\\New folder\\testforbufferreader.txt");
				BufferedReader br = new BufferedReader(fr);) {

			String line;
			int count = 0;
			while ((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line);
				while (st.hasMoreTokens()) {
					count++;
					st.nextToken();
				}
			}
			System.out.println("Count is " + count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
