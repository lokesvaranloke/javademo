package basics;

public class s04casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i1=10;
		byte b1=12;
		
		System.out.println(i1);
		//converting byte to int
		i1=b1;
		System.out.println(i1);
		
		i1=17;
		b1=9;
		
		System.out.println(b1);
		
		b1=(byte)i1;
		System.out.println(b1);
	}

}