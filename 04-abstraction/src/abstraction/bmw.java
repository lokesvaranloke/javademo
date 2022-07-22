package abstraction;

public abstract class bmw {

	void commonfunc() {
		System.out.println("Inside common fun");
	}
	//we need to give some methods like acceleration but we wont provide implementation
	// the other class who is extending will provide implementation
	//so to give methods without imple we give that as abstract 
	//and make class as abstract also
	abstract void accelerate();
}

