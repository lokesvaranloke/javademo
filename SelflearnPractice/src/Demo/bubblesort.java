package Demo;

public class bubblesort {
	
	void print(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	void bsort(int[] a) {
		for(int i=1;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		
		int[] a= {35,10,31,11,26};
		
		bubblesort b = new bubblesort();
		System.out.println("Before bubblesort");
		b.print(a);
		System.out.println("\nAfter bubblesort");
		b.bsort(a);
		b.print(a);
	}
}
