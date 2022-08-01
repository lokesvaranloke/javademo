package Lists;

import java.util.ArrayList;

public class arraylistdemo1 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add("Hello");
		list.add("Sam");
		list.add(30.45);
		list.add(12.8);
		System.out.println(list);
		
		ArrayList<Integer> myList = new ArrayList<>();
		//myList.add(50) here we are sending primitive type 50 and jvm will automatically
		//assign it as Integer Object
		myList.add(50);
		myList.add(60);
		//this is the proper Integer object to assign
		myList.add(new Integer(70));
		System.out.println(myList);
		
		ArrayList<String> mystring = new ArrayList<>();
		mystring.add("Lulu");
		mystring.add("World");
		System.out.println(mystring);
		
		ArrayList list1 = new ArrayList();
		for(int i=0;i<100;i+=10) {
			list1.add(i);
		}
		System.out.println(list1);
		
		list1.add(7);
		System.out.println(list1);
		
		list1.add(2,9);
		System.out.println(list1);
		
		list1.add(6, 500);
		System.out.println(list1);
		
		ArrayList<Object> list2 = new ArrayList<>();
		list2.add(10);
		list2.add(20);
		list2.add("Hello");
		list2.add("Sam");
		list2.add(30.45);
		list2.add(12.8);
		System.out.println(list2);
	}
}
