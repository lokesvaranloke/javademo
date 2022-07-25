package garbage;

public class employee {

int employeeId;
	
	public employee(int id) {
		String tname = Thread.currentThread().getName();
		this.employeeId = id;
		System.out.println(tname + ": Employee created - " + this.employeeId);
	}
	
	@Override
	protected void finalize() throws Throwable {
		String tname = Thread.currentThread().getName();
		System.out.println(tname + ": Employee finalized - " + this.employeeId);
	}
}
