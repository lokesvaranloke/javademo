package threadname;


public class threadname extends Thread {

	public static void main(String[] args) throws InterruptedException {
		threadname mt = new threadname();
		mt.setName("ilop");
		mt.start();

		String tname = Thread.currentThread().getName();

		for (int j = 1; j <= 20; j++) {
			System.out.println(tname + ": j: " + j + "\t");
			Thread.sleep(700);
		}
	}

	@Override
	public void run() {
		String tname = Thread.currentThread().getName();

		for (int i = 1; i <= 20; i++) {

			System.out.println(tname + ": i: " + i + "\t");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
