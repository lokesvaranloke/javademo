package localinner;

public class outer {

	void f1() {
		System.out.println("Inside outer.f1() method");
		
		class LocalInner {
			private void f2() {
				System.out.println("Inside LocalInner.f2() method");
			}
		}
		
		LocalInner li = new LocalInner();
		li.f2();
		
	}
}
