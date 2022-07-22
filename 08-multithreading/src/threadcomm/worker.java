package threadcomm;

public class worker implements Runnable {

	private int total;

	public int gettotal() {
		return total;
	}

	@Override
	public void run() {
		String tname = Thread.currentThread().getName();
		System.out.println(tname + " : calculation begin");
		synchronized (this) {
			for (int i = 1; i <= 20; i++) {
				total += i;
			}
			System.out.println(tname + " : calculation completed notifying");
			this.notify();
		}
		System.out.println(tname + " : calculation end");

	}

}
