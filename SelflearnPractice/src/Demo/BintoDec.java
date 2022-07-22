package Demo;

public class BintoDec {
	
	public int convert1(String binary) {
		int con=1;
		int res=0;
		for(int i=1;i<=binary.length();i++) {
			if(binary.charAt(binary.length()-i)=='1') {
				res=res+con;
			} 
			con=con*2;
		}
		return res;
	}

	public static void main(String[] args) {
		
		BintoDec b = new BintoDec();
		System.out.println(b.convert1("10110"));
		//System.out.println(b.convert2("10110"));
	}
}
