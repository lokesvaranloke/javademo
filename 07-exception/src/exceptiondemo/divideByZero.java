package exceptiondemo;

import java.util.*;

public class divideByZero {

	public static void main(String[] args) {
		
		int a,b,c,d;
		System.out.println("Enter 2 numbers:");
		
		try {
			
			Scanner sc = new Scanner(System.in);
			a=sc.nextInt();
			b=sc.nextInt();
			c=a/b;
			d=a%b;
			System.out.println(a+"/"+b+"="+c+", Rem = "+d);
		} catch(ArithmeticException e) {
			System.out.println("Divition by zero not possible");
		}
		
		
		System.out.println("Other logics");

	}

}
