package chaining;

public class child extends parent {

	child(){
		System.out.println("Child cons : No args");
	}
	
	child(int x){
		super(x);
		System.out.println("Child cons : one arg");
	}
}
