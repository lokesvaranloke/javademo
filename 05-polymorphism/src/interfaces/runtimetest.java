package interfaces;

public class runtimetest {

	public static void main(String[] args) {
		
		//up casting - implicit
		applelaptop a = new macbookair();
		a.start();
		a.shutdown();
		
		macbook m1 = new macbookair();
		//down casting - explicit
		macbookair obj = (macbookair) m1;
		
		macbook m2 = new macbookpro();
		macbookpro obj2 = (macbookpro) m2;
		obj2.prosmethod();
	}
	
	
}
