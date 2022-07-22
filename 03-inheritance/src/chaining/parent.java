package chaining;

public class parent {

	int x;
	
	parent(){
		//from no arg cons i am calling one arg with this keyword by passing value
		//this(25);
		System.out.println("Parent cons : No args");
	}
	
	parent(int x){
		//u can also call from here to no arg.. but 1 at a time --> this();
		this.x=x;
		System.out.println("Parent cons : one arg");
	}
}
