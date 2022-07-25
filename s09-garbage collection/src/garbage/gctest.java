package garbage;

public class gctest {

public static void main(String[] args) {
		
		// creating object WITHOUT any reference
		new employee(1);
		new employee(2);
		
		// creating objects WITH reference
		Object obj1 = new employee(3);
		Object obj2 = new employee(4);
		
		System.gc();
		
		
	}
}
