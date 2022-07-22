package runnabledemo;

public class checkprocessor implements Runnable{

	@Override
	public void run() {

		String tname = Thread.currentThread().getName();
		System.out.println(tname+ " Process checks");
	}

}
