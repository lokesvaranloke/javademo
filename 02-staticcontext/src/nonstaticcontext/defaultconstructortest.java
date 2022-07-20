package nonstaticcontext;
import finance.BankAccount;
public class defaultconstructortest {
	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount(100, 25000);
		
		BankAccount acc2 = new BankAccount(101, 52000);
		
		acc1.printAccount();
		acc2.printAccount();
	}
}
