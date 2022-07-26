package arrays;

public class arraydemo {

	public static void main(String[] args) {
		
		int[] arr1;
		int[] arr2= {10,20,30,40,50};
		int[] arr3 = new int[5];
		
		arr3[0]=11;
		arr3[1]=12;
		arr3[2]=13;
		
		System.out.println("Length of array :"+arr3.length);
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}
		System.out.println();
		
		for(int ele:arr3) {
			System.out.print(ele+" ");
		}
	}
}
