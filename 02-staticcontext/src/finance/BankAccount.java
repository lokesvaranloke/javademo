package finance;

public class BankAccount {

	int accountNumber;
	int balanceTotal;
	static String bankName="SBI";
	static double interest=7.2;
	
	public BankAccount(int accnum, int total){
		this.accountNumber=accnum;
		this.balanceTotal=total;
	}
	
	public void printAccount() {
		System.out.println("Welcome to "+BankAccount.bankName);
		System.out.println("Interest rate is "+BankAccount.interest);
		System.out.println("Account NUmber is "+this.accountNumber);
		System.out.println("Account NUmber is "+this.balanceTotal);
	}
}
