package basics;

public class s07strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//string literal
		String name = "Max joe";
		System.out.println("Name:"+name);
		System.out.println("Length of name:"+name.length());
		
		
		String s2=new String("something");
		System.out.println(s2);
		
		//char array
		char[] c= {'h','e','l','l','o'};
		String s3=new String(c);
		System.out.println(s3);
		
		//byte array
		byte[]b = {65,66,67};
		String s4=new String(b);
		System.out.println(s4);
		
		
	}

}