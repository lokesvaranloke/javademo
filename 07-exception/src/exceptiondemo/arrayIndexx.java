package exceptiondemo;

public class arrayIndexx {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
		try {
			System.out.println("Length of array :" + a.length);
			System.out.println("Elements are :");
			for (int i = 0; i <=a.length; i++) {
				System.out.print(a[i] + " ");
			}
		} catch (Exception e) {
			System.out.println("\nArray size is 4 only");
		}
		System.out.println("\nElements are printed");

	}

}
