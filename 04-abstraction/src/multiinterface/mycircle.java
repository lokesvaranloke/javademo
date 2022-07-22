package multiinterface;

public class mycircle implements circle,circletwo {

	@Override
	public void calculate() {
		System.out.println(circle.pi);
		
	}

	@Override
	public void calculate(int r) {
		
		
	}

}
