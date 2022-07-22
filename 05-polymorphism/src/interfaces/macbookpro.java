package interfaces;

public class macbookpro extends macbook{

	@Override
	public void start() {
		System.out.println("Inside macbookpro start");
	}
	
	@Override
	public void shutdown() {
		System.out.println("Inside macbookpro shutdown");
	}
	
	void prosmethod() {
		System.out.println("Inside macbookpro prosmethod");
	}
}
