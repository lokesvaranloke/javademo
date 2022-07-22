package runnabledemo;

public class runnabletest {

	public static void main(String[] args) throws InterruptedException {
		
		String tname = Thread.currentThread().getName();
		System.out.println(tname +": main method begins");
		checkprocessor c = new checkprocessor();
		Thread t = new Thread(c);
		t.setName("CP");
		t.start();
		t.join();
		System.out.println(tname +": main method ends");
	}
	
}
