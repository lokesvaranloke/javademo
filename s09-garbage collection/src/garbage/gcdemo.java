package garbage;

public class gcdemo {

public static void main(String[] args) {
		
		Object obj1 = new gcdemo();
		Object obj2 = new gcdemo();
		
		obj1 = null;
		obj2 = null;
		
	}
	
	gcdemo() {
		System.out.println(this + " created...");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(this + " finalized...");
	}
}
