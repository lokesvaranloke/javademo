package Lists;

import java.util.ArrayList;
import java.util.List;

public class arraylistdemo2 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<100;i+=10) {
			list.add(i);
		}
		System.out.println("First List : "+list);
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(111);
		list1.add(222);
		list1.add(333);
		System.out.println("Second List : "+list1);
		
		list.addAll(4, list1);
		System.out.println("After adding : "+list);
	}
}
