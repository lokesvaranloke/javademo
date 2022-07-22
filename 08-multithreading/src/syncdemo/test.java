package syncdemo;

public class test {

	public static void main(String[] args) {
		
		String tname = Thread.currentThread().getName();
		System.out.println(tname+": main begin");
		
		displaymsg d = new displaymsg();
		
		
		Thread t1 = new Thread(new worker(d, "Karthi"));
		t1.setName("t1");
		
		Thread t2 = new Thread(new worker(d, "Manoj"));
		t2.setName("t2");
		
		Thread t3 = new Thread(new worker(d, "Lucy"));
		t3.setName("t3");
		
		t1.start();
		t2.start();
		t3.start();
		System.out.println(tname+": main end");
		
	}
}
