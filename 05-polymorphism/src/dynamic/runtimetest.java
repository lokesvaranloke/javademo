package dynamic;

public class runtimetest {

	public static void main(String[] args) {
		
		macbook mc1 = new macbookpro();
//		mc1.start();
//		mc1.shutdown();
		operatemac(mc1);
		
		macbook mc2 = new macbookair();
//		mc2.start();
//		mc2.shutdown();
		operatemac(mc2);
	}
	
	static void operatemac(macbook mac) {
		mac.start();
		mac.shutdown();
	}
}
