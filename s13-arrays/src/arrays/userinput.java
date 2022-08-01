package arrays;

import java.util.Scanner;

public class userinput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter no of ele :");
		n=sc.nextInt();
//		int[] a = new int[5];
		String[] a = new String[5];
		for(int i=0;i<n;i++) {
			a[i]=sc.next();
		}
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		
	}
}
