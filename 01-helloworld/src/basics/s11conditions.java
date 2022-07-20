package basics;

public class s11conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isalien=false;
		
		if(isalien) {
			System.out.println("It is alien");
		}
		if(!isalien) {
			System.out.println("It is not an alien");
		}
		
		String name="max";
		if(name=="max") {
			System.out.println("Correct name");
		}
		
		boolean x=true;
		boolean y=false;
		
		if(x&&y) {
			System.out.println("Both true");
		} else if(x) {
			System.out.println("Only x true");
		}else {
			System.out.println("Only y true");
		}
		
		int a=10;
		int b=5;
		int c=20;
		
		System.out.println("a<b="+(a<b));
		//logical AND -> if a<b is false it wont check 2nd condition
		System.out.println("a<b and a<c ="+(a<b && a<c));
		//bitwise AND -> if a<b is false it will check 2nd condition
		System.out.println("a<b and a<c ="+(a<b & a<c));
		
		
		System.out.println("a<b and a<c ="+(a<b && ++a<c));
		System.out.println("a after logical and ="+a); //res = 10 because if a<b is false then it wont go to end condition
		System.out.println("a<b and a<c ="+(a<b & ++a<c));
		System.out.println("a after bitwise and ="+a); //res = 11 because if a<b is false then it goes to ++a<c so a is incremented
	}

}