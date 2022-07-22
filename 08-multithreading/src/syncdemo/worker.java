package syncdemo;

public class worker implements Runnable{

	displaymsg d;
	String name;
	
	worker(displaymsg d, String name){
		this.d=d;
		this.name=name;
	}
	@Override
	public void run() {
		d.sayhello(name);
		
	}

}
