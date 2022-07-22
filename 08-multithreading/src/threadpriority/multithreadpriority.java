package threadpriority;

public class multithreadpriority extends Thread {

	public static void main(String[] args) {
		
		multithreadpriority mt1 = new multithreadpriority();
		mt1.setName("mt1");
		mt1.setPriority(MIN_PRIORITY);
		mt1.start();
		//priority is a rare case. sometimes it prints which starts first and not as priority. its depends on jvm only
		multithreadpriority mt2 = new multithreadpriority();
		mt2.setName("mt2");
		mt2.setPriority(MAX_PRIORITY);
		mt2.start();
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

}
