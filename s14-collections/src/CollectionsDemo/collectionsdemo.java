package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collectionsdemo {

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<>();
		l.add("zebra");
		l.add("apple");
		l.add("xerox");
		l.add("mexico");
		l.add("planet");
		l.add("quiz");
		l.add("yak");
		
		System.out.println("Before sort :"+l);
		
		Collections.sort(l);
		
		System.out.println("After sort :"+l);
		
		//Collections.sort(l, new StringLengthComparator());
	}
}
