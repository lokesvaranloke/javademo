package capsule;

public class test {

	public static void main(String[] args) {
		
		// no encapsulation
		student s = new student();
		s.id=1;
		s.name="Hari";
		s.age=22;
		s.coursename="JavaFsd";
		

		//writeonly object
		BankAccount ac = new BankAccount(10000);
		ac.setaccname("hari");
		ac.setaccountNumber(101);
		ac.deposit(3000);
		ac.withdraw(5000);
		ac.printdetails();
		
		
		//readonly object
		product p = new product(1,"mobile",50000);
		int id = p.getid();
		System.out.println("Product id:"+id);
	}
}
