package bufferreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class bufferreader {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("C:\\Javafd\\New folder\\testforbufferreader.txt");

		BufferedReader br = new BufferedReader(fr);
		String line;
		int count=0;
		while ((line = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(line);
			while(st.hasMoreTokens()) {
				count++;
				st.nextToken();
			}
		}
		br.close();
		fr.close();
		System.out.println("Count of words is "+count);
	}
}
