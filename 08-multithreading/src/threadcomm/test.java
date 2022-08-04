package threadcomm;

public class test {

	public static void main(String[] args) {

		String tname = Thread.currentThread().getName();
		System.out.println(tname + " : Main method begin");

		worker w = new worker();
		Thread wt = new Thread(w);
		wt.setName("wt");
		wt.start();
		synchronized (wt) {
			try {
				System.out.println(tname+" : waiting");
				wt.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(tname+" : notified");
			System.out.println(tname + " : Total = " + w.gettotal());
		}

		System.out.println(tname + " : Main method end");
	}
}
