package basics;

public class s08stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello World";
		System.out.println(s);
		System.out.println(s.length());
		System.out.println("Index of w :"+s.indexOf('W'));
		System.out.println("char at pos:"+s.charAt(3));
		System.out.println("Index of L = "+s.indexOf('l'));
		// to find next l in same string we need to give starting point i.e. search after 3
		System.out.println("Index of 2nd L = "+s.indexOf('l',3));
		System.out.println("Index of 3rd L = "+s.indexOf('l',4));
		//substring
		System.out.println("Substring :"+s.substring(3));
		System.out.println("Substring :"+s.substring(3,8));
		//split
		String[] s2=s.split(" ");
		System.out.println(s2[0]);
		System.out.println(s2[1]);
		//replace
		System.out.println("Replaced:"+s.replace("l","j"));
		System.out.println("Upper:"+s.toUpperCase());
		System.out.println("Lower:"+s.toLowerCase());
	}

}