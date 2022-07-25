package stringpool;

public class stringpool {

	public static void main(String[] args) {
		
		user u1 = new user(1, "hari");
		user u2 = new user(2, "hari");
		
		System.out.println(u1);
		System.out.println(u2);
		
		String s1 = "Max";
		String s2 = "Max";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
