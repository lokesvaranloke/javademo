package anonclass;

public class test {

	public static void main(String[] args) {

		iconn newcon = new iconn() {

			@Override
			public void connect(String conndetails) {
				System.out.println("New connection established using anonymous class - " + conndetails);
			}
		};

		newcon.connect("ProductionServer");

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Anonymous worker in a separate thread");
			}
		});
		t1.start();

	}
}
