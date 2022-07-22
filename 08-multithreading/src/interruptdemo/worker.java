package interruptdemo;

public class worker implements Runnable {

	@Override
	public void run() {
		String tname = Thread.currentThread().getName();
		System.out.println(tname +" : start");
		for(int i=1;i<=10;i++) {
			System.out.println(tname+": "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Interrupted");
				break;
			}
	}
		System.out.println(tname +" : end");
	}
}
