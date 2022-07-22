package fullabstraction;

public class honda implements car {

	@Override
	public void go() {
		
		System.out.println("Inside honda go");
	}

	@Override
	public void stop() {
		
		System.out.println("Inside honda stop");
	}
	
}
