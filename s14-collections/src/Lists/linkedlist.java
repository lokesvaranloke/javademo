package Lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class linkedlist {

	public static void main(String[] args) {
		
		List<Object> ll = new LinkedList<>();
		ll.add(10);
		ll.add(20);
		System.out.println(ll);
		
		Object[] obj = new Object[100000];
		for(int i=0;i<obj.length;i++) {
			obj[i]= new Object();
		}
		
		List<Object> ll1 = new LinkedList<>();
		long start = System.currentTimeMillis();
		for(Object i : obj) {
			ll1.add(obj);
		}
		long end = System.currentTimeMillis();
		System.out.println("Time taken for adding : "+(end-start)+"ms");
		
		List<Object> a = new ArrayList<>();
		start = System.currentTimeMillis();
		for(Object i : obj) {
			a.add(obj);
		}
		end = System.currentTimeMillis();
		System.out.println("Time taken for adding : "+(end-start)+"ms");
	}
}
