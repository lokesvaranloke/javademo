package interfaces;

public class macbookair extends macbookpro {

	@Override
	public void start() {
		System.out.println("Inside macbookair start");
	}
	
	@Override
	public void shutdown() {
		System.out.println("Inside macbookair shutdown");
	}
}
