package fullabstraction;

public class toyota implements car{

	@Override
	public void go() {
		System.out.println("Inside toyota go");
		
	}

	@Override
	public void stop() {
		System.out.println("inside toyota stop");
		
	}

}
