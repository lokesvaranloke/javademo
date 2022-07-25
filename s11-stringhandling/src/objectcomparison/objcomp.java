package objectcomparison;
import stringpool.user;
public class objcomp {

	public static void main(String[] args) {
		
		user u1 = new user(1, "Jonathan");
		user u2 = new user(1, "Jonathan");
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
	}
	
}
