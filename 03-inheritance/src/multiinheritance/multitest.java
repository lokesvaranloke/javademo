package multiinheritance;

public class multitest {

	public static void main(String[] args) {
		//when we have constructor in parent and child class. if we create an object for child class in test class then jvm will first create parent class and ivokes parent constructor
		//and then child class and child constructor
		child c = new child();
		c.f1();
		c.f2();
		
	}
}
