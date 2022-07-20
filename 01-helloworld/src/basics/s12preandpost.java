package basics;

public class s12preandpost {

	public static void main(String[] args) {
		int i = 3;
		
		int a = i++;
		
		System.out.println("a = " + a);
		System.out.println("i = " + i);
		

		
		String x = null;
		if (x==null) {
			System.out.println("x has a value");
		} else {
			System.out.println("x does not have a value");
		}

	}

}