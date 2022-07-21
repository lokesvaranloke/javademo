package throwdemo;

public class throwdemotest {

	public static void main(String[] args) {
		
		throwdemotest obj = new throwdemotest();
		
		try {
			int withdrawamt = 5000;
			System.out.println("Withdraw :"+withdrawamt);
			obj.withdrawfromatm(withdrawamt, 1001);
			System.out.println("Amount Withdrawn");
		} catch (RuntimeException e) {
			System.out.println("Exception occured : "+e.getMessage());
		}
		
	}
	
	void withdrawfromatm(int withdrawamt, int accntnum) {
		int balance = getbalance(accntnum);
		if (withdrawamt > balance) {
			throw new RuntimeException("Insufficient Fund");
		}
	}
	
	int getbalance(int accntnum) {
		return 1000;
	}
}
