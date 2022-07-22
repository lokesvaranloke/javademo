package custom;

public class CustomExceptionTest {

	public static void main(String[] args) {
		
		CustomExceptionTest obj = new CustomExceptionTest();
		
		try {
			int withdrawamt = 5000;
			System.out.println("Withdraw :"+withdrawamt);
			obj.withdrawfromatm(withdrawamt, 1001);
			System.out.println("Amount Withdrawn");
		} catch (InsufficientFundsException e) {
			System.out.println("Exception occured : "+e.getMessage());
		}
		
	}
	
	void withdrawfromatm(int withdrawamt, int accntnum) {
		int balance = getbalance(accntnum);
		if (withdrawamt > balance) {
			throw new InsufficientFundsException("Insufficient Fund in accnt");
		}
	}
	
	int getbalance(int accntnum) {
		return 1000;
	}
}
