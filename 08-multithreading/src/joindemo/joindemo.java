package joindemo;

import java.util.Scanner;

public class joindemo  extends Thread{

	private static int n,sum;
	public static void main(String[] args) {
		
		System.out.println("Sum of n numbers");
		System.out.println("Enter a num :");
		Scanner sc = new Scanner(System.in);
		joindemo.n=sc.nextInt();
		
		joindemo jd = new joindemo();
		jd.start();
		//after starting..another thread starts run methods..but our print statement prints the output as zero..bcz after starting first thread then goes to print statement..it is not 
		//waiting for the run method result to come..so wait until result comes we can give join before print statement..so result joins here
		try {
			jd.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Sum of "+joindemo.n+ "= "+joindemo.sum);
		
	}

	public void run() {
		for (int i=1;i<joindemo.n;i++) {
			joindemo.sum += i;
		}
	}
	
}
