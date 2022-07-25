package anonclass;

public class myconn implements iconn {

	@Override
	public void connect(String conndetails) {
		System.out.println("connection success - "+conndetails);
		
	}

}
