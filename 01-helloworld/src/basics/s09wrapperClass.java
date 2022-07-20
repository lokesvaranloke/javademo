package basics;

public class s09wrapperClass {

	public static void main(String[] args) {
		
		int y = 1;
		// auto boxing -> primitive int type to integer object
		Integer x = 2;
		
		Integer z = new Integer(5);
		//unboxing -> integer object type to primitive int
		int myint = z; //automatically converting without casting
		myint = z.intValue(); //convert explicit from wrapper to primitive
		
		short yshort = 3245;
		Short newshort = yshort;
		

	}

}