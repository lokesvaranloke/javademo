package yielddemo;

public class yieldtest {

	public static void main(String[] args) {
		
		simpleloop s1 = new simpleloop();
		Thread t1 = new Thread(s1);
		t1.setName("t1");
		t1.start();
		
		simpleloop s2 = new simpleloop();
		Thread t2 = new Thread(s2);
		t2.setName("t1");
		t2.start();
		
		String tname = Thread.currentThread().getName();
		for(int i=1;i<=10;i++) {
			System.out.println(tname+": "+i);
		}
	}
}
