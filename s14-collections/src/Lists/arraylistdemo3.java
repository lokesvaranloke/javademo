package Lists;

import java.util.ArrayList;
import java.util.List;

public class arraylistdemo3 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<100;i+=10) {
			list.add(i);
		}
		System.out.println("First : "+list);
		System.out.println("Element at pos 5 : "+list.get(5));
		
		list.remove(5);
		System.out.println("After removing pos 5 : "+list);
		
		list.remove(new Integer(70));
		System.out.println("After removing 70 : "+list);
	}
}
