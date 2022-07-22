package interruptdemo;

public class test {

	public static void main(String[] args) {
		
		String tname = Thread.currentThread().getName();
		System.out.println(tname +" : start");
		
		Thread w1 = new Thread(new worker());
		w1.setName("w1");
		w1.start();
		
		try {
			Thread.sleep(3000);
			w1.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(tname +" : end");
	}
}
