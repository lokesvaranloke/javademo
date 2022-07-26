package tokenizer;

import java.util.StringTokenizer;

public class stringtotokens {

	public static void main(String[] args) {
		
		stringtotokens("When life gives you lemons, make lemonade"," ");
		stringtotokens("When,life,gives,you,lemons,make,lemonade",",");
		stringtotokens("When-life-gives-you-lemons-make-lemonade","-");
	}

	public static void stringtotokens(String s, String delim) {
		
		StringTokenizer st = new StringTokenizer(s,delim);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println("-----------------------------");
	}
}
