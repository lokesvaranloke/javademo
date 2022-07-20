package StaticContext;


public class staticBlockTest {

	public static void main(String[] args) {
		System.out.println("Inside main method");
		System.out.println("Run a query");
	}
	
	//first main methods will call..for that jvm will load class
	// when class is loading it will run static blocks 
	static {
		System.out.println("Static block 1");
		System.out.println("Create connection to the DB");
	}
	
	static {
		System.out.println("Static block 2");
	}

}
