package nonstaticcontext;

public class nonstaticvariable {
	//static variable
	static int y=10;
	//non static variable
	//instance variable
	int n;
	
	static{
		System.out.println("Inside static block");
	}
	
	{
		System.out.println("Inside non static block");
	}
	
	nonstaticvariable(int x){
		System.out.println("Inside constructor");
		this.n=x;
	}
	
	public static void main(String[] args) {
		System.out.println("Inside main method");
		nonstaticvariable ns1 = new nonstaticvariable(20);
		nonstaticvariable ns2 = new nonstaticvariable(21);
		nonstaticvariable ns3 = new nonstaticvariable(22);
		
		System.out.println(ns1.n);
		System.out.println(ns1.y);
		
		System.out.println(ns2.n);
		System.out.println(ns2.y);
		
		System.out.println(ns3.n);
		System.out.println(ns3.y);
	}
}
