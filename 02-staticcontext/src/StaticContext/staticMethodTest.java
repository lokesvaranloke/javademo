package StaticContext;

public class staticMethodTest {

	static void method() {
		System.out.println("Inside static method - method()");
	}
	
	static {
		System.out.println("Inside static block");
		staticMethodTest.method();
	}
	
	public static void main(String[] args) {

		System.out.println("Inside main method");
		staticMethodTest.method();
	}

}

