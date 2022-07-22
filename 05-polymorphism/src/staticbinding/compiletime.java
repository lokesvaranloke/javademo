package staticbinding;

public class compiletime {

	public static void main(String[] args) {
		compiletime c = new compiletime();
		c.add(2,4);
		c.add(2, 3,4);
		c.add(2.3f,4.5f);
		
	}
	
	void add(int a,int b) {
		int res = a+b;
		System.out.println("Res = "+res);
	}
	
	void add(float a,float b) {
		float res = a+b;
		System.out.println("Res = "+res);
	}
	
	void add(int a,int b,int c) {
		int res = a+b+c;
		System.out.println("Res = "+res);
	}
}
