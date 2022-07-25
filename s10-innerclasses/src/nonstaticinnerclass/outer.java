package nonstaticinnerclass;

public class outer {

	private static int x = 50;
	private int y;
	
	outer(int y){
		this.y=y;
	}
	
	void f1() {
		System.out.println("outer class non static method : outer.f1()");
	}
	
	class inner{
		private int y;
		inner(int y){
			this.y=y;
		}
		
		void f2() {
			System.out.println("outer class x: "+outer.x);
			System.out.println("outer class y: "+outer.this.y);
			System.out.println("ineer class y: "+this.y);
		}
	}

}
