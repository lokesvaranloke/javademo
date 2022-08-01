package FileHandlingPractice;

import java.util.StringTokenizer;

public class stringtokenizer {

	public static void main(String[] args) {

		StringToTokens("When life gives you lemons, make lemonade"," ");

		StringToTokens("When,life,gives,you,lemons,make,lemonade",",");
	}

	private static void StringToTokens(String str, String delim) {
		StringTokenizer st = new StringTokenizer(str, delim);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println("_____________________________");
	}
}
