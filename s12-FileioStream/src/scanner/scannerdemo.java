package scanner;

import java.util.Scanner;

public class scannerdemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name :");
		String name = sc.next();
		System.out.println("Enter age :");
		int age = sc.nextInt();
		System.out.println("Enter phone :");
		int phone = sc.nextInt();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(phone);
		
		}
}
