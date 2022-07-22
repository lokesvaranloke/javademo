package capsule;

public class BankAccount {

	private String accname;
	private int accnum;
	private int balance;
	
	BankAccount(int balance){
		this.balance = balance;
	}
	
	public void setaccname(String name) {
		this.accname = name;
	}
	public void setaccountNumber(int num) {
		if(num<0) {
			this.accnum=0;
		} else {
			this.accnum=num;
		}
	}
	
	public void withdraw(int amt) {
		this.balance-=amt;
	}
	
	public void deposit(int amt) {
		this.balance+=amt;
	}
	
	void printdetails() {
		System.out.println("accname = "+accname+", accnum = "+accnum+", balance = "+balance);
	}
}
