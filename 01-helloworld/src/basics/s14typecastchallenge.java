package basics;

public class s14typecastchallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="12";
		byte mybyte = Byte.parseByte(input);
		System.out.println(mybyte);
		
		int myint = Integer.parseInt(input);
		System.out.println(myint);
		
		Double d=Double.parseDouble(input);
		System.out.println(d);
		
		int i=Integer.valueOf(input);
		System.out.println(i);
		
		//char c = (char)Integer.parseInt(n)
	}

}