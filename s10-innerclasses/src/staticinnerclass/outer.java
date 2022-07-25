package staticinnerclass;

public class outer {

	static class inner{
		static void f2() {
			System.out.println("static method : Inner.f2()");;
		}
		
		void f3() {
			System.out.println("static method : Inner.f3()");
		}
	}
	static void f1() {
		System.out.println("static method : Outer.f1()");;
	}
	
	public static void main(String[] args) {
		outer.f1();
		
		outer.inner.f2();
		
		//outer.inner.f3();
		//you cannot access non static method by outer.inner.f3()
		outer.inner in = new outer.inner();
		in.f3();
		//if outer class is static and inner class is non static like this
		//you need to create with outer.inner
		
		
	}
}
