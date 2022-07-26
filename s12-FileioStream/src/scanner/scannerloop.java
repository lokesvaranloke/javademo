package scanner;

import java.util.Scanner;

public class scannerloop {

	public static void main(String[] args) {
		
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num :");
		
		while(sc.hasNextInt()) {
			int num = sc.nextInt();
			sum += num;
			System.out.println("Enter a num");
		}
		System.out.println("Sum ="+sum);
	}
}
