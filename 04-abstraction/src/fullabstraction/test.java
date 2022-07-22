package fullabstraction;

public class test {

	public static void main(String[] args) {
		
//		honda h = new honda();
//		h.go();
//		h.stop();
		
		//we can create with car interface also bcz it is interface
//		car h = new honda();
//		h.go();
//		h.stop();
		
//		car toyota  = new toyota();
//		toyota.go();
//		toyota.stop();
		
		//interface base implementation..it will just inject the diff implementation
		car c = new honda();
		c.go();
		c.stop();
		
//		car c = new toyota();
//		c.go();
//		c.stop();
		
	}
}
