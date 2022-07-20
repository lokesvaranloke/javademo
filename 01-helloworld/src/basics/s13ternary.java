package basics;

public class s13ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int age=16;
		boolean candrive=false;
		
		//instead of writing if condition in many lines we can go to ternary
		candrive = (age>18)?true:false;
		
		System.out.println("Can drive ? :" +candrive);
		*/
		//eg2:
		
		int age=19;
		boolean haslicense=false;
		
		boolean candrive = (age>18)?true:false;
		
		boolean canrentcar=candrive ? (haslicense ? true :false) :false;
		
		System.out.println("Age ="+age);
		System.out.println("Has license ="+haslicense);
		System.out.println("Can drive ?"+candrive);
		System.out.println("Can rent car ?"+canrentcar);
		
	}

}