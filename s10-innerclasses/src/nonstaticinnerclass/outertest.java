package nonstaticinnerclass;

import nonstaticinnerclass.outer.inner;;
public class outertest {
	public static void main(String[] args) {
		
		outer ot = new outer(80);
		ot.f1();
		
		outer.inner in = ot.new inner(30);
		in.f2();
	}

}
